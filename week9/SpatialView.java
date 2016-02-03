import javax.swing.*;
import java.awt.*;
import java.awt.geom.Line2D;
import java.util.Observable;
import java.util.Observer;

/**
 * Created by Vadim on 29/11/2015.
 * Draw spots for the points, and draw a line between any connected points
 */
public class SpatialView extends JPanel implements Observer
{
    private SpatialModel model;

    public SpatialView(SpatialModel model)
    {
        super();
        this.model= model;
    }

    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;

        g2.setColor(Color.black);

        int width = getWidth();
        int height = getHeight();
        g2.clearRect(0,0,width,height);

        // go through list one at a time
        // for each one, create a new Spot and draw it
        for (int i = 0; i < model.getNumberOfPoints(); i++)
        {
            double x = model.getX(i);
            double y = model.getY(i);
            Spot p = new Spot(x*width, y*height, Math.sqrt(width*height)/100.0);
            g2.fill(p);

            for(int j = i + 1; j<model.getNumberOfPoints(); j++)
            {
                if (model.isConnected(i, j))
                {
                    Line2D.Double l = new Line2D.Double(model.getX(i)*width, model.getY(i)*height, model.getX(j)*width,
                            model.getY(j)*height);
                    g2.draw(l);
                }
            }
        }
    }

    public void update(Observable obs, Object obj){repaint();}
}

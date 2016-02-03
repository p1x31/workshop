/**
Panel containing a representation of a spatial network in the form of spots connected with lines
*/

import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Point2D;
import java.awt.geom.Line2D;
import java.util.ArrayList;
import java.util.Observer;
import java.util.Observable;
import java.awt.Color;

public class SpatialView extends JPanel implements Observer
{
    private SpatialModel model;
    
    public SpatialView(SpatialModel model)
    {
        super();
        this.model = model;
    }
    
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D)g;
        
        g2.setColor(Color.BLACK);
        
        int height = getHeight();
        int width = getWidth();
        g2.clearRect(0, 0, width, height);
        
        for (int i = 0; i < model.getNumOfPoints(); i++)
        {
            double x = model.getX(i);
            double y = model.getY(i);
            Spot p = new Spot(x*width, y*height, Math.sqrt(width*height)/100.0);
            g2.fill(p);
            
            for(int j = i + 1; j < model.getNumOfPoints(); j++ )
            {
                if(model.connected(i, j))
                {
                    Line2D.Double l = new Line2D.Double(model.getX(i)*width, model.getY(i)*height, model.getX(j)*width, model.getY(j)*height);
                    g2.draw(l);
                }
            }
        }
    }
    
    public void update(Observable obs, Object obj)
    {
        repaint();
    }
}

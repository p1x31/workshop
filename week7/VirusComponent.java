import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.Color;
import java.awt.Rectangle;
import java.awt.geom.Line2D;
public class VirusComponent extends JComponent
{
    private double[] proportionInfected;
    private int frameSize;
	//comment for q1-3
	private Line2D.Double x_axis;
	private Line2D.Double y_axis;

	/**
	 Create a frame size and proportionInfected array
	 */
	public VirusComponent(double[] proportionInfected,int frameSize)
    {
    	super();

    	this.frameSize= frameSize;
    	this.proportionInfected = proportionInfected;


    }
    public void paintComponent(Graphics g)
	{
	Graphics2D g2 =(Graphics2D)g;
		//q5
	frameSize = getHeight();
	//uncomment for q1-3
	/*for (int i= 0; i < proportionInfected.length; i++)
	{
		Rectangle pixel = new Rectangle((proportionInfected.length/frameSize)*i, 
				frameSize-(int)(proportionInfected[i]*frameSize),2,2);
		g2.setColor(Color.BLACK);
		g2.fill(pixel);
	}*/

		//comment out for q1-3
		x_axis = new Line2D.Double(getWidth()*0.1, frameSize*0.7, getWidth()*0.1, frameSize*0.1);
		y_axis = new Line2D.Double(getWidth()*0.1, frameSize*0.7, getWidth()*0.8, frameSize*0.7);
		g2.draw(x_axis);
		g2.drawString("Time", (int)(getWidth()*0.4),(int)(frameSize*0.8));
		g2.draw(y_axis);
		g2.drawString("Infections", (int)(getWidth()*0.05),(int)(frameSize*0.1));
		for (int i= 0; i < proportionInfected.length; i++)
		{
			//adjust to scale by (int)(getWidth()*0.1
			Rectangle pixel = new Rectangle((proportionInfected.length/frameSize)*i+(int)(getWidth()*0.1),
					(frameSize-(int)(proportionInfected[i]*frameSize))-(int)(frameSize*0.3),2,2);
			g2.setColor(Color.BLACK);
			g2.fill(pixel);
		}

 }
}

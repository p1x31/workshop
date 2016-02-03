import java.awt.Rectangle;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.Color;
import java.awt.geom.Line2D;

public class StreetComponent extends JComponent
{
	private House[] array;
	private Line2D.Double road1;
	private Line2D.Double road2;
	
	
	public StreetComponent(int xCoord, int yCoord,int houseSize,int size)
	{
	//iterate over the array
		super();
		road1 = new Line2D.Double(xCoord, yCoord+2*houseSize, xCoord+2*size*houseSize, yCoord+4*houseSize);
		road2 = new Line2D.Double(xCoord, yCoord+2*houseSize, xCoord+2*size*houseSize, yCoord+5*houseSize);
		this.array = new House[size];
		for(int i = 0; i < size; i++)
		{
			array[i] = new House(xCoord+(i*100), yCoord+(i*10), houseSize);
		}
		
	}
	//Override paint method
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 =(Graphics2D)g;
		for(int i = 0; i< array.length; i++) {
			array[i].draw(g2);
		}
		//g2.rotate(Math.toRadians(-40));
		g2.draw(road1);
		g2.draw(road2);


			// draws the outline
	}
	
}

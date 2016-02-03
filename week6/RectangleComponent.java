import java.awt.Rectangle;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.Color;

public class RectangleComponent extends JComponent
{
	private int xCoord;
	private int yCoord;
	
	public RectangleComponent(int xCoord, int yCoord)
	{
		super();
		this.xCoord = xCoord;
		this.yCoord = yCoord;
	}
	//Override paint method
	public void paintComponent(Graphics g)
	{
		//type cast to graphics
		Graphics2D g2 =(Graphics2D)g;
		
		Rectangle box = new Rectangle(xCoord, yCoord, 200, 100);
		// fills with red
		g2.setColor(Color.RED);
		g2.fill(box);
		// draws the outline
		Color c = new Color(255, 0, 0);
		
		
		g2.drawString("My rectangle", 160, 75);
		
		g2.rotate(Math.toRadians(45));
		g2.setColor(c);
		g2.draw(box);
	}
	
}

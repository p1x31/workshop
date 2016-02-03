import java.awt.geom.Ellipse2D;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.geom.Line2D;

public class Snowman
{
	private Ellipse2D.Double head;
	private Ellipse2D.Double body;
	private Line2D.Double arm1;
	
	public Snowman(int xCoord, int yCoord, int headSize)
	{
		head = new Ellipse2D.Double(xCoord, yCoord, headSize, headSize);
		body = new Ellipse2D.Double(xCoord - headSize, yCoord + headSize, 3*headSize, 3*headSize);
		arm1 = new Line2D.Double(xCoord - headSize, yCoord + 2.5*headSize, xCoord - 2*headSize, yCoord+2.5*headSize);
	}
	
	public void draw(Graphics2D g)
	{
		g.setColor(Color.WHITE);
		g.fill(head);
		g.setColor(Color.BLACK);
		g.draw(head);
		
		g.setColor(Color.WHITE);
		g.fill(body);
		g.setColor(Color.BLACK);
		g.draw(body);
		
		g.setColor(Color.BLACK);
		g.draw(arm1);
	}
}

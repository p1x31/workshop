import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.geom.Line2D;
import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;

public class House
{
	private Line2D.Double roof1;
	private Line2D.Double roof2;
	private Rectangle.Double square;
	private Rectangle.Double door;
	
	public House(int xCoord, int yCoord, int houseSize)
	{
		square = new Rectangle.Double(xCoord, yCoord, 100, 100);
		roof1 = new Line2D.Double(xCoord, yCoord, xCoord+houseSize, yCoord-houseSize);
		roof2 = new Line2D.Double(xCoord+2*houseSize, yCoord, xCoord+houseSize, yCoord-houseSize);
		door = new	Rectangle.Double(xCoord+houseSize,yCoord+houseSize,0.5*houseSize,houseSize);
	}
	public void draw(Graphics2D g)
	{
		g.setColor(Color.BLACK);
		g.draw(roof1);
		g.draw(roof2);
		g.draw(square);
		g.draw(door);
	}
}

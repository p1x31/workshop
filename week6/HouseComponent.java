import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
public class HouseComponent extends JComponent
{
	private House sky;
	
	public HouseComponent(int xCoord, int yCoord, int houseSize)
	{
	//extending JComponent
		super();
		sky = new House(xCoord, yCoord, houseSize);
	}
	
	public void paintComponent(Graphics g)
	{
		
		Graphics2D g2 =(Graphics2D)g;
		
		sky.draw(g2);
		
		// draws the outline
		
		
		
		
	}
}

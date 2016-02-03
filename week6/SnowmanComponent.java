import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
public class SnowmanComponent extends JComponent
{
	private Snowman frosty;
	
	public SnowmanComponent(int xCoord, int yCoord, int headSize)
	{
	//extending JComponent
		super();
		frosty = new Snowman(xCoord, yCoord, headSize);
	}
	
	public void paintComponent(Graphics g)
	{
		
		Graphics2D g2 =(Graphics2D)g;
		
		frosty.draw(g2);
		
		// draws the outline
		
		
		
		
	}
} 

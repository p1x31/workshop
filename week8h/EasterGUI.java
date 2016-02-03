import javax.swing.JFrame;

public class EasterGUI
{
/**
 * EasterGUI contains a main method.
 * Creates an EasterComponent object and a JFrame and puts the component on the frame
 */
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Easter day calculator");
		frame.setSize(400, 250);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Easter easter = new Easter(2000);
		
		EasterComponent panel = new EasterComponent(easter, 1800, 2200,
		2000);
		
		frame.add(panel);
		
		frame.setVisible(true);
	}
}

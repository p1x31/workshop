import javax.swing.JFrame;
public class HouseTest
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame();
		frame.setSize(600, 400);
		frame.setTitle("My Frame");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//RectangleComponent comp = new RectangleComponent(100, 20);
		//HouseComponent comp = new HouseComponent(200, 200, 50);
		//frame.add(comp);
		StreetComponent comp = new StreetComponent(200,200,50,8);
		frame.add(comp);
		frame.setVisible(true);
		
		
	}
}

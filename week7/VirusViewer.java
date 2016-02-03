import javax.swing.JFrame;
public class VirusViewer
{
	public static void main(String[] args)
	{
	Population pop2 = new Population(100, 0.1, 0.25, 0.2, 0.1);
	JFrame frame = new JFrame();
	frame.setSize(300, 300);
	frame.setTitle("Virus infection history");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	double[] proportionInfected = new double[1000];//initialize array of 10000
	int frameSize = 300;
	for(int i = 0; i < 1000; i++)
		{
			pop2.update();
			proportionInfected[i]=pop2.proportionInfected();
		}
	VirusComponent comp = new VirusComponent(proportionInfected,frameSize);
	frame.add(comp);
	frame.setVisible(true);
	}
}

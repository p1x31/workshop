import javax.swing.JFrame;

/**
 * @author mxw596
 * a GUI for mine sweeper
 */
public class MineSweeperGUI {
	
	/**
	 * the main method of this program
	 * @param args the arguments passed while starting
	 */
	public static void main(String args[]){
		JFrame frame = new JFrame("mine sweeper");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800, 600);
		MineComponent comp = new MineComponent();
		frame.add(comp);
		frame.setVisible(true);
	}

}

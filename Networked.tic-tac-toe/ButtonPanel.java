import java.util.Observer;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ButtonPanel extends JPanel
{
	public ButtonPanel(NoughtsCrossesModel model)
	{
		super();
	
		JButton reset = new JButton("Reset");

		reset.addActionListener(e -> model.newGame());

		JButton exit = new JButton("Exit");

		exit.addActionListener(e -> System.exit(0));

		add(reset);
		add(exit);
	}
}

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonListener implements ActionListener
{
	private NoughtsCrossesModel model;
	private int row;
	private int column;

	public ButtonListener(NoughtsCrossesModel model, int row, int column)
	{
		this.model = model;
		this.row = row;
		this.column = column;
	}

	public void actionPerformed(ActionEvent e)
	{
		model.turn(row, column);
	}
}

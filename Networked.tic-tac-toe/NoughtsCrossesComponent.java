import java.awt.BorderLayout;
import javax.swing.JPanel;

public class NoughtsCrossesComponent extends JPanel
{
	public NoughtsCrossesComponent(NoughtsCrossesModel model)
	{
		super();

		ButtonPanel panel = new ButtonPanel(model);

		BoardView view = new BoardView(model);

		model.addObserver(view);

		setLayout(new BorderLayout());

		add(panel, BorderLayout.SOUTH);
		add(view, BorderLayout.CENTER);
	}
}

import java.awt.BorderLayout;

import javax.swing.JPanel;

/**
 * @author mxw596
 * a component that contains the board and buttons in mine sweeper
 */
public class MineComponent extends JPanel{
	
	/**
	 * creates a panel of the board and buttons for mine sweeper
	 */
	public MineComponent(){
		super();
		MineSweeper board = new MineSweeper(10, MineSweeper.EASY);
		MineModel model = new MineModel(board);
		BoardView view = new BoardView(model);
		ControlPanel panel = new ControlPanel(model);
		model.addObserver(view);
		model.addObserver(panel);
		setLayout(new BorderLayout());
		add(view, BorderLayout.CENTER);
		add(panel, BorderLayout.SOUTH);
	}

}

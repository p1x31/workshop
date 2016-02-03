import java.util.Observable;
import java.util.Observer;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 * @author mxw596
 * a panel of controls for the user while playing mine sweeper
 */
public class ControlPanel extends JPanel implements Observer{
	
	private int difficulty = 10;
	private MineModel model;
	private JRadioButton easy = new JRadioButton("easy"), normal = new JRadioButton("normal"), hard = new JRadioButton("hard");
	
	/**
	 * creates all the buttons to go on the panel
	 * @param model the model these buttons will act on
	 */
	public ControlPanel(MineModel model){
		super();
		this.model = model;
		JButton exit = new JButton("exit"), newGame = new JButton("new game"), revealMines = new JButton("reveal");
		easy.addActionListener(e -> setDifficulty(MineSweeper.EASY));
		normal.addActionListener(e -> setDifficulty(MineSweeper.NORMAL));
		hard.addActionListener(e -> setDifficulty(MineSweeper.HARD));
		exit.addActionListener(e -> System.exit(0));
		newGame.addActionListener(e -> model.newGame(10, difficulty));
		revealMines.addActionListener(e -> reveal());
		add(newGame);
		add(exit);
		add(revealMines);
		add(easy);
		add(normal);
		add(hard);
	}
	
	/**
	 * sets the difficulty to the selected radio button
	 * @param difficulty the new difficulty
	 */
	private void setDifficulty(int difficulty){
		this.difficulty = difficulty;
		if(difficulty == MineSweeper.EASY){
			normal.setSelected(false);
			hard.setSelected(false);
		}else if(difficulty == MineSweeper.NORMAL){
			easy.setSelected(false);
			hard.setSelected(false);
		}else if(difficulty == MineSweeper.HARD){
			easy.setSelected(false);
			normal.setSelected(false);
		}
	}
	
	/**
	 * called when the reveal button is clicked, tells the model to reveal the grid
	 */
	private void reveal(){
		model.setReveal(true);
		model.update();
	}

	/* (non-Javadoc)
	 * @see java.util.Observer#update(java.util.Observable, java.lang.Object)
	 */
	@Override
	public void update(Observable obs, Object obj) {
		repaint();
	}

}

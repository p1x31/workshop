import java.awt.*;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JButton;
import javax.swing.JPanel;

/**
 * @author mxw596
 * views the state of the minesweeper board
 */
public class BoardView extends JPanel implements Observer{
	
	private MineModel model;
	private JButton[][] squares;
	private boolean lost = false;
	
	/**
	 * initialises the buttons 
	 * @param model the model this class observes
	 */
	public BoardView(MineModel model){
		super();
		this.model = model;
		squares = new JButton[model.getBoardSize()][model.getBoardSize()];
		setLayout(new GridLayout(model.getBoardSize(), model.getBoardSize()));
		for(int i = 0; i < model.getBoardSize(); i++){
			for(int j = 0; j < model.getBoardSize(); j++){
				squares[i][j] = new JButton();
				final int x = i, y = j;
				squares[i][j].addActionListener(e -> disableSquare(x, y));
				add(squares[i][j]);

			}
		}
	}
	
	/**
	 * disables a square at the given location and updates the model
	 * @param x the x coord of the button
	 * @param y the y coord of the button
	 */
	private void disableSquare(int x, int y){
		squares[x][y].setEnabled(false);
		if(model.hasLost(x + 1, y + 1)){
			lost = true;
		}
		model.update();
	}

	/* (non-Javadoc)
	 * @see java.util.Observer#update(java.util.Observable, java.lang.Object)
	 */
	@Override
	public void update(Observable obs, Object obj) {
		for(int i = 0; i < model.getBoardSize(); i++){
			for(int j = 0; j < model.getBoardSize(); j++){
				if(!squares[i][j].isEnabled()){
					squares[i][j].setText("" + model.getSquare(i + 1, j + 1));
				}
				if(model.isReveal() || lost){
					squares[i][j].setEnabled(false);
					squares[i][j].setText("" + model.getSquare(i + 1, j + 1));
					
				}
				if(model.isNewGame()){
					squares[i][j].setEnabled(true);
					squares[i][j].setText("");
				}
			}
		}
		model.setReveal(false);
		model.setNewGame(false);;
		lost = false;
		repaint();
	}

}

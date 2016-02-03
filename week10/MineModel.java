import java.util.Observable;

/**
 * @author mxw596
 * models the minesweeper game
 */
public class MineModel extends Observable{
	
	private MineSweeper board;
	private boolean newGame = false, reveal = false;
	
	/**
	 * initialises the board
	 * @param board
	 */
	public MineModel(MineSweeper board){
		super();
		this.board = board;
	}
	
	/**
	 * updates the screen by calling setChnaged() and notifyObservers()
	 */
	public void update(){
		setChanged();
		notifyObservers();
	}
	
	/**
	 * gets the size of the board
	 * @return the board size
	 */
	public int getBoardSize(){
		return board.getBoardSize();
	}
	
	/**
	 * gets the int value of a square
	 * @param i the i index of the square
	 * @param j the j index of the square
	 * @return the int value of the square
	 */
	public int getSquare(int i, int j){
		return board.getSquare(i, j);
	}
	
	public boolean hasLost(int i, int j){
		return board.getSquare(i, j) == -1;
	}
	
	/**
	 * checks if a new game is meant to be set up
	 * @return a boolean value representing whether the user wants to start a new game
	 */
	public boolean isNewGame(){
		return newGame;
	}
	
	/**
	 * sets that the user wants to play a new game 
	 * does not call setChanged or notifyObservers as it is used in BoardView's update method
	 * @param newGame true if the user wants a new game, false if they don't
	 */
	public void setNewGame(boolean newGame){
		this.newGame = newGame;
	}
	
	/**
	 * Checks if the user wishes to reveal the grid
	 * @return a boolean value representing whether to reveal or not
	 */
	public boolean isReveal(){
		return reveal;
	}
	
	/**
	 * sets the value of reveal
	 * does not call setChanged or notifyObservers as it is used in BoardView's update method
	 * @param reveal the new value of reveal
	 */
	public void setReveal(boolean reveal){
		this.reveal = reveal;
	}
	
	/**
	 * starts a new game
	 * @param boardSize the new size of the board
	 * @param numOfMines the new number of mines
	 */
	public void newGame(int boardSize, int numOfMines){
		board.newGame(boardSize, numOfMines);
		newGame = true;
		setChanged();
		notifyObservers();
	}

}

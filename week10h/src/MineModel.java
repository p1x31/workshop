import java.util.Observable;

/**
 * Created by Vadim on 05/12/2015.
 */
public class MineModel extends Observable {

    private MineSweeper gameBoard;
    private boolean newGame = false, reveal = false;

    /**
     * initialises the board
     * @param gameBoard 2D Array that is ready to call the game board from Game class
     */
    public MineModel(MineSweeper gameBoard){
        super();
        this.gameBoard = gameBoard;
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
        return gameBoard.getBoardSize();
    }

    /**
     * gets the number at a particular square
     * @param row the row index of the square
     * @param col the column index of the square
     * @return an integer representing how many bombs are nearby
     */
    public int getSquare(int row, int col){
        return gameBoard.getSquare(row, col);
    }
    /**
     * Determine if the player has lost
     */
    public boolean hasLost(int i, int j){
        return gameBoard.getSquare(i, j) == -1;
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
     * @param reveal the new value of reveal
     */
    public void setReveal(boolean reveal){
        this.reveal = reveal;
    }

    /**
     * starts a new game
     * @param boardSize - the number of both rows and columns
     * @param totalBombs - number of total bombs
     */
    public void newGame(int boardSize, int totalBombs){
        gameBoard.newGame(boardSize, totalBombs);
        newGame = true;
        setChanged();
        notifyObservers();
    }
}

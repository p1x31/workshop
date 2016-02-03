import java.util.Random;

/**
 * @author mxw596
 * represents the game minesweeper
 */
public class MineSweeper {
	
	private int[][] board;
	private int boardSize;
	public static final int EASY = 10;
	public static final int NORMAL = 15;
	public static final int HARD = 20;
	
	
	/**
	 * creates the initial board
	 * @param boardSize the size of the board
	 * @param numOfMines the number of hidden mines
	 */
	public MineSweeper(int boardSize, int numOfMines){
		newGame(boardSize, numOfMines);
		this.boardSize = boardSize;
	}
	
	/**
	 * gets the size of the board
	 * @return the board size
	 */
	public int getBoardSize(){
		return boardSize;
	}
	
	/**
	 * gets the number at a particular square
	 * @param i the i index of the square
	 * @param j the j index of the square
	 * @return an integer representing how many bombs are nearby
	 */
	public int getSquare(int i, int j){
		return board[i][j];
	}
	
	/**
	 * creates a new mine sweeper game
	 * @param boardSize the size of the board
	 * @param numOfMines the number of mines
	 */
	public void newGame(int boardSize, int numOfMines){
		board = new int[boardSize + 2][boardSize + 2];
		Random random = new Random();
		int count = 0;
		while(count < numOfMines){
			int i = random.nextInt(boardSize) + 1;
			int j = random.nextInt(boardSize) + 1;
			if(board[i][j] != -1){
				board[i][j] = -1;
				count ++;
			}
		}
		for(int i = 1; i < boardSize + 1; i++){
			for(int j = 1; j < boardSize + 1; j++){
				board[i][j] = countMines(i, j);
			}
		}
	}
	
	/**
	 * counts the number of mines that are near to a particular square
	 * @param x the x coord of the square
	 * @param y the y coord of the square
	 * @return the number of mines nearby
	 */
	private int countMines(int x, int y){
		int count = -1;
		if(board[x][y] != -1){
			count = 0;
			for(int i = -1; i < 2; i++){
				for(int j = -1; j < 2; j++){
					if(board[x + i][y + j] == -1){
						count ++;
					}
				}
			}
		}
		return count;
	}

}

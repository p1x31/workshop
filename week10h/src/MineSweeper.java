import java.util.Random;

/**
 * Created by Vadim on 05/12/2015.
 * Represent minesweeper game
 */
public class MineSweeper {

    private int boardSize;
    public static final int EASY = 10;
    public static final int NORMAL = 15;
    public static final int HARD = 20;
    private int[][] board;

   /**
    Constructor installs all of the GUI components
    the game board to be called by the main method.
    @param boardSize - the number of both rows and columns
    @param totalBombs - number of total bombs
    */
   public MineSweeper(int boardSize, int totalBombs){
       newGame(boardSize, totalBombs);
       this.boardSize = boardSize;
   }

    /**
     * get given board size
     * @return the board size
     */
    public int getBoardSize() {
        return boardSize;
    }
    /**
     * creates a new mine sweeper game
     * @param boardSize - the number of both rows and columns
     * @param totalBombs - number of total bombs
     */
    public void newGame(int boardSize, int totalBombs){
        board = new int[boardSize + 2][boardSize + 2];
        Random random = new Random();
        int count = 0;
        while(count < totalBombs){
            int row = random.nextInt(boardSize) + 1;
            int col = random.nextInt(boardSize) + 1;
            if(board[row][col] != -1){
                board[row][col] = -1;
                count ++;
            }
        }
        for(int row = 1; row < boardSize + 1; row++){
            for(int col = 1; col < boardSize + 1; col++){
                board[row][col] = generateClues(row, col);
            }
        }
    }
    /**
     * Count the number of mines bordering to square
     * @param row Integer for use of all rows
     * @param col Integer for use of all columns
     * @return an integer representing how many bombs are nearby
     */
    private int generateClues(int row, int col){
        int count = -1;
        if(board[row][col] != -1){
            count = 0;
            for(int i = -1; i < 2; i++){
                for(int j = -1; j < 2; j++){
                    if(board[row + i][col + j] == -1)
                    {
                        count ++;
                    }
                }
            }
        }
        return count;
    }
    /**
     * gets the number at a particular square
     * @param row the row index of the square
     * @param col the column index of the square
     * @return an integer representing how many bombs are nearby
     */
    public int getSquare(int row, int col) {
        return board[row][col];
    }

}

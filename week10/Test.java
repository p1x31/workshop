import java.util.Random;

/**
 * used for testing question 1
 */
public class Test {
	
	/**
	 * the main method for this test
	 * @param args the arguments passed to this program
	 */
	public static void main(String args[]){
		MineSweeper board = new MineSweeper(10, MineSweeper.EASY);
		MineModel model = new MineModel(board);
		model.newGame(10, MineSweeper.EASY);
		for(int i = 1; i < 11; i++){
			for(int j = 1; j < 11; j++){
				System.out.print("[" + model.getSquare(i, j) + "]");
			}
			System.out.println();
			Random generator = new Random();

			while(generator.nextDouble() < 0.8)

				System.out.println("looping");
		}
	}

}

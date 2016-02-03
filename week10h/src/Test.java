/**
 * Created by Vadim on 05/12/2015.
 */
public class Test {
    public static void main(String args[]){
        MineSweeper board = new MineSweeper(15, MineSweeper.NORMAL);
        MineModel model = new MineModel(board);
        model.newGame(15, MineSweeper.NORMAL);
        for(int i = 1; i < 16; i++){
            for(int j = 1; j < 16; j++){
                System.out.print(" " + model.getSquare(i, j) +" ");
            }
            System.out.println();
        }
    }

}

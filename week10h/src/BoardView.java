import javax.swing.*;
import java.awt.*;
import java.util.Observable;
import java.util.Observer;

/**
 * Created by Vadim on 06/12/2015.
 * display the game, and respond when the player clicking the squares
 */
public class BoardView extends JPanel implements Observer {

    private MineModel model;
    /** 2D Array of buttons for GUI board */
    private JButton[][] field;
    private boolean flag = false;

    /**
     * initialises the buttons
     * @param model the model that this class observes
     */
    public BoardView(MineModel model){
        super();
        this.model = model;
        field = new JButton[model.getBoardSize()][model.getBoardSize()];
        setLayout(new GridLayout(model.getBoardSize(), model.getBoardSize()));
        for(int row = 0; row < model.getBoardSize(); row++){
            for(int col = 0; col < model.getBoardSize(); col++){
                field[row][col] = new JButton();
                final int i = row, j = col;
                field[row][col].addActionListener(e -> markSquare(i, j));
                add(field[row][col]);
            }
        }
    }

    /**
     * mark a field at the given location and updates the model
     * @param i the i(row) index of the button
     * @param j the j(col) index of the button
     */
    private void markSquare(int i, int j){
        field[i][j].setEnabled(false);
        if(model.hasLost(i + 1, j + 1)){
            flag = true;
        }
        model.update();
    }

    public void update(Observable obs, Object obj) {
        for(int col = 0; col < model.getBoardSize(); col++){
            for(int row = 0; row < model.getBoardSize(); row++){
                if(!field[col][row].isEnabled()){
                    field[col][row].setText("" + model.getSquare(col + 1, row + 1));
                }
                if(model.isReveal() || flag){
                    field[col][row].setEnabled(false);
                    field[col][row].setText("" + model.getSquare(col + 1, row + 1));
                }
                if(model.isNewGame()){
                    field[col][row].setEnabled(true);
                    field[col][row].setText("");
                }
            }
        }
        model.setReveal(false);
        model.setNewGame(false);;
        flag = false;
        repaint();
    }

}

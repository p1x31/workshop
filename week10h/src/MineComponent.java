import javax.swing.*;
import java.awt.*;

/**
 * Created by Vadim on 06/12/2015.
 */
public class MineComponent extends JPanel {
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

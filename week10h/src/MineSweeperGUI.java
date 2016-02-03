import javax.swing.*;
/**
 * Created by Vadim on 06/12/2015.
 */
public class MineSweeperGUI {
    /**
     * the main method of the program
     * initialize GUI
     */
    public static void main(String args[]){
        JFrame frame = new JFrame("mine sweeper");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(900, 600);
        MineComponent comp = new MineComponent();
        frame.add(comp);
        frame.setVisible(true);
    }
}

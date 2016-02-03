/**
Panel containing two buttons to close the GUI and reset the initial treshold and number of nodes in the network
*/
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observer;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class ButtonPanel extends JPanel 
{
    public ButtonPanel(final SpatialModel model, final int initial, final int value)
    {
       super();
           
       JButton reset = new JButton("Reset");
       
       reset.addActionListener(new ActionListener()
       {
           public void actionPerformed(ActionEvent e)
           {

               System.out.println(value);
               model.setTreshold((double)initial/100.0);
               model.setNumOfPoints(value);
           }
       }
       );
       
       JButton exit = new JButton("Exit");
       
       exit.addActionListener(new ActionListener()
       {
           public void actionPerformed(ActionEvent e)
           {
               System.exit(0);
           }
       }
       );
       
       add(reset);
       add(exit);
    }
}

/**
Panel containing two buttons to close the program and reset its original threshold and number of points in the network
*/

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

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
               model.setThreshold((double)initial/100.0);
               model.setNumberOfPoints(value);
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

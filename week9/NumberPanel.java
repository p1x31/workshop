/**
Panel containing a slider and a label; slider change the number of points in the network
*/
import java.awt.Dimension;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JLabel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class NumberPanel extends JPanel implements Observer
{
    
    final private SpatialModel model;
    final private JSlider slider;
    
    public NumberPanel(final SpatialModel model, int min, int max, int initial)
    {
        super();
        
        this.model = model;
        this.slider = new JSlider(min, max, initial);
        slider.setPaintTicks(true);
        slider.setMajorTickSpacing((max - min) / 10);
        slider.setPaintLabels(true);
        slider.setLabelTable(slider.createStandardLabels((max - min)/10));
        slider.setPreferredSize(new Dimension(370, 50));
        
        slider.addChangeListener(new ChangeListener()
        {
            public void stateChanged(ChangeEvent e)
            {
                int v = slider.getValue();
                model.setNumberOfPoints(v);
            }
        }
        );
        
        JLabel label = new JLabel("Number of nodes");
        
        add(label);
        add(slider);
    }
    
    public void update(Observable obs, Object obj)
    {
        slider.setValue(model.getNumberOfPoints());
    }
}

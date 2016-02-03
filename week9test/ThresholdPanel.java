
import java.awt.Dimension;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JLabel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class ThresholdPanel extends JPanel implements Observer
{
    final private JSlider slider;
    final SpatialModel model;
    public ThresholdPanel(final SpatialModel model, int min, int max, int initial)
    {
        super();
        this.model = model;
        this.slider = new JSlider(min, max, initial);
        slider.setPaintTicks(true);
        slider.setMajorTickSpacing((max - min) / 10);
        slider.setPaintLabels(true);
        slider.setLabelTable(slider.createStandardLabels((max - min)/10));
        slider.setPreferredSize(new Dimension(400, 45));
        
        slider.addChangeListener(new ChangeListener()
        {
            public void stateChanged(ChangeEvent e)
            {
                int v = slider.getValue();
                model.setThreshold((double)v/100.0);
            }
        }
        );
        
        JLabel label = new JLabel("Threshold");
        
        add(label);
        add(slider);
    }
    
    public void update(Observable obs, Object obj)
    {
        slider.setValue((int) (model.getThreshold() * 100));
    }
}

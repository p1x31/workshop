import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.plaf.DimensionUIResource;
import java.awt.*;
import java.util.Observable;
import java.util.Observer;

/**
 * Created by Vadim on 29/11/2015.
 * Containing a slider and a label describing what it does
 */
public class ThresholdPanel extends JPanel implements Observer
{
    //cannot be changed
    final private JSlider slider;
    final SpatialModel model;

    public ThresholdPanel(final SpatialModel model, int min, int max, int initial)
    {
        super();
        //create model
        this.model = model;
        this.slider = new JSlider(min, max, initial);
        slider.setPaintLabels(true);
        slider.setLabelTable(slider.createStandardLabels((max-min)/10));
        slider.setMajorTickSpacing((max-min)/10);
        slider.setPaintTicks(true);
        slider.setPreferredSize(new Dimension(400,45));
        //Anonymous inner class -> notation
        // create controls & listeners
        slider.addChangeListener(e -> model.setThreshold(slider.getValue() / 100.0));
      /*  slider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int v = slider.getValue();
                model.setThreshold((double)v/100.0);
            }
        });*/
        JLabel label = new JLabel("Threshold");

        add(label);
        add(slider);
    }
    public void update (Observable obs, Object obj)
    {
        slider.setValue((int)(model.getThreshold()*100));
    }
}


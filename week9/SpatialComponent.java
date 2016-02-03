import javax.swing.*;
import java.awt.*;

/**
 * Created by Vadim on 29/11/2015.
 * Contain the SpatialView and the ThresholdPanel to be displayed
 */
public class SpatialComponent extends JPanel{
    public SpatialComponent(SpatialNetwork network, int min, int max, int initial, int value)
    {
        super();
        final SpatialModel model = new SpatialModel(network);

        SpatialView view = new SpatialView(model);

        ThresholdPanel thresholdPanel = new ThresholdPanel(model,min, max, initial);
        NumberPanel numPanel = new NumberPanel(model, min*2, max*2, value);
        ButtonPanel buttonPanel = new ButtonPanel(model, initial, value);


        model.addObserver(view);
        model.addObserver(numPanel);
        model.addObserver(thresholdPanel);

        // put views and controls on panel
        setLayout(new BorderLayout());
        add(numPanel, BorderLayout.NORTH);
        add(thresholdPanel, BorderLayout.SOUTH);
        add(view, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.EAST);
    }
}

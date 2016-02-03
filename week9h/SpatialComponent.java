/**
Component containing all the panels to be displayed
*/

import java.awt.BorderLayout;
import javax.swing.JPanel;

public class SpatialComponent extends JPanel
{
    public SpatialComponent(SpatialNetwork net, int min, int max, int initialT, int valueN)
    {
        super();
        final SpatialModel model = new SpatialModel(net);
        
        SpatialView view = new SpatialView(model);
        
        TresholdPanel panelT = new TresholdPanel(model, min, max, initialT);
        NumberPanel panelN = new NumberPanel(model, min * 2, max * 2, valueN);
        ButtonPanel panelB = new ButtonPanel(model, initialT, valueN);
        
        model.addObserver(view);
        model.addObserver(panelN);
        model.addObserver(panelT);
        
        setLayout(new BorderLayout());
        add(panelN, BorderLayout.NORTH);
        add(panelT, BorderLayout.SOUTH);
        add(view, BorderLayout.CENTER);
        add(panelB, BorderLayout.EAST);
        
    }
}

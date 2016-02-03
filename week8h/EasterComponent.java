import javax.swing.JPanel;
import javax.swing.JSlider;

public class EasterComponent extends JPanel
{
	//Creates a horizontal slider with the specified minimum and maximum values. The third int argument, when present,
	// specifies the slider's initial value.
	public EasterComponent(Easter easter, int min, int max, int initial)
	{
		super();
		
		// model 
		EasterModel model = new EasterModel(easter);
		
		// views
		EasterView year = new EasterView(model);

		// make views observe model
		model.addObserver(year);

		// create control
		JSlider slider = new JSlider(min, max, initial);
		slider.setPaintTicks(true);
		slider.setMajorTickSpacing((max - min)/4);
		slider.setPaintLabels(true);
		slider.setLabelTable(slider.createStandardLabels((max-min)/4));
		
		// create listener
		SliderListener listen = new SliderListener(model, slider);
		
		// make listeners listen to controls
		slider.addChangeListener(listen);
		
		// place views and controls on panel
		add(slider);
		add(year);

	}
}
		
		
		
		
		
		

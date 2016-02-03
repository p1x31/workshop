import javax.swing.event.*;
import javax.swing.JSlider;

/**
 Slider listener responds to the user moving a
 slider
 */
public class SliderListener implements ChangeListener
{

	private EasterModel model;
	private JSlider slider;
	/**
	 Initialise listener with model
	 @param model the underlying slider model
	 @param slider creates the JSlider component
	 */
	public SliderListener(EasterModel model, JSlider slider)
	{
		this.model = model;
		this.slider = slider;
	}
	/**
	 Called when the listened-to component changes state.
	 */
	public void stateChanged(ChangeEvent e)
	{
		int value = slider.getValue();
		model.setYear(value);
	}
}

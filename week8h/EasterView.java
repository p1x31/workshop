import javax.swing.JLabel;
import java.util.Observer;
import java.util.Observable;

/**
Text view of easter date
*/
public class EasterView extends JLabel implements Observer
{
	private EasterModel model;
	
	/**
	Initialise view with model
	@param model the underlying easter model
	*/
	public EasterView(EasterModel model)
	{
		super();
		this.model = model;
		
		int value = model.getYear();
		int day = model.getDay();
		//convert int model.getMonth() ("month") to string
		String month;
		switch (model.getMonth()) {
			case 1:
				month = "January ";
				break;
			case 2:
				month = "February ";
				break;
			case 3:
				month = "March ";
				break;
			case 4:
				month = "April ";
				break;
			case 5:
				month = "May ";
				break;
			case 6:
				month = "June ";
				break;
			case 7:
				month = "July ";
				break;
			case 8:
				month = "August ";
				break;
			case 9:
				month = "September ";
				break;
			case 10:
				month = "October ";
				break;
			case 11:
				month = "November ";
				break;
			case 12:
				month = "December ";
				break;
			default:
				month = "error";
		}
		setText("In the year " + value + " Easter was on " + day + " " + month);
	}

	public void update(Observable obs, Object obj)
	{
		int value = model.getYear();
		int day = model.getDay();
		String month;
		switch (model.getMonth()) {
			case 1:
				month = "January ";
				break;
			case 2:
				month = "February ";
				break;
			case 3:
				month = "March ";
				break;
			case 4:
				month = "April ";
				break;
			case 5:
				month = "May ";
				break;
			case 6:
				month = "June ";
				break;
			case 7:
				month = "July ";
				break;
			case 8:
				month = "August ";
				break;
			case 9:
				month = "September ";
				break;
			case 10:
				month = "October ";
				break;
			case 11:
				month = "November ";
				break;
			case 12:
				month = "December ";
				break;
			default:
				month = "error";
		}
		setText("In the year " + value + " Easter was on " + day + " " + month);
	}
}
	
	
	
	
	
	
	

import java.util.Observable;

/**
Model of easter class
 hold what program needs, extends observable from utility library
*/
public class EasterModel extends Observable
{
	private Easter easter;
	/**
	 * @param easter  Easter object as a field
	 */
	public EasterModel(Easter easter)
	{
		super();
		this.easter = easter;
	}

	/**
	 Easter date
	 @return Easter date
	 */
	public int getDay()
	{
		return easter.getDay();
	}

	/**
	 Easter month
	 @return Easter month
	 */
	public int getMonth()
	{
		return easter.getMonth();
	}

	/**
	Get the easter year
	@return easter year
	*/
	public int getYear()
	{
		return easter.getYear();
	}

	/**
	Change the easter year
	 must notify any
	 observers when a change is made
	@param year the new easter year
	*/
	public void setYear(int year)
	{
		easter.setYear(year);
		setChanged();
		notifyObservers();
	}
}
	
	
	
	
	
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	

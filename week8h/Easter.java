
/**
Program takes in the year as an argument and calculate the day and month using the Anonymous
Gregorian Algorithm
*/

public class Easter
{
	private int day;
	private int month;
	private int year;

	/**
	Construct Easter with year as an argument and calculate the day and month
	*/
	public Easter(int year)
	{
		setYear(year);	
	}
	
	/**
	Easter date
	@return Easter date
	*/
	public int getDay()
	{
		return day;
	}
	
	/**
	Easter month
	@return Easter month
	*/
	public int getMonth()
	{
		return month;
	}

	/**
	 * Easter year
	 * @return Easter year
	 */
	public int getYear() {
		return year;
	}

	/**
	change Easter year
	@param year new Easter year
	*/
	public void setYear(int year)
	{
		this.year = year;
			
		int a = year % 19;
		int b = year / 100;
		int c = year % 100;
		int d = b / 4;
		int e = b % 4;
		int f = (b + 8) / 25;
		int g = (b - f + 1) / 3;
		int h = (19 * a + b - d - g + 15) % 30;
		int i = c / 4;
		int k = c % 4;
		int l = (32 + 2 * e + 2 * i - h - k) % 7;
		int m = (a + 11 * h + 22 * l) / 451;
		int n = (h + l - 7 * m + 114) / 31;
		int p = (h + l - 7 * m + 114) % 31;

		this.month = n;
		this.day = p + 1;	
	}
}

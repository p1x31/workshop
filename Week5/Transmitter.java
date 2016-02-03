/**
Represents the location and power of a mobile phone transmitter 
*/
public class Transmitter
{
	//attributes 
	private double xCoord;
	private double yCoord;
	private double power;
	private final double limit = 1.0;
	/**
	Create a new transmitter at a give location with given power
	@param xCoord The x coordinate
	@param yCoord The y coordinate
	@param power The power of the transmitter
	*/
	public Transmitter(double xCoord,double yCoord,double power)
	{
		this.xCoord = xCoord;
		this.yCoord = yCoord;
		this.power = power;
	}
	public Transmitter(double power)
	{
		this.power = power;
	}
	
	//toString
	public String toString()
	{
		return "Transmitter located at " + xCoord + " " + yCoord;
	}
	/**
	Find the signal strength of a mobile phone 
	@param x The x coordinate of the phone
	@param y The y coordinate of the phone
	@return The signal strength at  the location
	*/
	public double getSignal(double x, double y)
	{
		double distance = Math.sqrt((xCoord-x)*(xCoord - x)+(yCoord - y)*(yCoord - y));
		
		if (distance < limit)
		{
			return power;
		}
		else
		{
		return power/ (distance * distance);
		}
	}
}

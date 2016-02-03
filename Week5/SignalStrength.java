/**
Assess the signal strength across map
*/

public class SignalStrength
{
	private Network net;
	private double[][] signal;
	private int range;
	/**
	Store signal strength of network.
	@param net The network
	@param range The maximum value of the location coordinates.
	*/
	public SignalStrength(Network net, int range)
	{
		this.net = net;
		this.range = range;
		signal = new double [range][range];
		for (int i = 0; i < range; i++)
		{
			for (int j = 0; j < range; j++)
			{
				signal[i][j]= net.getSignal(i,j);
			}
		}
	}
	
	/**
	Average signal strength
	@return The average signal strength
	*/
	public double averageSignal()
	{
		double  count = 0.0;
		for (int i = 0; i < range; i++)
		{
			for(int j = 0; j < range; j++)
			{
				count = count + signal[i][j];
			}
		}
		
		return count / (range * range);
	}
}


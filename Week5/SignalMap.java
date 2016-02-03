/**
Represents whether or not a particular area has a poor signal
*/
public class SignalMap
{
	private Network net;
	private boolean[][] map;
	private double threshold;
	private int size;
	/**
	Show a map whether or not a particular area has a poor signal
	@param net The network
	@param size The size of the map and the network
	@param threshold Threshold determines whether the signal is poor
	*/
	public SignalMap(Network net, int size, double threshold)
	{
		this.threshold = threshold;
		this.size = size;
		this.net = net;	
		map = new boolean[size][size];
		for (int i = 0; i < size; i++)
		{
			for (int j = 0; j < size; j++)
			{
				if (net.getSignal(i,j) < threshold)
				{
					map[i][j]=true;
				}
				else
				{
				map[i][j]=false;
				}

			}
		}
	}
	
	
	public void display()
	{
		for (int i = 0; i < size; i++)
		{
			for (int j = 0; j < size; j++)
			{ 
				if (map[i][j])
				{
					System.out.print("X");
				}
				else
				{
				System.out.print(" ");
				}
			}
			System.out.println("");
			
		}		
	}
	/**
	Find proportion poor signal
	@return Proportion of the map which has a poor signal 
	*/
	
	public double poorSignal()
	{
	int count=0;
	for (int i = 0; i < size; i++)
		{
			for (int j = 0; j < size; j++)
			{ 
				if (map[i][j])
				{ 
				count++;
				}
			}
		}
		//2D array as a matrix, you can simply get z.length and z[0].length
		return (double) count/(map.length*map[0].length);
	}



	/**
	transmitter in the network contributes most to the coverage
	 @return The most important transmitter
	*/

	/*public Transmitter important(Network net)
	{
		double lowestSignal = poorSignal();
		Transmitter important = net.getTransmitter(0);
		for (int i = 0; i < net.size(); i++)
		{

			Transmitter ttemp = net.getTransmitter(i);
			//set transmitter power to 0
			net.setTransmitter(i, new Transmitter(0.0, 0.0, 0.0));
			// compare poor signals
			double currentSignal = poorSignal();
			if(lowestSignal > currentSignal)
			{
				lowestSignal = currentSignal;
				important = ttemp;
			}
			net.setTransmitter(i,ttemp);
		}
	//remove one, calculate the value store
		//remove another one calculate the value store
		//show max

		return important;
	}*/
/*	public Transmitter important(){
		Transmitter important = net.getTransmitter(0);

		double temp = 0.0;
		double lowestSignal = 999999999;

		for (int i = net.size()-1; i >= 0; i--)
		{
			Transmitter ttemp = net.getTransmitter(i);
			net.removeTransmitter(i);
			for (int y = 0; y < size; y++)
			{
				for (int j = 0; j < size; j++)
				{
					temp= temp + net.getSignal(y, j);
				}
			}

			if( lowestSignal > temp)
			{
				lowestSignal= temp;
				important = ttemp;
			}
			temp = 0.0;
			net.addTransmitter(ttemp);
		}

		return important;
	}*/
	/**
	 Find which transmitter
	 in the network contributes most to the coverage
	 @return the most important transmitter
	 */
	public Transmitter important(){
		Transmitter important = net.getTransmitter(1);
		double lowestSignal = this.poorSignal();
		for (int i = net.size()-1; i >= 0; i--)
		{
			Transmitter ttemp = net.getTransmitter(i);
			net.removeTransmitter(i);

			if( lowestSignal > this.poorSignal())
			{
				lowestSignal= this.poorSignal();
				important = ttemp;
			}
			net.addTransmitter(ttemp);
		}

		return important;
	}
  /**
   Areas where the new network has a stronger
   signal than the original one
 @param net2 The new network
   */
	public void compare(Network net2)
	{

	for (int i = 0; i < size; i++)
		{
			for (int j = 0; j < size; j++)
			{
				if ((net2.getSignal(i,j) > this.net.getSignal(i,j)))
				{
				System.out.print("S");
				}
			}
			System.out.println("");
		}

	}
}

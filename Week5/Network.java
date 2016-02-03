import java.util.ArrayList;
/**
Network of several transmitters.
*/
public class Network
{
	//attribute 
	private ArrayList<Transmitter> stations;
	
	//constructor - empty network
	/**
	Create a network with initialy no transmitters
	*/
	public Network()
	{
		this.stations = new ArrayList<Transmitter>();
	}
	//toString
	public String toString()
	{
		return "The network contains " + stations.size()+ " transmitters" + stations;
	}
	/** 
	How many transmitters are in the network?
	@return The number of transmitters
	*/
	
	public int size()
	{
		return stations.size();
	}
	/**
	Add a transmitter to network
	@param t The transmitter to add
	*/
	public void addTransmitter(Transmitter t)
	{
		stations.add(t);
	}
	/**
	 set a power of a transmitter
	 @param index The index of a transmitter to remove
	 */
	public void setTransmitter(int index, Transmitter t)
	{
		stations.set(index, t);
	}
	public void removeTransmitter(int index)
	{
		stations.remove(index);
	}
	/**
	Get the transmitter at a given index.
	@param index The index of the transmitter
	@return The transmitter at that index
	
	*/
	public Transmitter getTransmitter(int index)
	{
		return stations.get(index);
	}
	/**
	Find the signal strength at a particular location
	@param x The x coordinate of the location
	@param y The y coordinate of the location
	@return The maximum signal from the transmitters in the network
	*/
	public double getSignal(double x, double y)
	{
		// go through transmitters on network
		// find signal strength from each one 
		// keep tack of largest one found
		// return the largest found
		double best = 0.0;
		for(int i = 0; i<size(); i++)
		{
			double signal = getTransmitter(i).getSignal(x,y);
			//largest we have seen
			if (signal > best)
			{
			best = signal;
			}
			/*
			if (Transmitter.getSignal(i)>=Transmitter.getSignal(i+1))
			best = Transmitter.getSignal(i)
			else
			best = Transmitter.getSignal(i+1)
			*/
		}
		return best;
	}
	
}

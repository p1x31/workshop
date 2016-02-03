public class Test
{
	public static void main(String[] args)
	{
		//q1
		Transmitter t1 = new Transmitter(1.0, 0.5, 80.0);
		
		System.out.println(t1);
		// testing different signals
		System.out.println(t1.getSignal(2.0,3.0));
		System.out.println(t1.getSignal(2.0,3.1));
		System.out.println(t1.getSignal(1.2,0.5));
		System.out.println(t1.getSignal(1.0,0.5));
		
		System.out.println(Math.sqrt(-1));
		//q1
		Transmitter t2 = new Transmitter(8.0, 1.2 , 80.0);
		Transmitter t3 = new Transmitter(17.5, 17.0, 80.0);
		// testing network
		Network net = new Network();
		System.out.println(net);
		// after adding one 
		net.addTransmitter(t1);
		net.addTransmitter(t2);
		net.addTransmitter(t3);
		System.out.println(net);
		System.out.println("size " + net.size());
		
		System.out.println(net.getSignal(8.0,1.2));
		
		SignalStrength grid = new SignalStrength(net, 20);
		System.out.println(grid.averageSignal());
		
		Network net2  = new Network();
		SignalStrength grid2 = new SignalStrength(net2, 20);
		
		System.out.println(grid2.averageSignal());
		
		//Testing question 1
		
		
		SignalMap m1 = new SignalMap(net, 20, 8.0);
		// q2
		m1.display();
		//q3
		System.out.println(m1.poorSignal());
		//q4
		System.out.println("The most important station " + m1.important());
		//q5
		m1.compare(net2);
		
		
	}
}

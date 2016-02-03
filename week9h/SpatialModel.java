/**
Wrapper class for SpatialNetwork
*/

import java.util.Observable;

public class SpatialModel extends Observable 
{
    private SpatialNetwork net;
    
    public SpatialModel(SpatialNetwork net)
    {
        super();
        this.net = net;
    }
    
    public double getX(int i)
    {
        return net.getX(i);
    }
    
    public double getY(int i)
    {
        return net.getY(i);
    }
    
    public int getNumOfPoints()
    {
        return net.getNumOfPoints();
    }
    
    public boolean connected(int first, int second)
    {
        return net.connected(first, second);
    }
    
    public double getTreshold()
    {
        return net.getTreshold();
    }
    
    public void setNumOfPoints(int n)
    {
        net.setNumOfPoints(n);
        setChanged();
        notifyObservers();
    }
    
    public void setTreshold(double treshold)
    {
        net.setTreshold(treshold);
        setChanged();
        notifyObservers();
    }
    
}


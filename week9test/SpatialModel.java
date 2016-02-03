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
    
    public int getNumberOfPoints()
    {
        return net.getNumberOfPoints();
    }
    
    public boolean isConnected(int first, int second)
    {
        return net.isConnected(first, second);
    }
    
    public double getThreshold()
    {
        return net.getThreshold();
    }
    
    public void setNumberOfPoints(int n)
    {
        net.setNumberOfPoints(n);
        setChanged();
        notifyObservers();
    }
    
    public void setThreshold(double threshold)
    {
        net.setThreshold(threshold);
        setChanged();
        notifyObservers();
    }
    
}


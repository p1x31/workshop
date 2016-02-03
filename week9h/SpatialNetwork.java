/**
Manages spatial network -- a number of spots with random coordinates joined with lines depending on their positions and current treshold
*/
import java.awt.geom.Point2D;
import java.util.Random;
import java.util.ArrayList;

public class SpatialNetwork 
{
    
    private ArrayList<Point2D.Double> points; 
    private int n;
    private double treshold;
    private Random gen;
    
/**
Creates a spatial network
@param n Number of nodes in the initial network
@treshold The initial treshold
*/
    public SpatialNetwork(int n, double treshold)
    {
        this.n = n;
        this.treshold = treshold;
        
        points = new ArrayList<Point2D.Double>();
        this.gen = new Random();
        
        generatePoints(this.n, points, gen);
    }
    
/**
Supportive method for generating nodes for the network
@param n The number of nodes to generate
@param points The collection of points representing nodes
@param gen The random generator
*/
    private void generatePoints(int n, ArrayList<Point2D.Double> points, Random gen)
    {
        for(int i = 0; i < n; i++)
        {
            points.add(new Point2D.Double(gen.nextDouble(), gen.nextDouble()));
        }
    }
    
/**
Returns the X coordinate of a point
@param i the index of the point in the collection
@return The x coordinate of the point
*/
    public double getX(int i)
    {
       return points.get(i).getX();
    }

/**
Returns the Y coordinate of a point
@param i the index of the point in the collection
@return The y coordinate of the point
*/    
    public double getY(int i)
    {
        return points.get(i).getY();
    }
    
/**
Returns the current size of the network
@return The current size of the network
*/
    public int getNumOfPoints()
    {
        return points.size();
    }
    
/**
Indicates whether or not two points in the network are connected
@param first position of the first point in the collection
@param second position of the second point in the collection
@return boolean answering whether the points are connected
*/
    public boolean connected(int first, int second)
    {
        return Math.sqrt(Math.pow(points.get(first).getX() - points.get(second).getX(), 2) + Math.pow(points.get(first).getY() - points.get(second).getY(), 2)) < treshold;
    }
    
/**
Get the current treshold
@return Treshlod
*/
    public double getTreshold()
    {
        return treshold;
    }
    
/**
Set new size of the network
@param n the new number of points
*/
    public void setNumOfPoints(int n)
    {
        final int size = getNumOfPoints();
        
        if(size > n)
        {
           for(int i = size - 1; i >= n; i--)
           {
               points.remove(i);
           }
        }
        else
        {
            if(size < n)
            {
            generatePoints(n - size, points, gen);
      	    }
        }
    }
    
/**
Set new treshold
@param treshold the new treshold
*/
    public void setTreshold(double treshold)
    {
        this.treshold = treshold;
    }
    
}

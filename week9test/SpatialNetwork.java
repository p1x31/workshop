import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.Random;

/**
 * A random spatial network is made up of a collection of points located randomly in a given 2-dimensional area.
 * Points that are closer to each other than some specified threshold are said to be connected.
 */
public class SpatialNetwork
{

    private ArrayList<Point2D.Double> points;
    private int numberOfPoints;
    private double threshold;
    private Random r;

/**
Creates a spatial network
@param numberOfPoints Number of nodes in the initial network
@threshold The initial threshold
*/
    public SpatialNetwork(int numberOfPoints, double threshold)
    {
        this.numberOfPoints = numberOfPoints;
        this.threshold = threshold;

        points = new ArrayList<Point2D.Double>();
        this.r = new Random();

        calculatePoints(this.numberOfPoints, points, r);
    }

/**
Supportive method for generating nodes for the network
@param numberOfPoints The number of nodes to generate
@param points The collection of points representing nodes
@param r The random generator
*/
    private void calculatePoints(int numberOfPoints, ArrayList<Point2D.Double> points, Random r)
    {
        for(int i = 0; i < numberOfPoints; i++)
        {
            points.add(new Point2D.Double(r.nextDouble(), r.nextDouble()));
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
    public int getNumberOfPoints()
    {
        return points.size();
    }

/**
Indicates whether or not two points in the network are connected
@param first position of the first point in the collection
@param second position of the second point in the collection
@return boolean answering whether the points are connected
*/
    public boolean isConnected(int first, int second)
    {
        return Math.sqrt(Math.pow(points.get(first).getX() - points.get(second).getX(), 2) + Math.pow(points.get(first).getY() - points.get(second).getY(), 2)) < threshold;
    }

/**
Get the current threshold
@return Threshold
*/
    public double getThreshold()
    {
        return threshold;
    }

/**
Set new size of the network
@param numberOfPoints the new number of points
*/
    public void setNumberOfPoints(int numberOfPoints)
    {
        final int size = getNumberOfPoints();

        if(size > numberOfPoints)
        {
           for(int i = size - 1; i >= numberOfPoints; i--)
           {
               points.remove(i);
           }
        }
        else
        {
            if(size < numberOfPoints)
            {
                calculatePoints(numberOfPoints - size, points, r);
      	    }
        }
    }

/**
Set new threshold
@param threshold the new threshold
*/
    public void setThreshold(double threshold)
    {
        this.threshold = threshold;
    }
    
}

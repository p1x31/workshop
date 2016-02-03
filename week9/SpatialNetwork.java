import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.Random;

/**
 * A random spatial network is made up of a collection of points located randomly in a given 2-dimensional area.
 * Points that are closer to each other than some specified threshold are said to be connected.
 */
public class SpatialNetwork
{
    private int numberOfPoints;
    private double threshold;
    private ArrayList<Point2D.Double> points;
    private Random r;

    /**
     Construct spatial network pattern
     @param numberOfPoints how many points to create
     @param threshold the given threshold
     */
    public SpatialNetwork(int numberOfPoints, double threshold)
    {
        this.numberOfPoints = numberOfPoints;
        this.threshold = threshold;
        points = new ArrayList<Point2D.Double>();
        this.r = new Random();
        calculatePoints(this.numberOfPoints, points,r);
    }
/**
 * Generate points for network
 * @param numberOfPoints The number of nodes to generate
 * @param points The collection of points representing nodes
 * */
    private void calculatePoints(int numberOfPoints, ArrayList<Point2D.Double> points, Random r)
    {

        for(int i = 0; i < numberOfPoints; i++)
        {
            points.add(new Point2D.Double(r.nextDouble(), r.nextDouble()));
        }
    }
    /**
     Get the co-ordinates of each point
     @return an ArrayList containing the coordinates of the points - should be scaled by the width and height of the
     component
     */
    public ArrayList<Point2D.Double> getPoints()
    {
        return points;
    }
    /**Returns the X coordinate
     * @param i the index of a point
     * @return The x coordinate
    * */
     public double getX(int i){return points.get(i).getX();}

    /**Returns the Y coordinate
     * @param i the index of a point
     * @return The y coordinate
     * */
    public double getY(int i){return points.get(i).getY();}
    /**
     Change the threshold
     @param  threshold new threshold
     */
    public void setThreshold(double threshold)
    {
        this.threshold = threshold;

    }
    /**
     Change the numberOfPoints
     @param  numberOfPoints new number of points
     */
    public void setNumberOfPoints(int numberOfPoints)
    {
        final int size = getNumberOfPoints();
        if(size > numberOfPoints)
        {
            for (int i = size-1; i >=numberOfPoints; i--)
            {
                points.remove(i);
            }
        }
        else
        {
            if(size<numberOfPoints)
            {
                calculatePoints(numberOfPoints-size,points, r);
            }
        }
    }

    /**
     Get the current threshold
     @return the threshold
     */
    public double getThreshold()
    {
        return threshold;
    }

    /**
     Get the current number of points
     @return the number of points
     */
    public int getNumberOfPoints() {
        return points.size();
    }
    /**Whether or not two points are connected
     * @param first index of the point one
     * @param second index of the point two
     * @return boolean determine of two ponts are connected
    * */
    public boolean isConnected(int first, int second){
        //< threshold true pythagoras t
        return Math.sqrt(Math.pow(points.get(first).getX()-points.get(second).getX(),2)+
                Math.pow(points.get(first).getY()- points.get(second).getY(),2)) < threshold;
        //draw plots
        //check if connected -> draw line between the two plots
        //week 7 week8
    }

}


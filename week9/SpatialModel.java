import java.util.Observable;
import java.util.ArrayList;
import java.awt.geom.Point2D;


/**
 * Model of a SpatialNetwork class
 */

public class SpatialModel extends Observable 
{
    private SpatialNetwork network;

    /**
     Construct model of SpatialNetwork
     @param network the network object
     */
    public SpatialModel(SpatialNetwork network)
    {
        super();
        this.network = network;
    }
    /**
     Get the co-ordinates of each point
     @return an ArrayList containing the coordinates of the points - should be scaled by the width and height of the
     component
     */
    //can be done with ArrayList<Point2D.Double> points = model.getPoints(); in view
    //double x = points.get(i).getX();
  /*  public ArrayList<Point2D.Double> getPoints()
    {
        return network.getPoints();
    }*/

    /**Returns the X coordinate for particular network
     * @param i the index of a point
     * @return The x coordinate
     * */
    public double getX(int i){return network.getX(i);}

    /**Returns the Y coordinate for particular network
     * @param i the index of a point
     * @return The y coordinate
     * */
    public double getY(int i){return  network.getY(i);}

    /**
     Change the threshold
     @param  threshold new threshold
     */
    public void setThreshold(double threshold)
    {
        network.setThreshold(threshold);
        setChanged();
        notifyObservers();
    }

    /**
     Change the numberOfPoints
     @param  numberOfPoints new number of points
     */
    public void setNumberOfPoints(int numberOfPoints) {
        network.setNumberOfPoints(numberOfPoints);
        setChanged();
        notifyObservers();
    }

    /**
     Get the current threshold
     @return the threshold
     */
    public double getThreshold()
    {
        return network.getThreshold();
    }

    /**
     Get the current number of points
     @return the number of points
     */
    public int getNumberOfPoints() {
        return network.getNumberOfPoints();
    }

    /**Whether or not two points are connected
     * @param first index of the point one
     * @param second index of the point two
     * @return boolean determine of two ponts are connected
     * */
    public boolean isConnected(int first, int second){return network.isConnected(first,second);}

}

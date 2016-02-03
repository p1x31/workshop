import javax.swing.*;

/**
 * Created by Vadim on 29/11/2015.
 * Creates GUI to draw and change a particular spatial network
 */
public class SpatialGUI
{
    public static void main(String[] args) {

        SpatialNetwork network = new SpatialNetwork(100, 0.2);

        SpatialComponent comp = new SpatialComponent(network, 0, 100, 20, 150);

        JFrame frame = new JFrame("Spatial Network Viewer");
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(comp);
        frame.setVisible(true);
    }
}

/**
Displays GUI to generate and change a spatial network
*/
import javax.swing.JFrame;

public class SpatialGUI 
{
    public static void main(String[] args)
    {
        SpatialNetwork net = new SpatialNetwork(150, 0.2);
        
        SpatialComponent comp = new SpatialComponent(net, 0, 100, 20, 150);
        
        JFrame frame = new JFrame("Spatial Network?");
        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.add(comp);
        frame.setVisible(true);
        
    }
}

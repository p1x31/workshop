import javax.swing.JFrame;

public class NoughtsCrossesGUI 
{
    public static void main(String[] args)
    {
        NoughtsCrosses nc = new NoughtsCrosses();
        
        NoughtsCrossesComponent comp = new NoughtsCrossesComponent(new NoughtsCrossesModel(nc));
        
        JFrame frame = new JFrame("OXO");
        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.add(comp);
        frame.setVisible(true);
        
    }
}

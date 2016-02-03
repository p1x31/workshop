import java.util.Random;

/**
 * Created by Vadim on 18/10/2015.
 */
public class Test1 {
    double randomGenerator()
    {
        Random generator = new Random();
        double num = generator.nextDouble();

        return num;
    }
}

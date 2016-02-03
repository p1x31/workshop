import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by Vadim on 18/10/2015.
 */
public class TestArrayList {
    public static void main(String[] args) throws Exception
    {
        //???????? ??? ??? ???
        int[] array = new int[20];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 20; i++)
        {
            int s = Integer.parseInt(reader.readLine());
            array[i]=s;
        }

        int[] arrFirst = new int[10];
        int[] arrSecond = new int[10];


        System.arraycopy(array, 0, arrFirst ,0, 10);
        System.arraycopy(array, 10, arrSecond ,0, 10);
        for(int i = 0; i < 10; i++){
            System.out.println(arrSecond[i]);
        }
    }
}

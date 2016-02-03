import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

/**
* Question4
*
* Created by Vadim on 04/10/2015.
*
*  vxm567@student.bham.ac.uk
 *
 *
 * Complete the program to create a new ArrayList which contains each string from list exactly once.
 * Print out the strings to verify this.
 * For example, a run of the program might look like this:
 *
 * Enter a string (enter stop to finish)
 * banana
 * Enter a string (enter stop to finish)
 * apple
 * Enter a string (enter stop to finish)
 * banana
 * Enter a string (enter stop to finish)
 * pineapple
 * Enter a string (enter stop to finish)
 * stop
 *
 * banana
 * apple
 * pineapple
 */
public class Question4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();
        System.out.println("Enter a string (enter stop to finish)");
        String s = in.nextLine();
        while (!s.equals("stop"))
        {
            list.add(s);
            System.out.println("Enter a string (enter stop to finish)");
            s = in.nextLine();
        }
        HashSet<String> set = new HashSet<>(list);
        ArrayList<String> storelist = new ArrayList<String>(set);


        for (int i = 0; i < storelist.size(); i++)
        {
            System.out.println(storelist.get(i));
        }
       /* for (int i = 0; i < list.size(); i++)
        {
            // Loop over all following elements.
            for (int x = i + 1; x < list.size(); x++)
            {
                // If two elements equal, there is a duplicate.
                if (list.get(i) == list.get(x)) {

                }
            }
        }*/
    }
}


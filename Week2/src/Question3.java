import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * Question3
 *
 * Created by Vadim Makarenkov on 11/10/2015.
 *
 * vxm567@student.bham.ac.uk
 *
 * Complete the program so that all strings in list which contain more than three characters are replaced with just their first three characters.
 * Print out the strings to verify this. For example, a run of the program might look like this:
 * Enter a string (enter stop to finish) banana
 * Enter a string (enter stop to finish) apple
 * Enter a string (enter stop to finish) pineapple
 * Enter a string (enter stop to finish) stop
 * ban
 * app
 * pin
 */
public class Question3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();
        System.out.println("Enter a string (enter stop to finish)");
        String s = in.nextLine();
        while (!s.equals("stop")) {
            list.add(s);
            System.out.println("Enter a string (enter stop to finish)");
            s = in.nextLine();
        }
        for (int i = 0; i < list.size(); i++) {

            if(list.get(i).length()>3)
            {
                for (int j = 0; j < 3; j++)
                {
                    System.out.print((list.get(i).charAt(j)));
                }
                System.out.println("");
            }
            else
                System.out.println(list.get(i));
        }
    }
}
//Q3: The string in the list is still as input, so only 1 mark is given.

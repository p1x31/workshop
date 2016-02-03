import java.util.ArrayList;
import java.util.Scanner;

/**
 * Questoin 1
 *
 * Vadim Makarenkov
 *
 * vxm567@student.bham.ac.uk
 *
 *  Complete the program so that it prints out the longest string in list.
    For example, a run of the program might look like this:
    Enter a string (enter stop to finish)
    banana
    Enter a string (enter stop to finish)
    apple
    Enter a string (enter stop to finish)
    pineapple
     Enter a string (enter stop to finish)
    stop
     The longest string was pineapple
 */

public class Question1 {
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
        int maxLength = list.get(0).length();
        int longest = 0;
        for (int i = 0; i < list.size(); i++)
        {
            if (maxLength < list.get(i).length())
            {
                maxLength = list.get(i).length();
                longest = i;
            }

        }
        System.out.println(list.get(longest));

        }
}


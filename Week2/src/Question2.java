import java.util.ArrayList;
import java.util.Scanner;

/**
 * /**
 * Questoin 2
 *
 * Vadim Makarenkov
 *
 * vxm567@student.bham.ac.uk
 *
 * Complete the program so that the order of the strings in list is reversed.
 * Print out the strings to verify this.
 * For example, a run of the program might look like this:
 Enter a string (enter stop to finish) banana
 Enter a string (enter stop to finish) apple
 Enter a string (enter stop to finish) pineapple
 Enter a string (enter stop to finish) stop
 pineapple
 apple
 banana
 */
public class Question2 {
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

      // collection of all the values
      // If list needs to be updated?
      //  ArrayList<String> reversedlist = new ArrayList<String >();
    for (int i = 0; i < list.size(); i++)
    {
        int j = list.size() - i - 1;
       // reversedlist.add(list.get(j));
        System.out.println( list.get(j) );
    }
       // list = reversedlist;

}
}
//Q2: The string in the list is not changed, so I can only give you 1 mark.

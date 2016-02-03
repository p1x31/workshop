import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Question 5
 *
 * Created by Vadim Makarenkov on 11/10/2015.
 *
 *  vxm567@student.bham.ac.uk
 *
 * Complete the program so that it finds the string that occurs most often in the list, and prints it out.
 * For example, a run of the program might look like this:
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
 * The most frequent string was banana
 *
 */
public class Question5 {
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
        Map<String, Long> occurrences =
                list.stream().collect(Collectors.groupingBy(w -> w, Collectors.counting()));
        Map.Entry<String, Long> entry = occurrences.entrySet().iterator().next();
        System.out.println("The most frequent string was " + entry.getKey());


    }
}
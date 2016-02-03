import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Question 5
 *
 * Created by Vadim Makarenkov on 04/10/2015.
 *
 *  vxm567@student.bham.ac.uk
 *
 *  Write a program which, given a string, finds the character which comes first alphabetically.
 *  (Hint: you can use < to compare characters).
 *  For example, a run of the program might look like this:
 *  Please input a string: person
 *  The first character alphabetically is e
 */
public class Question5 {
    public static void main(String[] args) throws IOException {

        char inChar;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Please input a string: ");
        String s = reader.readLine();
        int first = min(s.charAt(0),s.charAt(1));
        //q6 might be useful
        //for(char i = 'a'; i<='z'; i++)
        //starting from backwards of a string
        for (int i = s.length()-1; i >= 0; i--)
        {
            first = min(s.charAt(i),first);
        }
        // cast int to char
        inChar = (char) first;
        System.out.println("The first character alphabetically is "+inChar);
    }
    public static int min(int a, int b)
    {
        return a < b ? a : b;
    }
}


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Question4
 *
 * Created by Vadim on 04/10/2015.
 *
 *  vxm567@student.bham.ac.uk
 *
 *   Write a program that inputs a string and prints out the string in reverse.
 *   It should also print out whether or not the string is a palindrome (that is, if it reads the same forwards and backwards).
 *   For example, a run of the program might look like this:
 *   Please input a string: elephant
 *   elephant backwards is tnahpele
 *   It is not a palindrome
 */


public class Question4  {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Please input a string: ");
        String s = reader.readLine();
        String result = "";
        for (int i = s.length()-1; i >= 0; i-- )
        {
            result +=s.charAt(i);
        }
        System.out.println(s+" backwards is " + result);
        if (s.equals(result))
            System.out.println("It is a palindrome");
        else
            System.out.println("It is not a palindrome");

    }


}

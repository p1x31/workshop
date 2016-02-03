import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Question 6
 *
 * Created by Vadim Makarenkov on 04/10/2015.
 *
 *  vxm567@student.bham.ac.uk
 *
 *   Use the code from the previous exercise to write a new program which inputs a string and then prints the characters from that string in alphabetical order.
 *   You might want to look at the Java API for String methods to help (such as the “substring” and “indexOf” methods).
 *   Please do NOT use any java library sort methods.
 *   For example, a run of the program might look like this:
 *   Please input a string: zebra
 *   a
 *   b
 *   e
 *   r
 *   z
 *
 *   Question! If the letter happens to occur twice in a word, does the program prints it twice as well?
 */
public class Question6 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Please input a string: ");
        String s = reader.readLine();
        for(char i = 'a'; i<='z'; i++)
        {
            for (int j = 0; j <=s.length()-1; j++)
            {
                if(s.charAt(j)== i)
                {
                    System.out.println(i);
                    //break; //- optional if letter needs to be printed once
                }
            }
        }
    }
}

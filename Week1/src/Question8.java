import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/** Question 7
 *
 * Created by Vadim Makarenkov on 04/10/2015.
 *
 *  vxm567@student.bham.ac.uk
 *
 *   Write a program that inputs an integer n.
 *   If n is greater than zero, then it prints a message saying if the number is a square number.
 *   For example, runs of the program might look like this:
 *   Please input a number: 13
 *   The number 13 is not a square.
 *   Please input a number: 25
 *   The number 25 is the square of 5.
 *
 */
public class Question8 {
    public static void main(String[] args) throws IOException {


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Please input a number: ");
        int n = Integer.parseInt(reader.readLine());
        boolean isSquare = true;
        //check to see if the number is square

            for (int i = 1; i < (int) Math.sqrt(n) + 1; i++)
            {
                if (n % Math.sqrt(n) != 0)
                {
                    isSquare = false;
                    break;
                }
            }
        // print the number
        if (isSquare)
            System.out.println("The number " + n + " is the square of " + (int)Math.sqrt(n) +".");
        else
            System.out.println("The number " + n + " is not a square.");


    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * Question3
 *
 * Created by Vadim Makarenkov on 02/10/2015.
 *
 * vxm567@student.bham.ac.uk
 *
 *  Write a program that inputs an integer n. If n is greater than zero, then it prints out n lines of stars (*).
 *  The first line contains n stars, the second line contains n-1 stars, the third line contains n-2 stars and so on.
 *  If n is less than or equal to zero, a message is displayed saying than a positive number is required.
 *  For example, a run of the program might look like this:
 *  Please input a number: 5
 *  *****
 *  ****
 *  ***
 *  **
 *  *
 */
public class Question3 {
    public static void main(String[] args) throws IOException {


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Please input a number: ");
        int numOfRows = Integer.parseInt(reader.readLine());
        boolean flag = false;
        do {
            if (numOfRows <= 0) {
                System.out.print("positive number is required, enter a new one: ");
                numOfRows = Integer.parseInt(reader.readLine());
                flag = false;
            } else {
                flag = true;
            }

        }
        while (flag == false);

        for (int i = 0; i < numOfRows; i++)
        // for nth row numOfRows-n stars
        {

            int n = numOfRows;

            while (n > i) {
                System.out.print("*");
                n--;
            }
            System.out.println("");


        }
    }
}

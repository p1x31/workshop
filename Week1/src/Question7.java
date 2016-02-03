import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * Question 7
 *
 * Created by Vadim Makarenkov on 04/10/2015.
 *
 *  vxm567@student.bham.ac.uk
 *
 *  Write a program that inputs an integer n.
 *  If n is greater than zero, then it prints a message saying if the number is a prime.
 *  For example, runs of the program might look like this:
 *  Please input a number: 13
 *  The number 13 is a prime.
 *  Please input a number: 27
 *  The number 27 is not a prime.
 *
 */
public class Question7 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Please input a number: ");
        int n = Integer.parseInt(reader.readLine());
        boolean isPrime = true;
            //check to see if the number is prime
            if(n == 1)
                isPrime = false;
            else
                for(int i = 2; i < (int)Math.sqrt(n)+1; i++)
                {
                    if(n % i == 0)
                    {
                        isPrime = false;
                        break;
                    }
                }
            // print the number
            if(isPrime)
                System.out.println("The number "+ n + " is prime.");
            else
                System.out.println("The number "+ n + " is not prime.");


    }
}

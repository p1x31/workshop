
/**
 * Questoin 2
 *
 * Vadim Makarenkov
 *
 * vxm567@student.bham.ac.uk
 *
 * Write a program that inputs a sequence of integers.
 * When a negative integer is found, the program prints the smallest number it has seen prior to that point and then terminates.
 * For example, a run of the program might look like this:
 * Please input a number: 5
 * Please input a number: 10
 * Please input a number: 3
 * Please input a number: 7
 * Please input a number: -1
 * The smallest number was 3
 *
 *
 * NB  possible solution to read first number outside of the loop
 * and compare it with the one inside saving in smallest variable
 *
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question2 {


        public static void main(String[] args)   throws IOException
        {

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Please input a number: ");
            int a = Integer.parseInt(reader.readLine());
            int smallest = a;
            // initialization ; condition ; increment - no increment while loop
            for (boolean isExit=false; !isExit;)
            {


                System.out.print("Please input a number: ");
                int b = Integer.parseInt(reader.readLine());

                /** max
                *if( a > b)
                *    return a;
                *else
                *    return b;
                */
                if(b < 0)
                {
                    System.out.println("The smallest number was " + smallest);
                    isExit  = true;
                }

                smallest = min(smallest,b);

            }
        }
        public static int min(int a, int b)
         {
           return a < b ? a : b;
         }
    }



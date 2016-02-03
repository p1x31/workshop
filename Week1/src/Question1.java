import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Questoin 1
 *
 * Vadim Makarenkov
 *
 * vxm567@student.bham.ac.uk
 *
 *  Write a program that inputs an integer, and prints all the even numbers between 0 and that number.
 *  For example, a run of the program might look like this:  Please input a number: 8 0 2 4 6 8
 */


public class Question1
{
    public static void main(String[] args) throws Exception
    {

        //Scanner in = new Scanner(System.in)
        //int n = in.nextInt(); in.nextLine();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        for (int i = 0; i<=n; i+=2){
            System.out.println(i);
        }
    }
}
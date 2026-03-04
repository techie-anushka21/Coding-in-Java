/*sum of n natural numbers using for loop */
import java.util.Scanner;    //importing the Scanner class

public class NaturalNF
{
    public static void main(String args[])
    {
        int n;    //no. of natural nos.
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter a no.: ");
        n = scn.nextInt();    //Scanning the input given by user

        int sum = 0;
        for(int i=1; i<=n; i++)    //implementation of the solution to the problem
        {
            sum = sum + i;
        }
        System.out.println("Sum = "+sum);

        scn.close();
    }    
}
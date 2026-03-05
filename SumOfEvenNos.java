/*Sum of Even nos. from 0 to n */
import java.util.Scanner;    //importing the Scanner class

public class SumOfEvenNos
{
    public static void main(String args[])
    {
        int n, sum = 0;
        
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a no.: ");
        n = scn.nextInt();
        
        for(int i = 0; i<=n; i++)
        {
            if(i % 2 == 0)    //checking if the input no. is Even or not
            {
                sum = sum + i;
            }
        }
        System.out.println("Sum of Even nos. from 0 to " + n + " = " + sum);
        scn.close();
    }    
}

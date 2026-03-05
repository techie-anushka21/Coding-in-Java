/*Enter nos. n no. of times and find the no. of positive nos., negative nos., and 
zeros entered. */
import java.util.Scanner;    //importing Scanner class

public class Segregate
{
    public static void main(String args[])
    {
        int n, scan=0, positive=0, negative=0, zero=0;    //initialization
    
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the no. of times you want to input nos.: ");
        n = scn.nextInt();

        for(int i=0; i<n; i++)
        {
            scan = scn.nextInt();    //scanning the numbers
            
            if(scan>0)
            {
                positive++;    //increments the no. of positive nos.
            }
            else if(scan<0)
            {
                negative++;    //increments the no. of negative nos.
            }
            else
            {
                zero++;        //increments the no. of zeros.
            }
        }
        System.out.println(positive + "Positive nos. entered.");    //no. of positive nos.
        System.out.println(negative + "Negative nos. entered.");    //no. of negative nos.
        System.out.println(zero + "Zeros entered.");    //no. of zeros.

        scn.close();
    }
}
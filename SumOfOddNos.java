/*Sum of all odd nos. from 1 to n. */
import java.util.Scanner;    //importing the Scanner class

class Seq
{
    int n, sum = 0;

    public void in(Scanner scn)    //method to input the value of n (limit)
    {
        System.out.print("Enter an Odd no.: ");
        n = scn.nextInt();
    }
    public void find()
    {
        for(int i=1; i<=n; i++)
        {
            if(i % 2 != 0)    //condition to check the whether the input no. is odd or not 
            {
                sum = sum + i;
            }
        }
        System.out.println("Sum of Odd nos. from 1 to " + n + " = " + sum);
    }
}
public class SumOfOddNos
{
    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);
        Seq obj = new Seq();    //object creation for "Seq" class
        
        obj.in(scn);    //accessing the in method
        obj.find();     //accessing the find method

        scn.close();
    }    
}

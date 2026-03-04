/*printing the table of a no. using for loop */
import java.util.Scanner;

public class TablesF
{
    public static void main(String args[])
    {
        int n;

        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a no.: ");
        n = scn.nextInt();    //inputs the no. whose table we want

        for(int i=1; i<11; i++)    //logic
        {
            System.out.println(n + " x " + i + " = " + (n*i));    //printing table
        }
        scn.close();
    }
}
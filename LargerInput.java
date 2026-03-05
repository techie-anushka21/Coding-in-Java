/*Taking 2 nos. from the user as Input and finding the Larger no. using if...else*/

import java.util.Scanner;    //importing the Scanner class

class In
{
    int x, y;    //variables for the 2 nos.

    public void inp(Scanner scn)    //method for input and if...else loop
    {
        System.out.println("Enter 2 nos.:-");
        x = scn.nextInt();    //input of 1st no.
        y = scn.nextInt();    //input of 2nd no.
    }
    public void check()    //method to implement if...else 
    {
        if(x>y)    //condition
        {
            System.out.println(x + " is the larger input.");    //statement
        }
        else if(y>x)
        {
            System.out.println(y + " is the larger input.");    //statement
        }
        else
        {
            System.out.println("Both the nos. are equal.");   //statement
        }    
    }
}
public class LargerInput
{
    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);
        In obj = new In();    //object creation for "In" class
        obj.inp(scn);    //accessing inp method
        obj.check();     //accessing check method

        scn.close();
    }    
}
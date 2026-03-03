/*Comparing the equality of 2 nos. using if...else Statements */

import java.util.Scanner;    //Importing the Scanner class

class Values
{
    int a, b;

    public void input(Scanner scn)    //function to input the nos.
    {
        System.out.print("Enter the 1st no.: ");
        a = scn.nextInt();    //1st no.

        System.out.print("Enter the 2nd no.: ");
        b = scn.nextInt();    //2nd no.
    }
    public void checks()    //function to check the Equality of both the nos.
    {
        if(a==b)    //condition
        {
            System.out.println("a and b are Equal");
        }
        else
        {
            if(a>b)    //condition
            {
                System.out.println("a is greater than b");
            }
            else
            {
                System.out.println("a is lesser than b");
            }
        }
    }
}
public class If_Else3
{
    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);
        Values obj = new Values();    //object creation for "Values" class
        obj.input(scn);    //accessing the input function
        obj.checks();      //accessing the output function

        scn.close();
    }
}
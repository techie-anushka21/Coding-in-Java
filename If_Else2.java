/*Checking whether the division output is even or odd using if...else statements */
/*Here we are talking about the Quotient */

import java.util.Scanner; /*importing Scanner class*/

class Numbers
{
    double num1, num2, res;

    public void input(Scanner scn)    //method to input the nos. for Division
    {
        System.out.print("Enter the 1st no.: ");
        num1 = scn.nextDouble();
        System.out.print("Enter the 2nd no.: ");
        num2 = scn.nextDouble();

        res = num1/num2;    //Formula of Division
    }
    public void check()     //method to check whether the output is Even or Odd
    {
        if(res%2==0)    //condition
        {
            System.out.println("Output is an Even no.");
        }
        else
        {
            System.out.println("Output is an odd no.");
        }
    }
}
public class If_Else2
{
    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);
        Numbers obj = new Numbers();    //Object creation for "Numbers" class 
        obj.input(scn);    //accessing the input method 
        obj.check();       //accessing the output method

        scn.close();
    }
}
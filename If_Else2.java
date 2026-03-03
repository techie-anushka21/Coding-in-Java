/*Checking whether the division output is even or odd using if...else statements */
/*Here we are talking about the Quotient */

import java.util.Scanner; /*importing Scanner class*/

class Numbers
{
    double num1, num2, res;

    public void input(Scanner scn)
    {
        System.out.print("Enter the 1st no.: ");
        num1 = scn.nextInt();

        System.out.print("Enter the 2nd no.: ");
        num2 = scn.nextInt();

        res = num1/num2;
    }
    public void check()
    {
        if(res%2==0)
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
        Numbers obj = new Numbers();
        obj.input(scn);
        obj.check();
    }
    
}

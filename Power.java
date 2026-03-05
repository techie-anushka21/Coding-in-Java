/*Calculating x^n (base^exponent) where x and n both are input by the users */
import java.util.Scanner;    //accessing the Scanner class

class I 
{
    double h, i, res;

    public void inputs(Scanner scn)    //method to take inputs from the user
    {
        System.out.println("Enter base: ");
        h = scn.nextDouble();

        System.out.println("Enter exponent: ");
        i = scn.nextDouble();
    }
    public void result()    //method for the formula and result printing
    {
        res = Math.pow(h,i);    //formula
        System.out.println("Result = " + res);   
    }
}
public class Power
{
    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);
        I obj = new I();    //object creation for "I" class

        obj.inputs(scn);    //accessing the inputs method
        obj.result();       //accessing the result method

        scn.close();
    }    
}

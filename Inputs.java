import java.util.Scanner;    //package for importing Scanner class 
class Integers
{
    int num1, num2, sum;    //variable declaration

    public void input(Scanner scn)    //function to input the numbers
    {
        System.out.println("Addition of 2 Integers:-");

        System.out.print("Enter the 1st no.: ");    //1st integer input 
        num1 = scn.nextInt();

        System.out.print("Enter the 2nd no.: ");    //2nd integer input
        num2 = scn.nextInt();

        sum = num1 + num2;    //formula for addition
    }
    public void output()    //function to show the output (sum)
    {
        System.out.println("1st no.: "+num1);
        System.out.println("2nd no.: "+num2);
        System.out.println("Sum = "+sum);
    }
}
public class Inputs
{
    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);    //Creating the Scanner class's object
        Integers obj = new Integers();           //object for "Integers" class

        obj.input(scn);    //accessing the input function
        obj.output();      //accessing the output function

        scn.close();
    }
}

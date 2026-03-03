/*else if Statements in Java */

/*Greeting as per the no. input by the User*/
import java.util.Scanner;    //importing the Scanner class

class Greet
{
    int num;

    public void input(Scanner scn)    //function to input the no.
    {
        System.out.print("Enter a no.: ");
        num = scn.nextInt();
    }
    public void check()    //to check and print output as per the value input by the user
    {
        if(num==1)    //1 for Greetings in Hindi
        {
            System.out.println("Namaste!");
        }
        else if(num==2)    //2 for Greetings in English
        {
            System.out.println("Hello!");
        }
        else if(num==3)    //3 for Greetings in French
        {
            System.out.println("Bonjour!");
        }
        else    //general message for nos. input other than 1,2,and 3.
        {
            System.out.println("Have a nice day!!!!");
        }
        /*writing anything other than an integer (a char value or any other non-
        numeric values, results in Throwing Exceptions) */
    }
}
public class Elseif
{
    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);
        Greet obj = new Greet();    //object creation for "Greet" class
        obj.input(scn);    //accessing the input function
        obj.check();       //accessing the check function

        scn.close();
    }
}

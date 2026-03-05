/*Checking whether the user is eligible to vote or not, using if...else statement */
import java.util.Scanner;
class Voter 
{
    int age;

    public void input(Scanner scn)    //method to input the age
    {
        System.out.print("Enter your age: ");
        age = scn.nextInt();
    }
    public void ageCheck()    //method to check the age
    {
        if (age>=18)    //condition
        {
            System.out.println("You are Eligible to Vote!!");    //for true statement
        }
        else    //for false statement
        {
            System.out.println("Sorry, you're not eligible to vote!!");
        }
    }
}
public class If_Else    //class to access all the methods
{
    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);
        Voter obj = new Voter();    //Creating Class Voter's objects
        obj.input(scn);    //object to access the input method
        obj.ageCheck();    //object to access the output method

        scn.close();
    }    
}

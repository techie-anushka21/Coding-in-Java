/*Greeting as per the no. given by the user using Switch Statement */
import java.util.Scanner;    //accessing the Scanner class
class Week
{
    int i;

    public void input(Scanner scn)    //method to input the no. from user
    {
        System.out.print("Enter a no.: ");
        i = scn.nextInt();    //scanning the input
    }
    public void show()    //method for implementing the switch case
    {
        switch(i){        //switch(operand)
            case 1:
                System.out.println("Monday");    //1 for Monday
                break;
            case 2:
                System.out.println("Tuesday");   //2 for Tuesday
                break;
            case 3:
                System.out.println("Wednesday"); //3 for Wednesday
                break;
            case 4:
                System.out.println("Thursday");  //4 for Thursday
                break;
            case 5:
                System.out.println("Friday");    //5 for Friday
                break;
            case 6:
                System.out.println("Saturday");  //6 for Saturday
                break;
            case 7:
                System.out.println("Sunday");    //7 for Sunday
                break;
            default:
                System.out.println("Invalid");    //default message
        }
    }
}
public class Weekdays {
    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);
        Week obj = new Week();    //object creation for "Week" class
        obj.input(scn);    //accessing the input method
        obj.show();        //accessing the show method
        scn.close();
    }
}

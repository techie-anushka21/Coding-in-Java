/*Taking 3 nos. from user and finding their Average */
import java.util.Scanner;

class Numbers
{
    double num1, num2, num3, avg;

    public void input(Scanner scn)
    {
        System.out.print("Enter 3 nos.: ");
        num1 = scn.nextDouble();    
        num2 = scn.nextDouble();
        num3 = scn.nextDouble();
    }
    public void find()    //formula
    {
        avg = (num1 + num2 + num3)/3;
        System.out.println("Average = "+avg);
    }
}
public class Avg
{
    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);
        Numbers obj = new Numbers();
        obj.input(scn);    //accessing the input method
        obj.find();        //accessing the find method

        scn.close();
    }    
}

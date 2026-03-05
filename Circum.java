/*Taking radius of a Circle and returning its radius. */
import java.util.Scanner;    //importing the Scanner class

class Circle
{
    double r, c;

    public void input(Scanner scn)    //method to input the radius of the circle
    {
        System.out.print("Enter the Radius of the Circle: ");
        r = scn.nextDouble();
    }
    public void res()    //method to calculate and print the Circumference of the Circle
    {
        c = 2*3.14*r;
        System.out.println("Circumference of the Circle = " + c);
    }
}
public class Circum
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);

        Circle obj = new Circle();    //object creation for "Circle" class
        obj.input(scn);    //accessing the input method
        obj.res();         //accessing the res method
        
        scn.close();
    }    
}
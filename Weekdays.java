import java.util.Scanner;
class Week
{
    int i;

    public void input(Scanner scn)
    {
        System.out.print("Enter a no.: ");
        i = scn.nextInt();
    }
    public void show()
    {
        switch(i){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid");
        }
    }
}
public class Weekdays {
    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);
        Week obj = new Week();
        obj.input(scn);
        obj.show();
        scn.close();
    }
}

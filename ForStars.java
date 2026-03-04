/*printing a Right-angled Triangle in Java using for loop*/
public class ForStars
{
    public static void main(String args[])
    {
        int n = 5;    //no. of rows
        for(int i=1; i<=n; i++)    //loop for each row
        {
            for(int j=1; j<=i; j++)    //loop to print stars in the row
            {
                System.out.print("*");    //print star withou new line 
            }
            System.out.println();    //move to next row
        }
    }
}

/*printing a Pyramid in Java using for loop*/
public class ForStars4
{
    public static void main(String args[])
    {
        int n=5;    //no. of rows
        for(int i=1; i<=n; i++)
        {
            for(int j=i; j<n; j++)
            {
                System.out.print(" ");    //print spaces before stars
            }
            for(int k=1; k <= 2*i-1; k++)
            {
                System.out.print("*");    //print stars
            }
            System.out.println();    //next row
        }
    }
}
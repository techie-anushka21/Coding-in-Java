/*printing a Left-angled Triangle in Java using for loop*/
public class ForStars2 {
    public static void main(String args[])
    {
        int n=5;    //no. of rows
        for (int i=1; i<=n; i++)    //loop for each row
        {
            for(int j=1; j<=n-i; j++)    //print spaces before the stars
            {
                System.out.print(" ");    //space for alignment
            }
            for(int k=1; k<=i; k++)    //print stars
            {
                System.out.print("*");
            }
            System.out.println();    //move to next row
        }
    }
}

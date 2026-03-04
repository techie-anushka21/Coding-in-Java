/*printing nos. from 1 to 10 and 10 to 1 using while loop */ 
public class NumberW
{
    public static void main(String args[])
    {
        int i=1, j=10;    //initialization
        System.out.println("Numbers from 1 to 10");    //1 to 10
        while(i<11)       //condition
        {
            System.out.println(i);
            i++;          //updation
        }
        System.out.println("Numbers from 10 to 1");    //10 to 1
        while(j>0)        //condition
        {
            System.out.println(j);
            j--;          //updation
        }
    }    
}

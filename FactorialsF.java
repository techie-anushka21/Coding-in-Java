/*Factorial of a no., using for loop */
class Facts
{
    int n=4;

    public void fact()    //method for operation
    {
        int res=1;    //a temporary variable
        for(int i=1; i<=n; i++)
        {
            res = res*i;    //method for getting the solution
        }
        System.out.println(res);
    }
}
public class FactorialsF
{
    public static void main(String args[])
    {
        Facts obj = new Facts();    //object creation
        obj.fact();                 //accessng the object
    }
}

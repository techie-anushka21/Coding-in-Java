/*functions in Java - With Parameters */

/*Add 2 nos. with the help of the above concept */
class Sum
{
    int sum;

    public void inputs(int a, int b)
    {
        sum = a + b;
        System.out.println("Sum = " + sum);
    }
}
public class functions1
{
    public static void main(String args[])
    {
        Sum obj = new Sum();
        obj.inputs(9,7);
    }    
}

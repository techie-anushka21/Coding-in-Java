/*for loop in Java */
/*for(initialization; condition; updation)
{
    //statement(s);
} */
/*print "Hello World!" in Java 5 times */
class Real
{
    public void loops()    //method for storing the for loop 
    {
        for(int i=1; i<=5; i++)    //for loop 
        {
            System.out.println("Hello World!");  //message to implement for loop 
        }
    }
}
public class HelloUsingForLoop
{
    public static void main(String args[])
    {
        Real obj = new Real();    //object creation for "Real" class
        obj.loops();    //accessing the object
    }
}
/*Non-primitve Data Types in Java- Strings, Arrays, Class, Objects, Interfaces */

/*String data type */
class Str{
    String name = "Senorita";

    /*Concatenating 2 strings */
    String a = "Coding";
    String b = " Makes Sense";
    String c = a + b;    //'+' is used to concatenate 2 strings

    public void out()
    {
        System.out.println("Name: "+name);
        System.out.println("Fact: "+c);
    }
}
public class Strings {
    public static void main(String args[])
    {
        Str obj = new Str();
        obj.out();
    }
}

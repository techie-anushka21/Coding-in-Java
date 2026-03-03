/*data types in Java- Primitive & Non-primitive*/

/*I. Primitve Data Types */
/*1. Integers- byte,short,int,long */
class Integers{
    byte a = 1;
    short b = 100;
    int c = 10010;
    long d = 10L;

    public void out1()
    {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
/*2. Floating Point Numbers- float,double */
class Floating{
    float e = 8.9F;
    double f = 9.9998;

    public void out2()
    {
        System.out.println(e);
        System.out.println(f);
    }
}
/*3. char and boolean */
class Others{
    char g = 'a';
    boolean h = true;

    public void out3()
    {
        System.out.println(g);
        System.out.println(h);
    }
} 
public class PDataTypes{
    public static void main(String args[])
    {
        Integers obj1 = new Integers();
        obj1.out1();

        Floating obj2 = new Floating();
        obj2.out2();

        Others obj3 = new Others();
        obj3.out3();
    }
}
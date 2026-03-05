/*methods in Java - With Parameters (Part 2) */

/*Provide the details of an Employee using the above concept */
class Emp
{
    String name, des, gender;
    int age;

    public void details(String n, String d, String g, int a)    //method with parameters
    {
        name = n;
        des = d;
        gender = g;
        age = a;
    }
    public void output()    //output method
    {
        System.out.println("Details of the New Employee:-");
        System.out.println("Name: "+name);
        System.out.println("Designation: "+des);
        System.out.println("Gender: "+gender);
        System.out.println("Age: "+age);
    }
}
public class methods2
{
    public static void main(String args[])
    {
        Emp obj = new Emp();
        obj.details("Senorita", "Manager", "Female", 34);    //accessing the input method and assigning values
        obj.output();    //accessing the output method
    }    
}

/*String Methods Part 2

  - Checks & Conversions. 

  - Methods used: isEmpty(), isBlank(), to CharArray(), valueOf(anyType)

  - Here, we will be giving preference to User inputs instead of hardcoded 
    values. */
    
import java.util.Scanner;

class StrMethods2
{
    public void converts(Scanner scn)
    {
        /*1. Checking whether a String is empty or not (a string is empty when its length
          is 0, so even if we mention blank spaces like " ", it is considered as "NOT
          EMPTY") 
          Syntax: stringName.isEmpty() */
        System.out.print("Enter a String: ");
        String s1 = scn.nextLine();
        System.out.println(s1.isEmpty());    /*returns "true" or "false" depending on the 
                                              user's input */ 

        /*2. Checking whether a String is blank or not (a string is blank either when nothing
         is mentioned during the input, or when the user clicks on space button and then
         click on "Enter" key 
         Syntax: stringName.isBlank() */
        System.out.println(s1.isBlank());    /*returns "true" or "false" depending on the 
                                              user's input */

        /*3. Converting a String into Array
          Syntax: stringName.toCharArray()  */
        System.out.print("Enter a String: ");
        String s2 = scn.nextLine();
        char[] ar = s2.toCharArray();
        for(char c : ar)    //loop is being used to create space between the elements
        {
            System.out.print(c + " ");
        }
        System.out.println();

        /*4. To convert any data type's value to String data type
          Syntax: stringName.valueOf() */
          System.out.print("Enter a Value: ");
          int a = scn.nextInt();
          String x = String.valueOf(a);
          System.out.println(x);
    }
}
public class StringMethods2
{
    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);
        StrMethods2 obj = new StrMethods2();
        obj.converts(scn);
        scn.close();
    }
}
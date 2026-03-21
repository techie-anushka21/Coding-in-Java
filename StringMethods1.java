/*String Methods Part 1

  - Basic information & extraction. 

  - Methods used: length(), charAt(index), indexOf(character), 
                  substring(startIndex,endIndex)

  - Here, we will be giving preference to User inputs instead of hardcoded 
    values. */
import java.util.Scanner;

class StrMethods
{
    public void methods(Scanner scn)
    {
        System.out.print("Enter your favourite color: ");
        String colorName = scn.next();

        System.out.println("Color Name: " + colorName);

        /*Extracting a String's length:- 
          Syntax: stringName.length() */

        int stringLength = colorName.length();
        System.out.println("String length of " + colorName + " = " + stringLength);

        /*Extracting a particular Character from String:-
          Syntax: stringName.charAt(index) */
        
        System.out.print("Enter the index of String you want to access: ");
        int index = scn.nextInt(); 
        
            if(index >= 0 && index < colorName.length())
            {
                System.out.println(colorName.charAt(index));
            }
            else
            {
                System.out.println("Invalid index entered!");
            }

        /*Extracting the Index of a Character entered:-
          Syntax: stringName.indexOf(character) */

        System.out.print("Enter the Character whose index you want to access: ");
        String c = scn.next();

        System.out.println(colorName.indexOf(c));

        /*Extracting the Substring of a String:-
          Syntax: stringName.substring(startIndex,endIndex) */

        System.out.print("Enter the index range of substring: ");
        int startIndex = scn.nextInt();
        int endIndex = scn.nextInt();

        if(startIndex>=0 && startIndex<colorName.length())
        {
            if(endIndex>startIndex && endIndex<=colorName.length())
            {
                System.out.println(colorName.substring(startIndex,endIndex));
            }
            else
            {
                System.out.println("Invalid index entered!");
            }
        }
        else
        {
            System.out.println("Invalid index entered!");
        }
        /*the endIndex is always = endIndex - 1 (means the substring included 
          is 1 less than the entered endIndex) */
    }
}
public class StringMethods1
{
    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);
        StrMethods obj = new StrMethods();
        obj.methods(scn);
        scn.close();
    }
}

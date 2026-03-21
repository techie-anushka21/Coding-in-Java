/*Taking String input from the User */
import java.util.Scanner;    //importing Scanner Class

public class StringsInput
{
    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter your Country: ");
        String input = scn.next();    //scanning the country name

        scn.nextLine();    //to avoid the "buffer" problem

        System.out.print("Enter your City: ");
        String input2 = scn.nextLine();    //scanning the city name

        System.out.println("Country entered: " + input);
        System.out.println("City entered: " + input2);

        scn.close();
    }
}
/*Difference between scn.next() and scn.nextLine():-
  1. scn.next() - it scans only a particular word and not a sentence formed by 
                  a group of words. 

  2. scn.nextLine() - it overcomes the disadvantage of scn.next() and scans the
                      entire group of words too.
                    - here there are no buffer issues. */
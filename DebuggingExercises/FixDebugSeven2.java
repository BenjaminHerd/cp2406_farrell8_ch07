// Program prompts user to enter a series of integers
// separated by spaces
// Program converts them to numbers and sums them

//import statement for java utility package that includes Scanner
import java.util.*;
public class FixDebugSeven2
{
    public static void main(String[] args)
    {
        //Variable declaration
        String str;
        int x;
        int length;
        int start = 0;
        int num;
        int lastSpace = -1;
        int sum = 0;
        String partStr;

        //Scanner statement to get user input through keyboard
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a series of integers separated by spaces >> ");

        //Assigns a variable to input from user input
        str = in.nextLine();

        //Length variable is assigned to the length of the string
        length = str.length();

        //For loop initializer
        for(x = 0; x < length; ++x)
        {
            //If the string entered has spaces within the string, type integer on a new line
            //Looks at entered string by individual characters
            if(str.charAt(x) == ' ')
            {
                partStr = str.substring(lastSpace + 1, x);

                //Takes the part of the string that can be converted into an integer
                num = Integer.parseInt(partStr);
                System.out.println("                " + num);
                sum += num;
                lastSpace = x;
            }
        }
        //Smaller part of the string that adds the sum of the numbers under the end line
        partStr = str.substring(lastSpace + 1, length);
        num = Integer.parseInt(partStr);
        System.out.println("                " + num);
        sum += num;
        System.out.println("         -------------------" +
                "\nThe sum of the integers is " + sum);
    }
}
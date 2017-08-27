/*
Task:
Count the number of words entered in a string by a user.
Words checked through separators such as spaces and punctuation.
 */

//import statement for option pane
import javax.swing.*;


public class CountWords {
    public static void main(String[] args) {

        //variable declaration
        String userMessage;
        int length;
                                                                // Char ch; could be used
        //Start counters at 0 and increment from there
        int wordCount = 0;

        //Used solution for reference for boolean variable
        boolean lastCharPunctuation = false;

        // x is a placeholder loop control variable
        int x;

        //Assigns variable to user input String
        userMessage = JOptionPane.showInputDialog(null, "Please enter a sentence: ");

        //Sets length of the the number of loop iterations equal to the length of the string
        length = userMessage.length();

        //while x (which is at zero when the loop starts) is less than the
        //length of the string, add +1 to x after a loop iteration
        for(x = 0; x < length; ++x)
        {
            //Checking for each different type of punctuation possible in a standard sentence

            //For efficiency, assigning ch variable to: ch = userMessage.charAt(x); will only require:
            // ch == '!' || ch == '?', etc. in if statement

            if(userMessage.charAt(x) == ' ' || userMessage.charAt(x) == '-' || userMessage.charAt(x) == ',' ||
                    userMessage.charAt(x) == ';' || userMessage.charAt(x) == ':' || userMessage.charAt(x) == '!' || userMessage.charAt(x) == '?')
            {
                //Adding +1 to wordCount variable
                ++wordCount;

                //Takes away -1 from wordCount if punctuation above is found
                if(lastCharPunctuation)
                    --wordCount;
                lastCharPunctuation = true;
            }
            //otherwise, the boolean value remains false
            else
                lastCharPunctuation = false;
        }
        //If the last character was not punctuation (lastCharPunctuation = false), then +1 to wordCount
        if(!lastCharPunctuation)
            ++wordCount;

        //Output dialog box with some formatting
        JOptionPane.showMessageDialog(null, "There are " + wordCount + " words in this sentence.\n" + userMessage);
    }
}

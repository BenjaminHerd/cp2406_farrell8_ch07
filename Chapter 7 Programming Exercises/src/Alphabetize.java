/*
Task:
Sorting three strings into alphabetical order
 */

//import statement for option pane
import javax.swing.*;

public class Alphabetize {
    public static void main(String[] args) {

        //variable declaration
        String sentence1, sentence2, sentence3;

        //Assigns variables to user Input
        sentence1 = JOptionPane.showInputDialog(null, "Please enter the first string: ");
        sentence2 = JOptionPane.showInputDialog(null, "Please enter the second string: ");
        sentence3 = JOptionPane.showInputDialog(null, "Please enter the third string: ");

        //if statements to check whether strings entered were alphabetical,
        //converting to lowercase, then comparing using compareTo()
        if(sentence1.toLowerCase().compareTo(sentence2.toLowerCase()) < 0
                && sentence2.toLowerCase().compareTo(sentence3.toLowerCase()) < 0)
            System.out.println("Messages sent in alphabetical order.");
        else
            System.out.println("Messages not sent in alphabetical order.");

}
}

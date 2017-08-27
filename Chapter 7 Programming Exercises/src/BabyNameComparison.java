/*
Task: Create an app that takes three first names from the user and then combines them in every
possible two-name combination.

i.e.: name1 + name2
      name1 + name3
      name2 + name1
      name2 + name3
      name3 + name1
      name3 + name2

      SideNote: Does name1 + name1/name2 + name2/name3 + name3 count also?
 */

//import statement for scanner
import java.util.Scanner;

public class BabyNameComparison {
    public static void main(String[] args) {

        //variable declaration
        String name1;
        String name2;
        String name3;

        //Get input for three first names
        System.out.println("Please enter the 1st First name: ");
        Scanner input = new Scanner(System.in);
        name1 = input.nextLine();

        System.out.println("Please enter the 2nd First name: ");
        name2 = input.nextLine();

        System.out.println("Please enter the 3rd First name: ");
        name3 = input.nextLine();

        //Variable check
        System.out.println("The three names entered were: " + name1 + " " + name2 + " " + name3);
        System.out.println("_________________________");

        //Print each of the two-name combinations out with following statements
        System.out.println(name1 + " " + name2);
        System.out.println(name1 + " " + name3);

        System.out.println(name2 + " " + name1);
        System.out.println(name2 + " " + name3);

        System.out.println(name3 + " " + name1);
        System.out.println(name3 + " " + name2);

    }
}

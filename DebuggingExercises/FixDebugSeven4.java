// Converts a string to lowercase, and 
// displays the string's length
// as well as a count of letters
public class FixDebugSeven4
{
   public static void main(String[] args)
   {
      //string variable assigned to quote
      String aString = "HELP!! I need to get 37 things DONE today!!";
      int numLetters = 0;

      //length of the string is assigned to a variable
      int stringLength = aString.length();
      System.out.println("In all lowercase, the sentence is: ");

      //For loop initializer
      for(int i = 0; i < stringLength; i++)
      {
         //sets character variable in for loop that checks each character of the 'aString'
         //then prints each letter as a lower case alphanumeric value
         char ch = Character.toLowerCase(aString.charAt(i));
         System.out.print(ch);
         //if a character in the string checked by the for loop is an alphabetical letter
         //Add to the sum of the number of letters for each letter found
         //Punctuation is NOT included
         if(Character.isLetter(ch))
            numLetters++;
      }
      System.out.println();
      System.out.println
         ("The number of CHARACTERS in the string is " + stringLength);
      System.out.println("The number of LETTERS is " + numLetters);
   }
}
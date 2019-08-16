/* I pledge by my Honor that I have not cheated, and will not 
cheat, on this assignment. Greg Lemrow*/

import javax.swing.JOptionPane;

public class VowelCount
{

   /*Today on sinus med fun with Greg, we shall attempt to use dialog boxes!
   This method will (hopefully) allow us to count the number of vowels by
   letter and return a number of non-vowel letters! 
   Or it'll break. One of the two. Sudafed, take the wheel.*/
   public static void main(String[] args)
   {

      String inputString; //User's input string
      String repeat; //Continue entering strings?
      
      
      //Get the user to enter a string.
      inputString = JOptionPane.showInputDialog("Enter a string of characters: ");
      
      //Test the input
      //System.out.println(inputString);
      
      int stringLength = inputString.length() - 1; //Length of the input string
      
      
         int charPosition = 0;
         int countA = 0;
         int countE = 0;
         int countI = 0;
         int countO = 0;
         int countU = 0;
         int countConsonants = 0;
      
         
      do
      {   
         //Begin a for loop to cycle through the positions and count vowels.
         for(charPosition = 0; charPosition <= stringLength; charPosition++)
         {
         
            char character = inputString.charAt(charPosition);
         
            switch (character)
            {
               case 'A':
               case 'a':
                  countA++;
                  break;
               case 'E':
               case 'e':
                  countE++;
                  break;
               case 'I':
               case 'i':
                  countI++;
                  break;
               case 'O':
               case 'o':
                  countO++;
                  break;
               case 'U':
               case 'u':
                  countU++;
                  break;
               default:
                  countConsonants++;
                  break;  
            }  
         }
      
         JOptionPane.showMessageDialog(null, "a: " + countA + "\ne: " +
                                countE + "\ni: " + countI + "\no: " + countO +
                                "\nu: " + countU + "\n\nNumber of non-vowel characters: " + countConsonants);
         //Ask the user if they'd like to enter another string.
         repeat = JOptionPane.showInputDialog("Would you like to enter another string?" +
                                          " Enter yes or no: ");
      } while ("YES".equalsIgnoreCase(repeat));
      
      
      
      
      //End the program.
      System.exit(0);

   }
}
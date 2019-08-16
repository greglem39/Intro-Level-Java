/* I pledge by my Honor that I have not cheated, and will not 
cheat, on this assignment. Greg Lemrow*/

import java.util.Scanner;

public class ReverseNumber
{

   //Reverses the digits of an integer mathematically
   public static void main(String[] args)
   {
      int number;
      
      Scanner scan = new Scanner(System.in);
     
     
     //Do loop to make sure the number value is greater than 0.
     do
     { 
      //Prompt the user to enter an integer.
      System.out.println("Enter a positive integer: ");
      
      number = scan.nextInt();
     } while (number < 0);
     
     System.out.println("That number reversed is " + reverse(number));
   
   }
   
  public static int reverse(int i1)
  {
   int result, lastDigit, reversal = 0;
   
   //Get the last digit as a remainder.
   lastDigit = i1 % 10;
   
   //Store the lastDigit as an actual digit.
   reversal = (reversal * 10) + lastDigit;
   
   //Cut the number down to size.
   i1 = i1 / 10;
   
   /*Multiply the last digit by ten so it takes up the tens place 
   and stick the original into the ones place!*/ 
   result = (reversal * 10) + i1;
   
   return result;
  }

}
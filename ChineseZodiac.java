/* I pledge by my Honor that I have not cheated, and will not 
cheat, on this assignment. Greg Lemrow*/

import java.util.Scanner;

/*This program will prompt the user to input a year and return
their Chinese Zodiac animal!*/
public class ChineseZodiac
{

   public static void main(String[] args)
   {
   
   Scanner scan = new Scanner(System.in);
   
   System.out.println("Please enter a year: ");
   int year = scan.nextInt();
   int zodYear = year % 12;
   
   while (year < 0)
      {
       System.out.println("Enter anno domini (AD) years please!" +
                           " \nRe-enter the year: ");
       year = scan.nextInt();
      }
   
   if (year >= 0)
      switch(zodYear)
      {
      
       case 11:
         System.out.println("The year " + year + " is the year of the sheep.");
         break;
       case 10:
         System.out.println("The year " + year + " is the year of the horse.");
         break;
       case 9:
         System.out.println("The year " + year + " is the year of the snake.");
         break;
       case 8:
         System.out.println("The year " + year + " is the year of the dragon.");
         break;
       case 7:
         System.out.println("The year " + year + " is the year of the rabbit.");
         break;
       case 6:
         System.out.println("The year " + year + " is the year of the tiger.");
         break;
       case 5:
         System.out.println("The year " + year + " is the year of the ox.");
         break;
       case 4:
         System.out.println("The year " + year + " is the year of the rat.");
         break;
       case 3: 
         System.out.println("The year " + year + " is the year of the pig.");
         break;
       case 2:
         System.out.println("The year " + year + " is the year of the dog.");
         break;
       case 1:
         System.out.println("The year " + year + " is the year of the rooster.");
         break;
       default:
         System.out.println("The year " + year + " is the year of the monkey.");
         
      }                         
   
      
   
   }

}
/* I pledge by my Honor that I have not cheated, and will not 
cheat, on this assignment. Greg Lemrow*/

import java.util.Scanner;

/*It's time to get festive and write a program that'll sing verses 
from the Twelve Days of Christmas dependent on the number the user inputs*/ 
public class TwelveDays
{

   public static void main(String[] args)
   {
      
      
      Scanner scan = new Scanner(System.in);
      
      //This will prompt the user to input a day number.
      System.out.println("How many days (1 to 12)?");
      
      //"days" will store the user's input value
      int days = scan.nextInt();
      int index = 1;
      
      
      //Test
      //System.out.println(days);
      
      //Set values to prompt user to re-enter numbers outside the domain.
      while (days < 1 || days > 12)
      {
         System.out.println("Invalid entry. Please enter a number within" +
                           " the range 1 to 12.");
         System.out.println("How many days (1 to 12)?");
         days = scan.nextInt();
         
      }
      
      int currentDay = 1;
      
      while (currentDay >= 1 && currentDay <= days)
      {
         
         
         String suffix = "";
         int numSuffix = currentDay;
         
         
         switch(numSuffix)
         {
                        
            default:
               suffix = "th";
               numSuffix = currentDay - 1;
               break;
            case 3:
               suffix = "rd";
               numSuffix = currentDay - 1;
               break;
            case 2: 
               suffix = "nd"; 
               numSuffix = currentDay - 1;
               break;
            case 1: 
               suffix = "st";
               break;
            
         }
   System.out.println("On the " + currentDay + suffix + " day of Christmas," +
                                 " my true love gave to me");      
       switch(currentDay)
       {
        case 12:
               System.out.println("Twelve drummers drumming");
        case 11:
               System.out.println("Eleven pipers piping");
        case 10:
               System.out.println("Ten lords a-leaping");
        case 9:
               System.out.println("Nine ladies dancing");
        case 8:
               System.out.println("Eight maids a-milking");
        case 7:
               System.out.println("Seven swans a-swimming");
        case 6: 
               System.out.println("Six geese a-laying");
        case 5:
               System.out.println("Five golden rings");
         case 4:
               System.out.println("Four calling birds");
         case 3:
               System.out.println("Three French hens"); 
         case 2: 
               System.out.println("Two turtle doves, and");
         case 1:
               System.out.println("A partridge in a pear tree!");
               currentDay += 1;           
         }
     }
   }         
}
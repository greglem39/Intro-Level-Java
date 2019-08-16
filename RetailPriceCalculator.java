/* I pledge by my Honor that I have not cheated, and will not 
cheat, on this assignment. Greg Lemrow*/

import java.util.Scanner;
import java.text.NumberFormat;

public class RetailPriceCalculator
{

  //First set the main method up to scan in the price and markup percentage.
  public static void main(String[] args)
  {
  
      double price, markupPercent;
      
      NumberFormat fmt1 = NumberFormat.getCurrencyInstance();
      NumberFormat fmt2 = NumberFormat.getPercentInstance();      
      
      Scanner scan = new Scanner(System.in);
      
      //Set up a nice loop so the user can't enter in a value below 0.
      do
      {
         
         //Prompt user for the price
         System.out.println("Please enter the item price: ");
      
         price = scan.nextDouble();
      
         //Test price storage.
         //System.out.println(price);
      
         //Prompt the user for the markup percent
         System.out.println("Please enter the markup percent: ");
         double percent = scan.nextDouble();
         
         //Divide by 100 to store a decimal value for calculations. 
         markupPercent = percent/100;
         
      
      } while (price < 0 || markupPercent <0);  
      
      //Put it all together using our handy-dandy retail method to get the retail price from our input!
      //Maybe. If the compiler smiles upon us.
      System.out.println("The item's retail price (at a " + fmt2.format(markupPercent) + " markup) is " + 
                           fmt1.format(retail(price, markupPercent)));
  }
  
  //Second method will calculate the retail price using the price and markup percent.
  public static double retail(double d1, double d2)
  {
      double result;
   
      //Set up our calculations to get our retail price.
      result = d1 + (d1 * d2);
   
      return result;

   }
}
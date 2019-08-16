// This file is a test document for conversions.

import java.util.Scanner;

public class ConversionTest
{
   public static void main(String[] args)
   {
      double inches;
      
      
      Scanner scan = new Scanner(System.in);
      
      //This scanner will allow the user to input a number of inches to get a number of fee.
      System.out.println("Enter a number of inches here: ");
      inches = scan.nextDouble();
      
      float feet = (float) inches / 12;
      
      float yards = feet / 3;
      
      System.out.println(inches + " inches is equal to: " + feet + " and " + yards + " yards.");
   }
}
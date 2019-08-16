// I pledge by my Honor that I have not cheated, and will not cheat, on this assignment. Greg Lemrow

import java.util.Scanner;
import java.util.Random;


public class UserNames
{
   /*This program will generate a username for an individual 
   inputing their first and last name*/
   public static void main(String[] args)
   {
      Random generator = new Random();
      
      int num1, num2, num3; 
      String fName, lName, mutation2;
      char mutation1;
      final String userName;
      
      //Three randomly generated numbers.
      num1 = generator.nextInt(10);
      num2 = generator.nextInt(10);
      num3 = generator.nextInt(10);
      
      //System.out.println("Randomly generated numbers: " + num1 + num2 + num3);
      
      Scanner scan = new Scanner(System.in);
      //The user will input their first name with this prompt.
      System.out.println("Enter your first name: ");
      fName = scan.nextLine();
      
      //The user will input their last name with this prompt.
      System.out.println("Enter your last name: ");
      lName = scan.nextLine();
      
      //Mutated threads will provide the letters for the username.
      //Print statements used to test code for errors.
      mutation1 = fName.charAt(0);
      mutation2 = lName.substring(0, 3);
      
      //System.out.println("First character of first name: " + mutation1);
      //System.out.println("First three characters of last name: " + mutation2);
      
      userName = mutation1 + mutation2 + num1 + num2 + num3;
      System.out.println("Your username is: " + userName);
      
   }
}
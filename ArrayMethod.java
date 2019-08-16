/* I pledge by my Honor that I have not cheated, and will not 
cheat, on this assignment. Greg Lemrow*/

import java.util.Scanner;

/*This program will (hopefully) ask the user to enter in an
array of ten numbers, return them in reverse order, grab the sum of 
all the numbers, take a limit, calculate the average of those under
the limit, then display the values higher than the average. Here we go.*/  
public class ArrayMethod
{

   static int sum = 0;
   static int[] numbers = new int[10];
   
   public static void main(String [] args)
   {   
      
      Scanner scan = new Scanner(System.in);
      
      //Prompt user to enter numbers.
      System.out.println("Please enter 10 numbers.");
      
      for (int i = 0; i < numbers.length; i++)
         numbers[i] = scan.nextInt();
         
      display(numbers);
         
      reverse(numbers);
  
      sum(numbers);
     
      System.out.print("\nPlease enter a limit: ");
      int limit = scan.nextInt();
      
      limitList(numbers, limit);
      
      averageMethod(numbers);
      
   }
   
   //This method will prompt the numbers to be displayed as entered.
   public static void display (int[] list)
   {
      
      System.out.print("The numbers are ");
     for (int i = 0; i < list.length; i++)
      {

      System.out.print(numbers[i] + " ");
      
      }
   }
   
   //This method will reverse the numbers entered.
   public static void reverse (int[] list)
   {
   
      System.out.print("\nThe numbers in reverse order are ");
      int[] reverseList = new int[10];
      
      for (int i = list.length - 1, j = 0; i > - 1; i--, j++)
      {
      
         reverseList[j] = list[i];

      }
      
      for (int i = 0; i < list.length; i++)
         System.out.print(reverseList[i] + " ");
   
   }
   
   
   
   //This method will return the sum of all numbers.
   public static void sum(int[] list)
   {
      
      
      for (int i = 0; i < list.length; i++)
         sum += list[i];
      
       System.out.print("\nThe sum of all numbers is " + sum);
   }
   
   //This method will display the numbers less than the limit value.
   public static void limitList(int[] list, int limit)
   {
   
     
     for (int i = 0; i < list.length; i++) 
       { 
         if (list[i] < limit)
            System.out.print(list[i] + " ");

       }
     System.out.println(" are less than " + limit);
   }
   
   /*This method will display the average of numbers less than the limit
   and the numbers above the average.*/
   public static void averageMethod(int[] list)
   {

      double average = 0;
      System.out.print("The average is ");
      
      for (int i = 0; i < list.length; i++)
         {
            
            average = sum / 10.0;

         }
      System.out.println(average);
      
      for (int i = 0; i < list.length; i++)
         {
            if (list[i] > average)
               System.out.print(list[i] + " ");
         }
      System.out.print("are greater than the average.");
      
   
   }

}
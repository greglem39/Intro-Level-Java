/* I pledge by my Honor that I have not cheated, and will not 
cheat, on this assignment. Greg Lemrow*/

import java.util.Scanner;

/*This program will (hopefully) ask the user to enter in an
array of ten numbers, return them in reverse order, grab the sum of 
all the numbers, take a limit, calculate the average of those under
the limit, then display the values higher than the average. Here we go.*/  
public class ArrayMethod2
{

   public static void main(String [] args)
   {
     
      int[] numbers = new int[10];
      Scanner scan = new Scanner(System.in);
      
      //Prompt user to enter numbers.
      System.out.println("Please enter 10 numbers.");
      
      for (int i = 0; i < numbers.length; i++)
         numbers[i] = scan.nextInt();
         
      display(numbers);
      
      System.out.print("The numbers are ");
      for (int i = 0; i < numbers.length; i++)
         System.out.print(numbers[i] + " ");
         
      reverse(numbers);
      
      System.out.print("\nThe numbers in reverse order are ");
      for (int i = 0; i < numbers.length; i++)
         System.out.print(numbers[i] + " ");
      
      
   }
   
   //This method will prompt the numbers to be displayed as entered.
   public static int[] display (int[] list)
   {
   
     for (int i = 10, j = list.length - 1; i < list.length/2; i--, j--)
      {
      
      int temp = list[i];
      list[i] = list[j];
      list[j]= temp;
      
      }
      
      return list;
   
   }
   
   //This method will reverse the numbers entered.
   public static int[] reverse (int[] list)
   {
   
      for (int i = 0, j = list.length - 1; i < list.length/2; i++, j--)
      {
      
      int temp = list[i];
      list[i] = list[j];
      list[j]= temp;
      
      }
      
      return list;
   
   }
   
   //This method will return the sum of all numbers.
   public static int[] sum(int[] list)
   {
      
      int sum = 0;
      for (int i = 0; i < list.length; i++)
         sum += list[i];
      
      return sum;
   }

}
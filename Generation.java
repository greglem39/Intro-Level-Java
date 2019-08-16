/* I pledge by my Honor that I have not cheated, and will not 
cheat, on this assignment. Greg Lemrow*/

import java.util.Scanner;

public class Generation
{

/*This program will allow the user to input their birthyear
and return a name for their generation.*/
   public static void main(String[] args)
   {
   
   Scanner scan = new Scanner(System.in);
   
   int birthYear;
   
   //Prompt user to input birthyear.
   System.out.println("Please input your birthyear here: ");
   birthYear = scan.nextInt();
   
   //System.out.println(birthYear);
   
   /*If else if statement will help designate generation and prompt for 
   proper range.*/
   
   
   while (birthYear <= 1882 || birthYear >= 2018)
   {
      System.out.println("Sorry, that year is not within the valid range." +
                        " \nPlease re-enter the year: ");
      birthYear = scan.nextInt();
   }   
   if (birthYear >= 1883 && birthYear <= 1900)
        System.out.println("You are part of the Lost Generation.");
   else if (birthYear >= 1901 && birthYear <=1924)
      System.out.println("You are part of the GI Generation.");
   else if (birthYear >= 1925 && birthYear <= 1945)
      System.out.println("You are part of the Silent Generation");
   else if (birthYear >= 1946 && birthYear <= 1964)
      System.out.println("You are part of the Greatest Generation");
   else if (birthYear >= 1965 && birthYear <= 1984)
      System.out.println("You are part of Generation X.");
   else if (birthYear >= 1985 && birthYear <= 2004)
      System.out.println("You are a Milennial.");
   else if (birthYear >= 2005 && birthYear <= 2017)
      System.out.println("You are part of Generation Z.");
   
   
   }



}
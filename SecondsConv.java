// I pledge by my Honor that I have not cheated, and will not cheat, on this assignment. Greg Lemrow

import java.util.Scanner;

public class SecondsConv
{
   //This program will take an input number of seconds and convert it to hours, minutes, and seconds.
   public static void main(String[] args)
   {
      long seconds, minutes, hours;
      Scanner scan = new Scanner(System.in);
      
      // This will prompt the user to input the number of seconds.
      System.out.println("Enter the number of seconds: ");
      seconds = scan.nextLong();
      
      //Calculations to convert from seconds to minutes and hours.
      minutes = seconds / 60;
      hours = minutes / 60;
      
      System.out.println("Hours: " + hours + "\nMinutes: " + minutes % 60 + "\nSeconds: " + seconds % 60);
      
   }
}
//I pledge by my Honor that I have not cheated, and will not cheat, on this assignment. Greg Lemrow
import java.util.Scanner;
import java.text.NumberFormat;


public class PayrollReport
{
   // This program will generate a payroll report for an employee.
   public static void main(String[] args)
   {
   
      String employeeName;
      double hours, hourlyPay, grossPay, netPay, fedTax, stateTax, totalDeductions;
      
      final double STATE_TAX_RATE = 0.09; //FL tax withholding rate.
      final double FEDERAL_TAX_RATE = 0.2; //Fed tax withholding rate.
      
      Scanner scan = new Scanner(System.in);
      
      NumberFormat fmt1 = NumberFormat.getCurrencyInstance();
      NumberFormat fmt2 = NumberFormat.getPercentInstance();
      
      //This will prompt the user to enter their name.
      System.out.println("Enter your name: ");
      employeeName = scan.nextLine();
      
      //Test output.
      //System.out.println(employeeName);
      
      //This will prompt the user to enter their hours.
      System.out.println("Enter your number of hours: ");
      hours = scan.nextDouble();
      
      //Test output.
      //System.out.println(hours);
      
      //This will prompt the user to enter their hourly pay rate.
      System.out.println("Enter your hourly pay rate: ");
      hourlyPay = scan.nextDouble();
      
      //Calculations for gross pay.
      grossPay = hours * hourlyPay;
      
      //Calculations for deductions and net pay.
      stateTax = grossPay * STATE_TAX_RATE;
      fedTax = grossPay * FEDERAL_TAX_RATE;
      totalDeductions = stateTax + fedTax;
      
      netPay = grossPay - (stateTax + fedTax);
      
      System.out.println("Employee name: " + employeeName);
      System.out.println("Hours worked: " + hours);
      System.out.println("Hourly pay rate: " + fmt1.format(hourlyPay));
      System.out.println("\n\nGross pay rate: " + fmt1.format(grossPay));
      System.out.println("Deductions: \n\nFederal tax @ 20%: " + fmt2.format(FEDERAL_TAX_RATE));
      System.out.println("State tax @ 9%: " + fmt2.format(STATE_TAX_RATE));
      System.out.println("Total deductions: " + fmt1.format(totalDeductions));
      System.out.println("Net Pay: " + fmt1.format(netPay));
      
   
   }

}
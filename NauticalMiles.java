/* I pledge by my Honor that I have not cheated, and will not cheat, 
on this assignment. Greg Lemrow*/
// This program is written to convert nautical miles to kilometers and miles.
public class NauticalMiles
{
   /* This function will calculate the values of kilometers and miles 
   in 200 nautical miles.*/
   public static void main(String[] args)
   {
   int nauticalMiles = 200;
   final double KMCONVERTER = 1.852;
   /* Using the above variables as a value and a constant rate of change, 
   the kiloMeter variable will calculate the value.*/
   double kiloMeters = nauticalMiles * KMCONVERTER;
   
   /* Here, the same principle is applied. mileConverter is a 
   constant conversion rate used to give the number of miles 
   in a given value of nautical miles.*/
   final double MILECONVERTER = 1.150779;
   double Miles = nauticalMiles * MILECONVERTER;
   
   System.out.println("200.0 nautical miles is equivalent to");
   System.out.print(kiloMeters + " kilometers or ");
   System.out.println( Miles + " miles.");
  
   }

}
import java.util.Scanner;

public class GasMileage
{
   public static void main(String[] args)
   {
      int miles;
      double gallons, mpg;
      
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter the number of miles ");
      
      miles = scan.nextInt();
      
      System.out.print("Enter the number of gallons used ");
      gallons = scan.nextDouble();
      
      mpg = miles / gallons;
      
      System.out.println("Miles per galon:" +mpg);
   }
}
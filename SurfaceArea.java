/* I pledge by my Honor that I have not cheated, and will not 
cheat, on this assignment. Greg Lemrow*/

import java.util.Scanner;
import java.text.NumberFormat;
import java.text.DecimalFormat;

//Create a program that will take in the radius and height of a cylinder and return the area
public class SurfaceArea
{

   public static void main(String[] args)
   {
   
   double radius, height;
   DecimalFormat fmt = new DecimalFormat("0.#####");
   
   Scanner scan = new Scanner(System.in);
   
   //We can't have any cylinders with negative heights and radii!
   //Nor can they be equal to zero!
   //Set up a loop to prevent this!
   do
   {
      //Prompt the user to enter in both values.
      System.out.println("Enter the cylinder's radius: ");
      radius = scan.nextDouble();
   
      System.out.println("Enter the cylinder's height: ");
      height = scan.nextDouble();
   } while (radius <= 0 || height <= 0);
   
   //Return a value for surface area using our area method! 
   //Or break the code. Hopefully the first, but I figure it's 50/50.
   System.out.println("The surface area of a cylinder is: " + fmt.format(area(radius, height)));
   
   }
   
   public static double area(double d1, double d2)
   {
      
      //Comp1 and Comp2 will be the components of base and height of cylinder.
      double result, comp1, comp2;
      
      //Calculate each of the components
      comp1 = (2 * d1 * d2) * Math.PI;
      
      comp2 = (2 * Math.PI * Math.pow(d1, 2));
      
      //Add both components up to get the surface area
      result = comp1 + comp2;
      
      return result;
   
   }

}

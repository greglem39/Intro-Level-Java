//I pledge by my Honor that I have not cheated, and will not cheat, on this assignment. Greg Lemrow

import java.util.Scanner;
import java.text.DecimalFormat;

public class HeronFormula
{
   /*This program will read the lengths of the sides of a triangle based on user input,
   and will use Heron's formula to calculate the area to three decimal places.*/
   public static void main(String[] args)
   {
      
      // s = (side1 + side2 + side 3)/2
      double side1, side2, side3; 
      double equationS, area, radical;
      
      Scanner scan = new Scanner(System.in);
      
      //The following scanner outputs will prompt the user to input the sides of the triangle.
      System.out.println("Enter the length of side 1: " );
      side1 = scan.nextDouble();
      
      System.out.println("Enter the length of side 2: ");
      side2 = scan.nextDouble();
      
      System.out.println("Enter the length of side 3: ");
      side3 = scan.nextDouble();
      
      //Use s formula above to calculate for s.
      equationS = (side1 + side2 + side3)/2;
      
      //Check results with print statement
      //System.out.println("S = " + equationS);
      
      //Store values of equationS and sides for calculation beneath square root.
      radical = (equationS * (equationS - side1) * (equationS - side2) * (equationS - side3));
      
      //Now use equationS and the sides to get Heron's formula
      area = Math.sqrt(radical);
      
      DecimalFormat fmt = new DecimalFormat("0.###");
      System.out.println("The triangle's area: " + fmt.format(area));
   }

}
/* I pledge by my Honor that I have not cheated, and will not 
cheat, on this assignment. Greg Lemrow*/

import java.util.Scanner;

public class SumMatrix
{
  static int row = 3;
  static int col = 3;

   public static void main(String[] args)
   {
      

      
      Scanner scan = new Scanner(System.in);
      double[][] matrix1 = new double[row][col];
      double[][] matrix2 = new double[row][col];
      
      //Prompt the user to enter matrix 1.
      System.out.println("Enter matrix1: ");
      for (int i = 0; i < row; i++)
      {
         for (int j = 0; j < col; j++)
         {
            matrix1[i][j] = scan.nextDouble();
            
         }
      }
      //Prompt the user to enter matrix 2.
      System.out.println("\nEnter matrix2: ");
      for (int i = 0; i < row; i++)   
      {
         for (int j = 0; j < col; j++)
         {
            matrix2[i][j] = scan.nextDouble();
         }
      }
      
      System.out.println("The sum of the matrices is\n" +
         matrix1[0][0] + " " + matrix1[0][1] + " " +
         matrix1[0][2] + "\n" + matrix1[1][0] +
         " " + matrix1[1][1] + " " + matrix1[1][2] + "\n" + matrix1[2][0] +
         " " + matrix1[2][1] + " " + matrix1[2][2] + "\n\n\t\t+\n");
      
      System.out.println(matrix2[0][0] + " " + matrix2[0][1] + " " +
        matrix2[0][2] + "\n" + matrix2[1][0] +
        " " + matrix2[1][1] + " " + matrix2[1][2] + "\n" + matrix2[2][0] +
        " " + matrix2[2][1] + " " + matrix2[2][2] + "\n\n\t\t=\n");
        
     matrixSum(matrix1, matrix2);
 
   }
   
   public static void matrixSum(double[][] m1, double[][] m2)
   {
      double[][] matrix3 = new double[row][col];
      
      for (int i = 0; i < row; i++)
      {
         for (int j = 0; j < col; j++)
         {
            matrix3[i][j] = m1[i][j] + m2[i][j];
         }
      }
      
      System.out.println(matrix3[0][0] + " " + matrix3[0][1] + " " + matrix3[0][2] +
         "\n" + matrix3[1][0] + " " + matrix3[1][1] + " " + matrix3[1][2] + "\n" +
         matrix3[2][0] + " " + matrix3[2][1] + " " + matrix3[2][2]);
      
   }

}
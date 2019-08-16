import java.util.Scanner;

public class Exam2
{

 public static void menu()
 {
   System.out.println("0. End");
   System.out.println("1. Include");
   System.out.println("2. Change");
   System.out.println("3. Delete");
   System.out.println("4. Search");
   System.out.print("Option: ");
 }

 public static void include()
   {
   System.out.println("You are in the include() method");
   }
 public static void change()
   {
   System.out.println("You are in the change() method: ");
   }
 public static void delete()
   {
   System.out.println("You are in the delete() method");
   }
 public static void search()
   {
   System.out.println("You are in the search() method");
   }
 public static void main(String[] args)
 {  
 
   int option;
   Scanner input = new Scanner(System.in);
   
   do{
      menu();
      option = input.nextInt();
      
      switch( option ) {
      case 0:
         System.out.println("Exiting...");
         break;
      case 1:
         include();
         break;
      case 2: 
         change();
         break;
      case 3:
         delete();
         break;
      case 4:
         search();
         break;
      default:
         System.out.println("Invalid option.");
      }
    } while(option != 0);
 
 }

}
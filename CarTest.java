/* I pledge by my Honor that I have not cheated, and will not 
cheat, on this assignment. Greg Lemrow*/

import java.util.Scanner;


//This will take in the Car objects from Car.java.
public class CarTest
{
   //Creates some information on the cars the user has owned previously.
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      
      //Grabbing the car objects from Car.java.      
      Car car1 = new Car(2015, "Ford", "Taurus");
      Car car2 = new Car(2007, "Honda", "Accord");
      Car car3 = new Car();
      
      System.out.println("Here is the information I have on Mr. Smith's three cars: \n" +
                     car1 + "\n" + car2 + "\n" + car3);
      
      System.out.println("\nWhoops! It seems we do not have the info on one of his cars!" +
                  "\nEnter the information for the third car here: \nMake: \nModel: \nYear: ");
      
      //Local variables used to gather the data required for input.
      String make = scan.nextLine();
      String model = scan.nextLine();
      int year = scan.nextInt();
      String dummy = scan.nextLine();   // Set up a dummy (which isn't me) to account for the newline after the integer
      car3.setMakeType(make);
      car3.setModelType(model);
      car3.setCarYear(year);
//       System.out.println (car3);
      
      //Prompt for the new model.
      System.out.println("Mr. Smith traded the Taurus for another Ford from the same year.");
      System.out.print("Enter the new Ford model: ");
      
      String newFordModel = scan.nextLine();
      //Use the mutator to set the model to the new model.
      car1.setModelType(newFordModel);
      
      //Prompt for the new year.
      System.out.println("Mr. Smith sold the 2007 Accord to buy a more current version." +
                      "\nEnter the new year for the Accord: ");
      
       int newAccordYear = scan.nextInt();
       //Use the mutator to set the year to the new year.
       car2.setCarYear(newAccordYear);
      
      //I have altered the deal. Pray that this silly thing works.
      System.out.println("Here is the updated information I have on Mr. Smith's three cars:" +
                  "\n" + car1 + "\n" + car2 + "\n" + car3);
      
   }


}
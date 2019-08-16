/* I pledge by my Honor that I have not cheated, and will not 
cheat, on this assignment. Greg Lemrow*/

//This program will store the data for make, model, and year of a car.

public class Car
{
   private String make;
   private String model;
   private int year;
   
   //Empty data set returns an empty value.
  /* public String noData()
   {
      String emptyData = "0 - -";
      
      return emptyData;
   
   }*/
   
   //Here, we take in the make, model, and year to assign them.
   public Car(int production, String type, String name)
   {
      make = type;
      model = name;
      year = production;
   
   }
   
   public Car()
   {
      make = "-";
      model = "-";
      year = 0;
   }
   
   //Accessor used to get the make.
   public String getMake()
   {
      return this.make;
   }
   
   //Accessor used to get the model.
   public String getModel()
   {
      return this.model;
   }
   
   //Accessor used to get the production year.
   public int getYear()
   {
      return this.year;
   }
   
   //Set the make type
   public void setMakeType(String make)
   {
      this.make = make;
   }
   
   //Set the model type
   public void setModelType(String model)
   {
      this.model = model;
   }
   
   //Set the production year.
   public void setCarYear(int year)
   {
      this.year = year;
   }
   
   public String toString()
   {
      return (year + "\t" + make + "\t" + model);
   }
   
}
public class Car{
   private int year;
   private String model;
   private int mileage;
   
   public Car(int yr, int mile, String mdl){
      year = yr;
      model = mdl;
      mileage = mile;
   }
   
   public void changeYear(int newYr){
      year = newYr;
      System.out.println("You changed the year of car object " + model + " to " + newYr);
      System.out.println("--------------------------------------------------------");
   }
   
   public void changeModel(String newMdl){
      System.out.println("You changed the model of car object " + model + " to " + newMdl);
      System.out.println("--------------------------------------------------------");
      model = newMdl;
   }
   
   public void changeMile(int newMile){
      mileage = newMile;
      System.out.println("You changed the mileage of car object" + model + " to " + newMile);
      System.out.println("--------------------------------------------------------");
   }
   
   public void showCarDetails(){
      System.out.println(year + " " + model + "\nMileage: " + mileage + " miles");
      System.out.println("--------------------------------------------------------");
   }
   

}
public class CarTest{
   public static void main(String[] args){
      Car car = new Car(2002,20000,"civic");
      car.showCarDetails();
      car.changeYear(2010);
      car.showCarDetails();
      
      Car car2 = new Car(2020, 10000, "Highlander");
      car2.changeMile(150000);
      car2.changeModel("Camaro");
      car2.showCarDetails();
      
      
      
   }
   

}
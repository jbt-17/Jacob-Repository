import java.lang.*;

public class PromTickets{
   private String firstName = "";
   private String lastName = "";
   private int numGroup = 0;
   private String classmen = "";
   private String verifyCode = "";
   private double price = 0;
    
   public PromTickets(String fN, String lN, int nG, String cls){
      firstName = fN;
      lastName = lN;
      numGroup = nG;
      classmen = cls.toLowerCase();
   }
   
   public String getVerify(){
      String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890";
      
      for(int i = 0; i < 6; i++){
         int rand = (int) (Math.random() * characters.length());
         verifyCode += characters.substring(rand, rand + 1);
      }
      return verifyCode;      
   }
   
   public double getPrice(){
      if(numGroup == 1){
         if(classmen == "freshman"){
            price = 65.00;
         }
         else if(classmen == "sophomore"){
            price = 55.00;
         }
         else if(classmen == "junior"){
            price = 45.00;
         }
         else if(classmen == "senior"){
            price = 40.00;
         }
       }
       else if(numGroup == 2){
         if(classmen == "freshman"){
            price = 98.00;  
         }
         else if(classmen == "sophomore"){
            price = 83.00;
         }
         else if(classmen == "junior"){
            price = 68.00;
         }
         else if(classmen == "senior"){
            price = 60.00;
         }
       }
       else if(numGroup == 3 || numGroup == 4){
         if(classmen == "freshman"){
            price = 163.00;  
         }
         else if(classmen == "sophomore"){
            price = 138.00;
         }
         else if(classmen == "junior"){
            price = 113.00;
         }
         else if(classmen == "senior"){
            price = 100.00;
         }
       }
       return price;    
   }
   
   public void displayTicket(){
      getVerify();
      getPrice();
      
      System.out.println(firstName + " " + lastName + " purchased a " + classmen + " of " + numGroup + " ticket for " + price + ".");
      System.out.println("The confirmation number for this sale is " + verifyCode);
   }
}
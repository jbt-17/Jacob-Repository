import java.util.*;
public class SlotMachine{
   public static void runSlot(){
      Scanner scan = new Scanner(System.in);
      String uInpt = "r";
      int earnings = 0; 
      System.out.println("Press r to take a chance at the slot machine. (press n to cancel)");
      uInpt = scan.nextLine();
      while(uInpt.equals("r")){
         int slot1 = (int)(Math.random() * 9);
         int slot2 = (int)(Math.random() * 9);
         int slot3 = (int)(Math.random() * 9);
         
         System.out.println("1: |" + slot1 + "| 2: |" + slot2 + "| 3: |" + slot3 + "|");
         if(slot1 == slot2 && slot1 == slot3 && slot2 == slot3){
            earnings += 1000;
            System.out.println("You got 3 in a row! You earned $1000!");
            System.out.println("Do you want to roll again? (r for yes / n for no)");
            uInpt = scan.nextLine();
         } else if(slot1 == slot2 || slot1 == slot3 || slot2 == slot3){
            earnings += 25;
            System.out.println("You got 2 in a row! You earned $25!");
            System.out.println("Do you want to roll again? (r for yes / n for no)");
            uInpt = scan.nextLine();
         }else if(slot1 != slot2 && slot1 != slot3 && slot2 != slot3){
            earnings -= 15;
            System.out.println("You got none in a row. You lost $15!");
            System.out.println("Do you want to roll again? (r for yes / n for no)");
            uInpt = scan.nextLine();
         }
      }
      
      if(uInpt.equals("n")){
        if(earnings < 0){
         System.out.println("You lost " + earnings + " dollars");
        }else if(earnings > 0){
         System.out.println("You won " + earnings + " dollars");
        }
      }
   }
   
   public static void main(String[] args){
      SlotMachine.runSlot();
   } 
}
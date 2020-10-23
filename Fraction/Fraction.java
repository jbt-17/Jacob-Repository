public class Fraction{
   private int num;
   private int den;  
    
   public Fraction(){
      num = 1;
      den = 2;
   }
   
   public Fraction(int num1, int num2){
      num = num1;
      den = num2;
   }
   
   public static void add(){
      int num1 = 8;
      int den1 = 4;
      
      int num2 = 6;
      int den2 = 4;
      
      int result = num1 + num2; 
      System.out.println("8/4 + 6/4 = " + result + "/4"); 
      
   }
   
   public static void sub(){
     int num1 = 15;
     int den1 = 10;
     
     int num2 = 5;
     int den2 = 10;
     
     int result = num1 - num2;
     System.out.println("15/10 - 5/10 = " + result + "/10");
   }
     
   public static void divide(){
     int num1 = 2;
     int den1 = 4;
     
     int num2 = 6;
     int den2 = 4;
     
     int nresult = num1 * den2;
     int dresult = den1 * num2;
     System.out.println("2/4 / 6/4 = " + nresult + "/" + dresult);
   }
   
   public static void multiply(){
     int num1 = 8;
     int den1 = 19;
     
     int num2 = 13;
     int den2 = 6;
     
     int nresult = num1 * num2;
     int dresult = den1 * den2;
     System.out.println("8/19 * 13/6 = " + nresult + "/" + dresult);
   }
}
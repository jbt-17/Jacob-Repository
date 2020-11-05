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
   
   public static void add(int num1, int den1, int num2, int den2){
      if(den1 == den2){
         int result = num1 + num2; 
         System.out.println(result + den1); 
      }
      
      int newden1 = den1 * den2;
      int newnum1 = num1 * den2; 
      int newden2 = den1 * den2;
      int newnum2 = num2 * den1;
      
      int nresult = newnum1 + newnum2;
      System.out.println(nresult + "/" + newden1); 
   }
   
   public static void sub(int num1, int den1, int num2, int den2){
    if(den1 == den2){
         int result = num1 - num2; 
         System.out.println(result + "/" + den1); 
      }
      
      int newden1 = den1 * den2;
      int newnum1 = num1 * den2; 
      int newden2 = den1 * den2;
      int newnum2 = num2 * den1;
      
      int nresult = newnum1 - newnum2;
      System.out.println(nresult + "/" + newden1);
   }
     
   public static void divide(int num1, int den1, int num2, int den2){
     int nresult = num1 * den2;
     int dresult = den1 * num2;
     System.out.println(nresult + "/" + dresult);
   }
   
   public static void multiply(int num1, int den1, int num2, int den2){  
     int nresult = num1 * num2;
     int dresult = den1 * den2;
     System.out.println(nresult + "/" + dresult);
   }
}

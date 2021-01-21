public class NumberMethods {
   public static boolean isPrime(int n) {
      boolean prime = true;
      
      if (n <= 1){
         prime = false;
      }
      
      for(int i = 2; i < n; i++){
         if(n % i == 0){
            prime = false;
            break;
         }
      }
      return prime;
   }
   public static int divisorSum(int n) {
      int sum = 0;
      for(int i = 1; i < n; i++){
         if(n % i == 0){
            sum += i;
         }
      }
      return sum;
   }
   public static boolean isStrong(int n) {
      boolean strong = false;
      if(isPrime(n) == true){
        return strong; 
      }
      
      else if(divisorSum(n) < n){
        strong = true;
      }    
      return strong;
   }
   public static void printDivisors(int n) {
      if (n == 0){
         System.out.println("0");   
      }
      else if (n == 1){
         System.out.println("1");
      }
      
      for(int i = 1; i < n - 1; i++){
         if(n % i == 0){
            System.out.print(i + " ");
         }
      }
   }
   public static void printPrimes(int n) {
       for(int i = 1; i < n; i++){
         if(isPrime(i)){
            System.out.print(i + " ");
         }
       }
   }
   public static void printComposites(int n) {
       for(int i = 1; i < n; i++){
         if(isPrime(i) != true){
            System.out.print(i + " ");
         }
       }
   }
   public static void printStrong(int n) {
       for(int i = 1; i < n; i++){
         if(isPrime(i)){
            System.out.print("");
         }
         else if(isStrong(i)){
            System.out.print(i + " ");
         }
       }
   }
   public static void printWeak(int n) {
       for(int i = 1; i < n; i ++){
         if(isPrime(i)) {
            System.out.print("");
         }
         else if(isStrong(i) == false){
            System.out.print(i + " ");
         }
       }
       
   }
   public static void main(String[] args) {
      printComposites(30);
      System.out.println();
      printPrimes(30);  
      System.out.println();
      printStrong(30);  
      System.out.println();
      printWeak(30); 
   }
}
 
import java.util.*;
public class BookDatabase{
   public static void addBook(){
      Scanner scan = new Scanner(System.in);
      Scanner i = new Scanner(System.in);
      int numBooks = 0;
      String userInput = "y";
      while(userInput.equals("y")){
         System.out.println("Enter a title");
         String t = scan.nextLine();
         System.out.println("Enter the author");
         String a = scan.nextLine();
         System.out.println("Enter the genre");
         String g = scan.nextLine();
         System.out.println("Enter the number of pages in the book");
         int p = i.nextInt();
         
         System.out.println("Do you want to enter another book into the database? (y or n)");
         userInput = scan.nextLine();
         numBooks += 1;  
      }
      if(userInput.equals("n")){
        System.out.println("You have " + numBooks + " books in the database.");
      }
   }
   
   public static void main(String[] args){
      BookDatabase.addBook();
   }
   
   
}
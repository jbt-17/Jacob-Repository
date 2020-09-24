import java.util.*;

class EmailAddress{
   public static void main(String args[]){
      
      Scanner key = new Scanner(System.in);
      
      System.out.println("What is your first name?");
      String firstName = key.nextLine();
      
      System.out.println("What is your last name");
      String lastName = key.nextLine();
      
      System.out.println("What is your middle name");
      String middleName = key.nextLine();
      
      System.out.println("What is your birthday / (mm-dd-yyyy)");
      String birthday = key.nextLine();
      
      String email = lastName.toLowerCase() + firstName.substring(0,1).toUpperCase() + middleName.substring(0,1).toUpperCase() + "@sharkmail.com";
      
      String password = birthday.substring(0,2) + birthday.substring(3,5) + birthday.substring(6,10);
      
      System.out.println("Email: " + email);
      System.out.println("Temp Password: " + password);
      System.out.println("*** This temporary password is very insecure. Please change it immediately! ***");
   }
}
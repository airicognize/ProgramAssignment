import java.lang.*;
import java.util.*;
import java.text.*;

/*
We are writing a program that prompts the user for a URL. It should remove any leading or trailing whitespace from the string.
It should then output "Verifying an URL with X characters...", replacing X by the size  of the URL; and the string 
"Is this a valid and secure URL? true." if the URL starts with "https://" or "Is this a valid and secure URL? false." otherwise.
*/

public class Question4 {
    public static void main(String[] args) {
  
  
      Scanner sc = new Scanner(System.in);
      System.out.println("Please enter the URL for verification.");
      String url = sc.nextLine();
      String https = "https://";
      int length = url.length();
      System.out.println("You've entered, " + url.trim());
      System.out.println("Verifying an URL with " + length + " characters...");
      
      if (url.toLowerCase().indexOf(https.toLowerCase()) != -1) {
          
          System.out.println("Is this a valid and secure URL? true.");
      
          
      } else {
          
          System.out.println("Is this a valid and secure URL? false.");
     }
      

    }
}

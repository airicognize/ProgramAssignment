import java.util.*;
import java.math.*;

public class Question3TBC{

  public static void main(String[] args){

    Scanner in = new Scanner(System.in);
    int[] numbers = new int[3];
    int sum = 0;

    System.out.println("\n****** Addition Calculation ******"
                       + "\nEnter 3 whole digits to calculate an adition");
    for (int i = 0; i < numbers.length; i++){


      System.out.println (/*ask for decreasing*/ "You've entered " + i + " numbers.");
      numbers[i] = in.nextInt();


      try{
        Thread.sleep(1000);
      }
      catch(InterruptedException ex){
        Thread.currentThread().interrupt();
      }
      
      System.out.println("Calculating");


      System.out.println("The total of your numbers are " + numbers);

    }

  }

}

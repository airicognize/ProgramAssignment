import java.util.*;

public class Question3{

  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    System.out.println("\n****** Addition Calculation ******"
                       + "\nEnter 3 whole digits to calculate an adition");
    int numbers1 = sc.nextInt();
    System.out.println("That's 1");
    int numbers2 = sc.nextInt();
    System.out.println("That's 2");
    int numbers3 = sc.nextInt();
    System.out.println("And 3! \nCalculating..");
    int total = numbers1+numbers2+numbers3;
    System.out.println("\nThe total of your digits is " + total  + ".");

  }
}

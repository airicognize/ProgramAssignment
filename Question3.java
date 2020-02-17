import java.util.*;

public class Question3{

  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    System.out.println("\n****** Addition Calculation ******"
                       + "\nEnter 3 whole digits to calculate an adition");
    String number = sc.nextLine();
    String whole = number.substring(0,1);
    String whole2 = number.substring(1,2);
    String whole3 =number.substring(2);
    int num1 = Integer.parseInt(whole);
    int num2 = Integer.parseInt(whole2);
    int num3 = Integer.parseInt(whole3);
    int sum = num1+num2+num3;
    

    System.out.println("\nThe total of your digits is " + sum + ".");

  }
}

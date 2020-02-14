import java.util.*;
import java.text.*;
/*
We are writing a program that prompts the user for the price of a product
in CAD, and outputs the vaulues of sales tax in Quebec (TPS+ TVQ), tips of 15%
and the total amount that should be paid.
*/

public class Question2{

  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter the price of the product in CAD");
    float price = sc.nextFloat();

    float taxestip = 0.30f;

    DecimalFormat formatter = new DecimalFormat("#0.00");
    System.out.println("\n*** Total amount ***"
                       + "\nTPS = 5%"
                       + "\nTVQ = 10%"
                       + "\nTIPS = 15%"
                       + "\nProduct = " + formatter.format(price) + "$"
                       + "\nTotal amount = " + formatter.format((price*taxestip)+price) + "$");

  }

}

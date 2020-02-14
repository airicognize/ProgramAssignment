import java.util.*;

/*We are writing a program to calculate the cost of a roadtrip. We will ask the user how many kilometers will be travelled,
then ask what is the average distance that the vehicle runs with 1 liter of gas. The program should output
the estimated cost of the trip, considering the price of gas as $1.16 CAD per liter.
*/

public class Question1{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
    System.out.println("How many kilometers will be travelled?");
		short kilometers = sc.nextShort();

		Scanner s = new Scanner(System.in);
    	System.out.println("What is the average distance that your vehicle can do with 1 liter of gas");
		short distance = sc.nextShort();

		System.out.println("The estimated cost of the trip will be " + (kilometers/distance)*1.16 + " CAD");

	}
}

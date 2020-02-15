import java.util.*;
import java.text.*;

/*
We are writing a program that generats a random number between 0 and 100,
and performs mathematical operations with it. The output should print the random
number and the result of 5 operations with it: powers of 2 and 3, square root,
natural logarithm and base 10 logarithm.
*/

public class Question5{

  public static void main(String[] args){

    int random = (int)(Math.random() * 100 + 1);

    System.out.println(random + " to the power of 2 is " + (int)Math.pow(random, 2) + ".");
    System.out.println(random + " to the power of 3 is " + (int)Math.pow(random, 3) + ".");
    System.out.println(random + " square rooted is " + (float)Math.sqrt(random) + ".");
    System.out.println(random + " to base e log is " + (float)Math.log(random) + ".");
    System.out.println(random + " to base 10 log is " + (float)Math.log10(random) + ".");


  }

}

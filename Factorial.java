/*
 We will use loops to calculate facorial
uses the built in  int data type.
 */

/*
public class Factorial {
    public static void main( String[] args ) {
        final int NUM_FACTS = 100;
        for(int i = 0; i < NUM_FACTS; i++)
                System.out.println( i + "! is " + factorial(i));
    }

    public static int factorial(int n) {
        int result = 1;
        for( int i = 2; i <= n; i++)
            result *= i;
        return result;
    }
}

 */


// A more thorough approach (checks) along with user input
// It's worth noting this program will not work for large numbers

/*
import java.util.Scanner;

class Factorial {
    public static void main(String args[]) {

        int n, c, fact = 1;

        System.out.println("Enter an integer to calculate it's factorial");
        Scanner in = new Scanner(System.in);

        n = in.nextInt();

        if (n < 0)
            System.out.println("Number should be non-negative.");
        else {
            for (c = 1; c<= n; c++)
                fact = fact*c;

            System.out.println("Factorial of " +n+ " is = "+fact);
        }
    }
}
 */

// Factorial of Large numbers

import java.util.Scanner;
import java.math.BigInteger;

class Factorial {

    public static void main(String args[]) {

        int n, c;
        BigInteger inc = new BigInteger("1");
        BigInteger fact = new BigInteger("1");

        Scanner input = new Scanner(System.in);

        System.out.println("Input an integer");
        n = input.nextInt();

        for (c = 1; c <= n; c++) {
            fact = fact.multiply(inc);
            inc = inc.add(BigInteger.ONE);
        }

        System.out.println(n + "! = " + fact);
    }
}

















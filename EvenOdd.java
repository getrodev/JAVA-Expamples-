/* Check whether a number is even or odd
 using if...else statement
 */

/*
import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = reader.nextInt();

        if(num % 2 == 0 )
            System.out.println(num + " is even");
        else
            System.out.println(num + " is odd");
    }
}

*/

// Same program but with the ternary operator

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = reader.nextInt();

        String evenOdd = (num % 2 == 0) ? "even" : "odd";

        System.out.println(num + " is " + evenOdd );


    }

}
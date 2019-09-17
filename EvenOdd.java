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
/*
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
 */
/*
import java.util.Scanner;

class EvenOdd {
    public static void main(String args[]) {

        int x;
        System.out.println("Enter an integer to check if it is odd or even");
        Scanner in = new Scanner(System.in);
        x = in.nextInt();

        if (x % 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
}
 */

import java.util.Scanner;

class EvenOdd {
    public static void main(String args[]) {
        int c;
        System.out.println("Input an integer");
        Scanner in = new Scanner(System.in);
        c = in.nextInt();

        if ((c/2)*2 == c)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
}

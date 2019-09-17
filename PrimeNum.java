// Check prime number using a for loop

/*
public class PrimeNum {
    public static void main(String[] args) {

        int num = 29;
        boolean flag = false;
        for(int i = 2; i <= num/2; ++i) {

            // condition for nonprime number
            if(num % i == 0) {

                flag = true;
                break;
            }
        }

        if (!flag)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number");
    }
}
 */

// Prime Number using a while loop
/*
public class PrimeNum {
    public static void main(String[] args) {

        int num = 33, i = 2;
        boolean flag = false;
        while(i <= num/2) {

            // condition for nonprime number
            if(num % i == 0 ) {
                flag = true;
                break;
            }
            ++i;
        }

        if (!flag)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
    }
}
 */

/* To check if an int (say n) is prime
you can check if it is divisible by any
integer from 2 to (n-1) or check from 2 to sqrt(n)
The latter is faster and more effecient.
 */

import java.util.*;

class PrimeNum {
    public static void main(String args[]) {

        int n, status = 1, num = 3, count, j;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the numbers of prime numbers you want");
        n = in.nextInt();

        if (n >= 1) {
            System.out.println("First "+n+" prime numbers are");
            System.out.println(2);
        }

        for (count = 2; count <= n; ) {
            for (j = 2; j<= Math.sqrt(num); j++) {
                if (num%j == 0) {
                    status = 0;
                    break;
                }
            }

            if (status != 0) {
                System.out.println(num);
                count++;
            }
            status = 1;
            num++;
        }
    }
}



















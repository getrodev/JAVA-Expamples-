// Let's check Armstrong Number for 3 digit number
/*
public class Armstrong {
    public static void main(String[] args) {

        int number = 371, originalNumber, remainder, result = 0;

        originalNumber = number;

        while(originalNumber != 0) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }

        if(result == number )
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number");
    }
}
*/

// Check Armstrong number fo n digits
/*
public class Armstrong {
    public static void main(String[] args) {
        int number = 1634, originalNumber, remainder, result = 0, n = 0;

        originalNumber = number;

        for (;originalNumber != 0; originalNumber /= 10, ++n);

        originalNumber = number;

        for(;originalNumber != 0; originalNumber /= 10) {

            remainder = originalNumber % 10;
            result += Math.pow(remainder, n);
        }

        if(result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
    }
}

 */

/* Armstrong number is a number which is
equal to the sum of digits raise to the power
total nubmer of digits
 */

import java.util.Scanner;

class Armstrong {

    public static void main(String args[]) {

        int n, sum = 0, temp, remainder, digits = 0;

        Scanner in = new Scanner(System.in);
        System.out.println("Input a number to check if it is an Armstrong number");

        n = in.nextInt();

        temp = n;

        // Count number of digits

        while(temp != 0) {
            digits++;
            temp = temp/10;
        }

        temp = n;

        while (temp != 0 ) {
            digits++;
            temp = temp/10;
        }

        temp = n;

        while (temp != 0) {
            remainder = temp%10;
            sum = sum + power(remainder, digits);
            temp = temp/10;
        }

        if (n == sum)
            System.out.println(n + "is an Armstrong number.");
        else
            System.out.println(n + " isn't an Armstrong number.");
    }

    static int power(int n, int r) {
        int c, p = 1;

        for (c =1; c <= r; c++)
            p = p*n;

        return p;
    }
}

// Some Armstrong numbers are: 0, 1, 4, 5, 9, 153, 371, 407, 8208
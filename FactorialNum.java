// Factorial of a number using for loop

/*
//public class FactorialNum {
    public static void main(String[] args) {

        int num = 10;
        long factorial = 1;
        for(int i = 1; i <= num; i++) {

            // factorial = factorial * i;
            factorial *= i;
        }
        System.out.printf("Factorial of %d = %d ", num, factorial);
    }
}
 */

// Same program but using BigInteger this time.

/*
import java.math.BigInteger;

public class FactorialNum {
    public static void main(String[] args) {

        int num = 30;
        BigInteger factorial = BigInteger.ONE;
        for(int i = 1; i <= num; ++i) {

            // factorial = factorial * i;
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        System.out.printf("Factorial fo %d = %d ", num, factorial);
    }
}

 */

// Same problem with a while loop

public class FactorialNum {

    public static void main(String[] args) {

        int num = 5, i = 1;
        long factorial = 1;
        while(i <= num) {
            factorial *= i;
            i++;
        }
        System.out.printf("Factorial of %d = %d", num, factorial);
    }
}
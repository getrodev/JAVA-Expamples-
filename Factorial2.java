/* Find the factorial of a positive number
using the for loop
 */

public class Factorial {

    public static void main(String[] args) {

        int num = 10;
        long factorial = 1;
        for(int i = 1; i <= num; i++){

            // factorial = factorial * 1;
            factorial *= i;
        }
        System.out.printf("Factorial of %d = %d", num, factorial);
    }
}

/* calculate the sum of natural numbers
using for loops and while loop in java
*/
// for loop

/*
public class SumNatural {
    public static void main(String[] args) {

        int num = 5, sum = 0;

        for(int i = 1; i <= num; i++) {

            // sum = sum + 1;
            sum += i;
        }

        System.out.println("Sum = " + sum);
    }
}


 */

public class SumNatural {

    public static void main(String[] args) {

        int num = 50, i = 1, sum = 0;

        while( i <= num) {
            sum += i;
            i++;
        }
        System.out.println("Sum = " +sum);
    }
}
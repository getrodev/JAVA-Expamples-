// Find the sum of natural numbers using recursion
/*
public class AddNumbers {
    public static void main(String[] args) {
        int number = 20;
        int sum = addNumbers(number);
        System.out.println("Sum = " + sum);
    }

    public static int addNumbers(int num) {
        if (num != 0)
            return num + addNumbers(num - 1);
        else
            return num;
    }
}

 */
// Will add numbers which can be stored in 4 bytes.
/*
import java.util.Scanner;

class AddNumbers {
    public static void main(String args[]) {

        int x, y, z;

        System.out.println("Enter two integers to calculate their sum");
        Scanner in = new Scanner(System.in);

        x = in.nextInt();
        y = in.nextInt();
        z = x + y;

        System.out.println("Sum of the integers = " + z);
    }
}

 */


// Will add large numbers using BigInteger class
import java.util.Scanner;
import java.math.BigInteger;

class AddNumbers {
    public static void main(String[] args) {
        String number1, number2;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter first large number");
        number1 = in.nextLine();

        System.out.println("Enter second large number");
        number2 = in.nextLine();

        // Create two objects of BigInteger class
        BigInteger first = new BigInteger(number1);
        BigInteger second = new BigInteger(number2);
        BigInteger sum;

        // you have to use the add method for addition of two objects
        sum = first.add(second);

        System.out.println("Result of addition = " + sum);
    }
}
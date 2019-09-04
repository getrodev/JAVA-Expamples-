// Let's multiply two numbers from the user

/*
//import java.util.Scanner;

public class  MultiplyTwoNum {
    public static void main(String[] args) {

        /* This reads the input provided by user
        using keyboard
         *\/

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first number: ");

        // This method reads the number provided using keyboard
        int num1 = scan.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scan.nextInt();

        // Closing Scanner after the use
        scan.close();

        // Calculating product of two numbers
        int product = num1 * num2;

        // Display the multiplication result
        System.out.println("Output: "+product);
    }
}
*/

// This time, let's find the product of floating point numbers

import java.util.Scanner;

public class MultiplyTwoNum {

    public static void main(String[] args) {
        /* This reads the input provided by user
        using keyboard.
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first number: ");

        // This method reads the number provided using keyboard
        double num1 = scan.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scan.nextDouble();

        // Closing Scanner after the use to avoid memory leak
        scan.close();

        //Calculate product of two numbers
        double product = num1 * num2;

        // Displaying the multiplication result
        System.out.println("Output: "+product);

    }
}
// Reverse a String using Recursion

/*
public class ReverseStringRecursion {

    public static void main(String[] args) {
        String str = "Welcome to Beginnersbook";
        String reversed = reverseString(str);
        System.out.println("The reversed string is: " + reversed);
    }

    public static String reverseString(String str) {
        if (str.isEmpty())
            return str;
        // Calling Function Recursively
        return reverseString(str.substring(1)) + str.charAt(0);
    }
}

 */

// Let's reverse a string entered by user
import java.util.Scanner;
public class ReverseStringRecursion {

    public static void main(String[] args) {
        String str;
        System.out.println("Enter your username: ");
        Scanner scanner = new Scanner(System.in);
        str = scanner.nextLine();
        scanner.close();
        String reversed = reverseString(str);
        System.out.println("The reversed string is: " + reversed);
    }

    public static String reverseString(String str) {
        if (str.isEmpty())
            return str;
        // Calling Function Recursively
        return reverseString(str.substring(1)) + str.charAt(0);
    }
}
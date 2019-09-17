// Program to check whether the given string is Palindrome or not
// Using Stack


/*
import java.util.Stack;
import java.util.Scanner;

class Palindrome {

    public static void main(String[] args) {

        System.out.print("Enter any string:");
        Scanner in=new Scanner(System.in);
        String inputString = in.nextLine();
        Stack stack = new Stack();

        for (int i = 0; i < inputString.length(); i++) {
            stack.push(inputString.charAt(i));
        }

        String reverseString = "";
        while (!stack.isEmpty()) {
            reverseString = reverseString+stack.pop();
        }

        if (inputString.equals(reverseString))
            System.out.println("The input String is a palindrome.");
        else
            System.out.println("The input String is not a palindrome.");
    }
}


 */

// Using Queue

/*

import java.util.Queue;
import java.util.Scanner;
import java.util.LinkedList;


class Palindrome {

    public static void main(String[] args) {

        System.out.print("Enter any string:");
        Scanner in=new Scanner(System.in);
        String inputString = in.nextLine();
        Queue queue = new LinkedList();

        for (int i = inputString.length() -1; i >= 0; i--) {
            queue.add(inputString.charAt(i));
        }

        String reverseString = "";

        while (!queue.isEmpty()) {
            reverseString = reverseString+queue.remove();
        }
        if (inputString.equals(reverseString))
            System.out.println("The input String is a palindrome.");
        else
            System.out.println("The input String is not a palindrome.");
    }

}

 */

// Using for loo/ while loop

/*
import java.util.Scanner;
class Palindrome {
    public static void main(String args[]) {
        String reverseString="";
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string to check if it is a palindrome:");
        String inputString = scanner.nextLine();

        int length = inputString.length();

        for ( int i = length - 1 ; i >= 0 ; i--)
            reverseString = reverseString + inputString.charAt(i);

        if (inputString.equals(reverseString))
            System.out.println("Input string is a palindrome.");
        else
            System.out.println("Input string is not a palindrome.");
    }
}
 */

// A string is a palindrome if it remains unchanged when reversed
/*
import java.util.*;

class Palindrome {
    public static void main(String args[]) {

        String original, reverse = ""; // Objects of String class
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a string to check if it is a palindrome");
        original = in.nextLine();

        int length = original.length();

        for(int i = length - 1; i >= 0; i--)
            reverse = reverse + original.charAt(i);

        if (original.equals(reverse))
            System.out.println("The string is a palindrome");
        else
            System.out.println("The string isn't a palindrome.");
    }
}
 */

// Palindrome without reversing a string

import java.util.*;

class Palindrome {
    public static void main(String args[]) {

        String inputString;
        Scanner in = new Scanner(System.in);

        System.out.println("Input a string");
        inputString = in.nextLine();

        int length = inputString.length();
        int i, begin, end, middle;

        begin = 0;
        end = length - 1;
        middle = (begin + end)/2;

        for(i = begin; i <= middle; i++) {
            if(inputString.charAt(begin) == inputString.charAt(end)) {
                begin++;
                end--;
            }
            else {
                break;
            }
        }
        if (i == middle + 1) {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not a Palindrome");
        }

    }
}







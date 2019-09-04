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









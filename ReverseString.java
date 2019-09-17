// Reverse words in a string

/*
public class ReverseString {

    public void reverseWordInMyString(String str) {

        /* The split() method of String class splits
    a string in several strings based on the
    delimiter passed as an arguments to it
     *
        String[] words = str.split(" ");
        String reversedString = "";
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String reverseWord = "";
            for (int j = word.length() - 1; j >= 0; j--)
            {
            /* The charAt( function returns the character
            at the given position in  a string
             *
                reverseWord = reverseWord + word.charAt(j);
            }
            reversedString = reversedString + reverseWord + " ";
        }
        System.out.println(str);
        System.out.println(reversedString);
    }
public static void main(String[] args) {
    ReverseString obj = new ReverseString();
    obj.reverseWordInMyString("Welcome to BeginnersBook");
    obj.reverseWordInMyString("This is an easy Java Program");
   }
}
*/

// charAt method to extract characters from the input string
/*
import java.util.*;

class ReverseString {
    public static void main(String args[]) {

        String original, reverse = "";
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a string to reverse");
        original = in.nextLine();

        int length = original.length();

        for( int i = length - 1; i >= 0; i--)
            reverse = reverse + original.charAt(i);

        System.out.println("Reverse of the string: " + reverse);
    }
}
 */

// Reverse a string in Java using StringBuffer class

/* StringBuffer class contains a method reverse which
can be used to reverse or invert an Object of its class.
 */

class ReverseString {

    public static void main(String args[]) {
        StringBuffer a = new StringBuffer("Java programming is fun");
        System.out.println(a.reverse());
    }

}
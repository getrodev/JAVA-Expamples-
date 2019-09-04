/* Java program to check
Alphabet using if...else
 */

/*
public class Alphabet {

    public static void main(String[] args) {

        char c = '*';

        if( ( c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
            System.out.println(c + " is an alphabet.");
        else
            System.out.println(c + " is not an alphabet.");
    }
}

*/


/* The ASCII value of lowercase alphabets are from 97 to 122.
the ASCII value of uppercase alphabets are from 65 to 90.
 */

// This time using ternary operator

public class Alphabet {

    public static void main(String[] args) {

        char c = 'A';

        String output = (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z' )
                ? c + " is an alphabet."
                : c + " is not an alphabet.";

        System.out.println(output);
    }
}
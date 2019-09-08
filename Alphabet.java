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

/*
public class Alphabet {

    public static void main(String[] args) {

        char c = 'A';

        String output = (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z' )
                ? c + " is an alphabet."
                : c + " is not an alphabet.";

        System.out.println(output);
    }
}
 */

/*
class Alphabet {
    public static void main(String args[]) {
        char ch;

        for (ch = 'a'; ch <= 'z'; ch++)
            System.out.println(ch);
    }
}

 */

// printing Alphabets using While loop

/*
class Alphabet {
    public static void main(String args[]) {

        char c = 'a';

        while (c <=  'z') {
            System.out.println(c);
            c++;
        }
    }
}

 */

// using a do while loop

class Alphabet {
    public static void main(String args[]) {
        char c = 'A';

        do {
            System.out.println(c);
            c++;
        } while (c <= 'Z');
    }
}
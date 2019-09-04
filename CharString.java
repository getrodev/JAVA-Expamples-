/* We will convert a character to
a string and vice versa
 */

/*
public class CharString {

    public static void main(String[] args) {
        char ch = 'c';
        String st = Character.toString(ch);
        // Alternatively
        // st = String.valueOf(ch);

        System.out.println("The string is: " + st);
    }
}
 */

// Convert char array to String

/*
public class CharString {

    public static void main(String[] args) {
        char[] ch = {'a', 'e', 'i', 'o', 'u'};

        String st = String.valueOf(ch);
        String st2 = new String(ch);

        System.out.println(st);
        System.out.println(st2);

    }
}

 */

// Convert String to char array (but not char)

import java.util.Arrays;

public class CharString {

    public static void main(String[] args) {
        String st = "This is great";

        char[] chars = st.toCharArray();
        System.out.println(Arrays.toString(chars));
    }
}




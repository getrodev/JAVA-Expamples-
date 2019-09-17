// Learn to compare two strings

/* FACTS: == (equality operator) compare the reference of the string,
equals() compares whether the value of the strings are equals and
not the object itself.
 */
/*
public class CompareStrings {

    public static void main(String[] args) {

        String style = "Bold";
        String style2 = "Bold";

        if (style == style2)
            System.out.println("Equal");
        else
            System.out.println("Not Equal");
    }
}


public class CompareStrings {
    public static void main(String[] args) {
        String style = new String("Bold");
        String style2 = new String("Bold");

        if(style.equals(style2))
            System.out.println("Equal");
        else
            System.out.println("Not Equal");
    }
}


public class CompareStrings {
    public static void main(String[] args) {
        String style = new String("Bold");
        String style2  = new String("Bold");

        if(style == style2)
            System.out.println("Equal");
        else
            System.out.println("Not Equal");
    }
}

 */
/*
public class CompareStrings {
    public static void main(String[] args) {

        String style = new String("Bold");
        String style2 = new String("Bold");

        boolean result = style.equals("Bold"); // true
        System.out.println(result);

        result = style2 == "Bold"; // false
        System.out.println(result);

        result = style == style2;  // false
        System.out.println(result);

        result = "Bold" == "Bold"; // true
        System.out.println(result);
    }
}
 */

/* CompareTo method test equality of
two String class objects. CompareToIgnoreCase method
compare strings ignoring the case
 */

import java.util.Scanner;

class CompareStrings {
    public static void main(String args[]) {

        String s1, s2;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the first string");
        s1 = in.nextLine();

        System.out.println("Enter the second string");
        s2 = in.nextLine();

        // Technically comparing ASCII values.
        if (s1.compareTo(s2) > 0)
            System.out.println("The first string is greater than the second.");
        else if(s1.compareTo(s2) < 0)
            System.out.println("The first string is smaller than the second.");
        else
            System.out.println("Both the strings are equal.");
    }
}



// Check if Int Array contains a given value

/*
public class ContainsItem {

    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5};
        int toFind = 3;
        boolean found = false;

        for (int n : num) {
            if (n == toFind) {
                found = true;
                break;
            }
        }

        if(found)
            System.out.println(toFind + " is found.");
        else
            System.out.println(toFind + " is not found.");
    }
}

 */


// Check if array contains given value using Stream

/*
import java.util.stream.IntStream;

public class ContainsItem {

    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5};
        int toFind = 7;

        // anyMatch() method takes a predicate
        // -- an expression or a function which returns a boolean value
        boolean found = IntStream.of(num).anyMatch(n -> n == toFind);

        if(found)
            System.out.println(toFind + " is found.");
        else
            System.out.println(toFind + " is not found.");
    }
}

 */
// check if array contains a given value for non-primitive types

import java.util.Arrays;

public class ContainsItem {

    public static void main(String[] args) {
        String[] strings = {"One", "Two", "Three", "Four", "Five"};
        String toFind = "Four";

        boolean found = Arrays.stream(strings).anyMatch(t -> t.equals(toFind));

        if(found)
            System.out.println(toFind + " is found.");
        else
            System.out.println(toFind + " is not found.");
    }
}
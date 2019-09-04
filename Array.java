/* A few different techniques to print
the elements of a given array
 */

/* The for-each loop access each element
 in the array and prints using println().
 */

/*
public class Array {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        for (int element: array) {
            System.out.println(element);
        }
    }
}

 */

// Using a Standard library

/*
import java.util.Arrays;

public class Array {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(array));
    }
}

 */


// print a multi-dimentional Array

import java.util.Arrays;

public class Array {

    public static void main(String[] args) {
        int[][] array = {{1, 2},{3, 4},{5, 6, 7}};

        System.out.println(Arrays.deepToString(array));
    }
}















// perform binary search on a list of integer numbers

/*
import java.util.Scanner;

class BinarySearchEx {
    public static void main(String args[]) {
        int counter, num, item, array[], first, last, middle;
        //To capture user input
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of elements:");
        num = input.nextInt();

        //Creating array to store teh all the numbers
        array = new int[num];

        System.out.println("Enter " + num + " integer");
        //Loop to store each numbers in array
        for(counter = 0; counter < num; counter++)
            array[counter] = input.nextInt();

        System.out.println("Enter the search value:");
        item = input.nextInt();
        first = 0;
        last = num - 1;
        middle = (first + last)/2;

        while( first <= last ) {
            if (array[middle] < item )
                first = middle + 1;
            else if (array[middle] == item ) {
                System.out.println(item + " found at location " + (middle + 1) + ".");
                break;
            }
            else  {
                last = middle - 1;
            }
            middle = (first + last)/2;
        }

        if ( first > last )
            System.out.println(item + " is not found.\n");
    }
}
 */
//Should be sorted before searching the element..hence why program is not working.

/* Please note that input numbers must
be in ascending order. If they are not,
then you must sort them first.
 */

/*
import java.util.Scanner;

class BinarySearchEx {

    public static void main(String args[]) {

        int c, first, last, middle, n, search, array[];

        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of elements");
        n = in.nextInt();
        array = new int[n];

        System.out.println("Enter " + n + " integers");

        for(c = 0; c < n; c++)
            array[c] = in.nextInt();

        System.out.println("Enter value to find");
        search = in.nextInt();

       first = 0;
       last = n - 1;
       middle = (first + last)/2;

       while(first <= last) {
           if (array[middle] < search )
               first = middle + 1;
           else if ( array[middle] == search ) {
               System.out.println(search + " found at location " + (middle + 1) + ".");
               break;
           }
           else
               last = middle - 1;
           middle = (first + last)/2;
       }
       if (first > last)
           System.out.println(search + "isn't present in the list.\n");
    }
}
 */


//binarySearch method in Array class which can be used

import java.util.Arrays;

class BinarySearchEx {
    public static void main(String args[]) {

        char characters[] = { 'a', 'b', 'c', 'd', 'e'};

        System.out.println(Arrays.binarySearch(characters, 'a'));
        System.out.println(Arrays.binarySearch(characters, 'p'));
    }
}

// binarySearch method return the location if a match occurs.








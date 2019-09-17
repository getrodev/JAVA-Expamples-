// Sorting in ascending order

/*
import java.util.Scanner;

class BubbleSortExample {
    public static void main(String []args) {
        int num, i, j, temp;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of integers to sort:");
        num = input.nextInt();

        int array[] = new int[num];

        System.out.println("Enter " + num + " integers: ");

        for(i = 0; i < num; i++)
            array[i] = input.nextInt();

        for (i = 0; i < ( num - 1); i++) {
            for (j = 0; j < num - i - 1; j++) {
                if (array[j] > array[j+1]) {
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }

        System.out.println("Sorted list of integers:");

        for ( i = 0; i < num; i++)
            System.out.println(array[i]);
    }
}

 */

// Sorting in descending Order
/*
import java.util.Scanner;

class BubbleSortExample {
    public static void main(String []args) {
        int num, i, j, temp;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of integers to sort:");
        num = input.nextInt();

        int array[] = new int[num];

        System.out.println("Eter " + num +" integers: ");


        for (i = 0; i < num; i++)
            array[i] = input.nextInt();

        for( i = 0; i < ( num - 1 ); i++) {
            for(j =0; j < num - i - 1; j++) {
                if (array[j] < array[j+1]) {
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }

        System.out.println("Sorted list of integers:");

        for (i = 0; i < num; i++)
            System.out.println(array[i]);

    }
}
 */

/*
import java.util.Scanner;

class BubbleSortExample {
    public static void main(String[] args) {
        int n, c, d, swap;
        Scanner in = new Scanner(System.in);

        System.out.println("Input number of integers to sort");
        n = in.nextInt();

        int array[] = new int[n];

        System.out.println("Enter " + n + " integers");

        for (c = 0; c < n; c++)
            array[c] = in.nextInt();

        for (c = 0; c < ( n -1); c++) {
            for (d = 0; d < n - c -1; d++) {
                if (array[d] > array[d+1])  For descending order use < *\/
                {
                    swap = array[d];
                    array[d] = array[d+1];
                    array[d+1] = swap;
                }
            }
        }

        System.out.println("Sorted list of numbers");

        for (c = 0; c < n; c++)
            System.out.println(array[c]);
    }
}
 */

// You can use sort method of arrays class to sort integers
// in ascending order #uses variation of quick sort Algorithm.

import java.util.Arrays;

class BubbleSortExample { // using sort method of arrays
    public static void main(String args[]) {
        int data[] = { 4, -5, 2, 6, 1};

        Arrays.sort(data);

        for(int c: data) {
            System.out.println(c);
        }
    }
}


















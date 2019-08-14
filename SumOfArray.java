// sum the elements of an array

/*

class SumOfArray {
    public static void main(String args[]) {
        int[] array = {10, 20, 30, 40, 50};
        int sum = 0;

        // advance for loop
        for (int num : array ) {
            sum = sum+num;
        }
        System.out.println("Sum of array elements is:" + sum);
    }
}

 */

// User will enter the array of elements

import java.util.Scanner;
class SumOfArray {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        int sum = 0;
        System.out.println("Enter the elements:");
        for (int i=0; i<10; i++) {
            array[i] = scanner.nextInt();
        }
        for( int num : array) {
            sum = sum+num;
        }
        System.out.println("Sum of array elements is:"+sum);
    }
}
// Generate Multiplication table using for loop

/*
public class MultiplicationTable {
    public static void main(String[] args) {

        int num = 5;
        for(int i = 1; i <= 10; ++i ) {
            System.out.printf("%d * %d = %d \n", num, i, num * i);
        }
    }
}

 */

// This time using the while loop
public class MultiplicationTable {
    public static void main(String[] args) {

        int num = 9, i = 1;
        while(i <= 10) {
            System.out.printf("%d * %d = %d \n", num, i, num * i);
            i++;
        }
    }
}
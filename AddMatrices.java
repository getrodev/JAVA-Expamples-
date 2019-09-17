// Let's add two Matrices
/*
public class AddMatrices {

    public static void main(String[] args) {
        int rows = 2, columns = 3;
        int[][] firstMatrix = { {2, 3, 4}, {5, 2, 3} };
        int[][] secondMatrix = { { -4, 5, 3},{5, 6, 3} };

        // Adding Two matrices
        int [][] sum = new int[rows][columns];
        for(int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sum[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
            }
        }

        // Displaying the result
        System.out.println("Sum of two matrices is: ");
        for(int[] row : sum ) {
            for (int column : row) {
                System.out.print(column + "  ");
            }
            System.out.println();
        }
    }
}
 */

import java.util.Scanner;

class AddMatrices {
    public static void main(String args[]) {
        int m, n, c, d;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number of rows and columns of matrix");
        m = in.nextInt();
        n = in.nextInt();

        int first[][] = new int[m][n];
        int second[][] = new int[m][n];
        int sum[][] = new int[m][n];

        System.out.println("Enter the elements of first matrix");

        for (c = 0; c < m; c++)
            for (d = 0 ; d < n ; d++)
                first[c][d] = in.nextInt();

        System.out.println("Enter the elements of second matrix");

        for (c = 0; c < m; c++)
            for ( d = 0; d < n; d++)
                second[c][d] = in.nextInt();

        for (c = 0; c < m; c++)
            for (d =0; d < n; d++)
                sum[c][d] = first[c][d] + second[c][d];
             // replace '+' with '-' to subtract matrices.

        System.out.println("Sum of the matrices:");

        for( c= 0; c < m; c++ ) {
            for (d =0; d < n; d++)
                System.out.print(sum[c][d]+"\t");

            System.out.println();
        }
    }
}











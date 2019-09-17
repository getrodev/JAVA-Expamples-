// Find Transpose of a Matrix

/*
public class Transpose {
    public static void main(String[] args) {
        int row = 2, column = 3;
        int[][] matrix = {{2, 3, 4}, {5, 6, 4}};

        // Display current matrix
        display(matrix);

        // Transpose the matrix
        int[][] transpose = new int[column][row];
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < column; j++ ) {
                transpose[j][i] = matrix[i][j];
            }
        }


        // Display transposed matrix
        display(transpose);
    }

    public static void display(int[][] matrix) {
        System.out.println("The matrix is: ");
        for(int[] row : matrix) {
            for (int column : row) {
                System.out.print(column + "  ");
            }
            System.out.println();
        }
    }
}
 */

import java.util.Scanner;

class Transpose {
    public static void main(String args[]) {
        int m, n, c, d;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of matrix");
        m = in.nextInt();
        n = in.nextInt();

        int matrix[][] = new int[m][n];

        System.out.println("Enter the elements of matrix");

        for (c = 0; c < m; c++)
            for (d = 0; d < n; d++)
                matrix[c][d] = in.nextInt();

        int transpose[][] = new int[n][m];

        for( c = 0; c < m; c++)
            for (d = 0; d < n; d++)
                transpose[d][c] = matrix[c][d];
        System.out.println("Transpose of the matrix");

        for (c = 0; c <  n; c++ ) {
            for (d = 0; d < m; d++)
                System.out.print(transpose[c][d] + "\t");

            System.out.print("\n");

        }
    }
}


// to check if a matrix symmetric or not,
// compare the matrix with it's transpose.


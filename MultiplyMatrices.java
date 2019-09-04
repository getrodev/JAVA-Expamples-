// Multiply Matrix using a function
/*
public class MultiplyMatrices {

    public static void main(String[] args) {
        int r1 = 2, c1 = 3;
        int r2 = 3, c2 = 2;
        int[][] firstMatrix = { {3, -2, 5}, {3, 0, 4} };
        int[][] secondMatrix = { {2, 3}, {-9, 0}, {0, 4} };

        // Multiplying Two matrices
        int[][] product = new int[r1][c2];
        for(int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    product[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
                }
            }
        }

        // Displaying the result
        System.out.println("Sum of two matrices is: ");
        for(int[] row : product) {
            for (int column : row) {
                System.out.print(column + "  ");
            }
            System.out.println();
        }
    }
}
 */


public class MultiplyMatrices { //addMatrices {

    public static void main(String[] args) {
        int rows = 2, columns = 3;
        int [][] firstMatrix = { {2, 3, 4}, {5, 2, 3} };
        int [][] secondMatrix = { {-4, 5, 3}, {5, 6, 3} };

        /// Adding Two matrices
        int[][] sum = new int[rows][columns];
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
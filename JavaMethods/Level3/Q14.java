package JavaMethods.Level3;
import java.util.Random;

public class Q14 {
    public static int[][] createRandomMatrix(int rows, int cols) {
        Random rand = new Random();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                matrix[i][j] = rand.nextInt(10) + 1; 
        return matrix;
    }
    public static int[][] addMatrices(int[][] A, int[][] B) {
        int rows = A.length, cols = A[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                result[i][j] = A[i][j] + B[i][j];
        return result;
    }
    public static int[][] subtractMatrices(int[][] A, int[][] B) {
        int rows = A.length, cols = A[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                result[i][j] = A[i][j] - B[i][j];
        return result;
    }
    public static int[][] multiplyMatrices(int[][] A, int[][] B) {
        int rowsA = A.length, colsA = A[0].length;
        int rowsB = B.length, colsB = B[0].length;
        if (colsA != rowsB) throw new IllegalArgumentException("Matrix dimensions mismatch for multiplication.");

        int[][] result = new int[rowsA][colsB];
        for (int i = 0; i < rowsA; i++)
            for (int j = 0; j < colsB; j++)
                for (int k = 0; k < colsA; k++)
                    result[i][j] += A[i][k] * B[k][j];
        return result;
    }
    public static void displayMatrix(String label, int[][] matrix) {
        System.out.println(label + ":");
        for (int[] row : matrix) {
            for (int val : row)
                System.out.print(val + "\t");
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int rows = 2, cols = 3;
        int[][] A = createRandomMatrix(rows, cols);
        int[][] B = createRandomMatrix(rows, cols);
        int[][] C = createRandomMatrix(cols, rows); 

        int[][] sum = addMatrices(A, B);
        int[][] diff = subtractMatrices(A, B);
        int[][] product = multiplyMatrices(A, C);

        displayMatrix("Matrix A", A);
        displayMatrix("Matrix B", B);
        displayMatrix("Matrix C", C);
        displayMatrix("A + B", sum);
        displayMatrix("A - B", diff);
        displayMatrix("A × C", product);
    }
}
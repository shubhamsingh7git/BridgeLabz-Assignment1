package JavaMethods.Level3;
import java.util.Random;
public class Q15 {
	public static double[][] createRandomMatrix(int rows, int cols) {
        Random rand = new Random();
        double[][] matrix = new double[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                matrix[i][j] = rand.nextInt(10) + 1; 
        return matrix;
    }
    public static void displayMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double val : row)
                System.out.printf("%8.2f ", val);
            System.out.println();
        }
    }
    public static double[][] transposeMatrix(double[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        double[][] transpose = new double[cols][rows];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                transpose[j][i] = matrix[i][j];
        return transpose;
    }
    public static double determinant2x2(double[][] matrix) {
        return matrix[0][0]*matrix[1][1] - matrix[0][1]*matrix[1][0];
    }
    public static double determinant3x3(double[][] m) {
        return m[0][0]*(m[1][1]*m[2][2]-m[1][2]*m[2][1])
             - m[0][1]*(m[1][0]*m[2][2]-m[1][2]*m[2][0])
             + m[0][2]*(m[1][0]*m[2][1]-m[1][1]*m[2][0]);
    }
    public static double[][] inverse2x2(double[][] matrix) {
        double det = determinant2x2(matrix);
        if(det == 0) return null;
        double[][] inverse = new double[2][2];
        inverse[0][0] =  matrix[1][1]/det;
        inverse[0][1] = -matrix[0][1]/det;
        inverse[1][0] = -matrix[1][0]/det;
        inverse[1][1] =  matrix[0][0]/det;
        return inverse;
    }
    public static double[][] inverse3x3(double[][] m) {
        double det = determinant3x3(m);
        if(det == 0) return null;

        double[][] adj = new double[3][3];

        adj[0][0] =  (m[1][1]*m[2][2] - m[1][2]*m[2][1]);
        adj[0][1] = -(m[0][1]*m[2][2] - m[0][2]*m[2][1]);
        adj[0][2] =  (m[0][1]*m[1][2] - m[0][2]*m[1][1]);

        adj[1][0] = -(m[1][0]*m[2][2] - m[1][2]*m[2][0]);
        adj[1][1] =  (m[0][0]*m[2][2] - m[0][2]*m[2][0]);
        adj[1][2] = -(m[0][0]*m[1][2] - m[0][2]*m[1][0]);

        adj[2][0] =  (m[1][0]*m[2][1] - m[1][1]*m[2][0]);
        adj[2][1] = -(m[0][0]*m[2][1] - m[0][1]*m[2][0]);
        adj[2][2] =  (m[0][0]*m[1][1] - m[0][1]*m[1][0]);

        double[][] inverse = new double[3][3];
        for(int i=0;i<3;i++)
            for(int j=0;j<3;j++)
                inverse[i][j] = adj[j][i]/det;

        return inverse;
    }

    public static void main(String[] args) {
        double[][] matrix2x2 = createRandomMatrix(2,2);
        System.out.println("2x2 Matrix:");
        displayMatrix(matrix2x2);

        System.out.println("\nTranspose:");
        displayMatrix(transposeMatrix(matrix2x2));

        System.out.printf("\nDeterminant: %.2f\n", determinant2x2(matrix2x2));

        double[][] inv2 = inverse2x2(matrix2x2);
        System.out.println("\nInverse:");
        if(inv2 != null) displayMatrix(inv2);
        else System.out.println("Matrix not invertible.");
        double[][] matrix3x3 = createRandomMatrix(3,3);
        System.out.println("\n3x3 Matrix:");
        displayMatrix(matrix3x3);

        System.out.println("\nTranspose:");
        displayMatrix(transposeMatrix(matrix3x3));

        System.out.printf("\nDeterminant: %.2f\n", determinant3x3(matrix3x3));

        double[][] inv3 = inverse3x3(matrix3x3);
        System.out.println("\nInverse:");
        if(inv3 != null) displayMatrix(inv3);
        else System.out.println("Matrix not invertible.");
    }

}

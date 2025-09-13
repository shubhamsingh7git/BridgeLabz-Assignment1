package JavaMethods.Level2;
import java.util.Scanner;
public class Q1 {
	public static int[] findFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++)
            if (number % i == 0) count++;

        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++)
            if (number % i == 0) factors[index++] = i;

        return factors;
    }

    public static int sum(int[] arr) {
        int total = 0;
        for (int n : arr) total += n;
        return total;
    }

    public static int sumOfSquares(int[] arr) {
        int total = 0;
        for (int n : arr) total += Math.pow(n, 2);
        return total;
    }

    public static int product(int[] arr) {
        int prod = 1;
        for (int n : arr) prod *= n;
        return prod;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int[] factors = findFactors(number);

        System.out.print("Factors: ");
        for (int f : factors) System.out.print(f + " ");
        System.out.println();

        System.out.println("Sum: " + sum(factors));
        System.out.println("Sum of squares: " + sumOfSquares(factors));
        System.out.println("Product: " + product(factors));

        sc.close();
    }

}

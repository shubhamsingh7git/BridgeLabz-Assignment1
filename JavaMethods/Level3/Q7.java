package JavaMethods.Level3;
import java.util.Arrays;
public class Q7 {
	public static int[] findFactors(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++)
            if (n % i == 0) count++;
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= n; i++)
            if (n % i == 0) factors[index++] = i;
        return factors;
    }

    public static int greatestFactor(int[] factors) {
        return factors[factors.length - 1];
    }

    public static int sumFactors(int[] factors) {
        int sum = 0;
        for (int f : factors) sum += f;
        return sum;
    }

    public static long productFactors(int[] factors) {
        long product = 1;
        for (int f : factors) product *= f;
        return product;
    }

    public static long productCubeFactors(int[] factors) {
        long product = 1;
        for (int f : factors) product *= Math.pow(f, 3);
        return product;
    }

    public static void main(String[] args) {
        int number = 12;
        int[] factors = findFactors(number);
        System.out.println("Factors: " + Arrays.toString(factors));
        System.out.println("Greatest Factor: " + greatestFactor(factors));
        System.out.println("Sum of Factors: " + sumFactors(factors));
        System.out.println("Product of Factors: " + productFactors(factors));
        System.out.println("Product of Cubes of Factors: " + productCubeFactors(factors));
    }

}

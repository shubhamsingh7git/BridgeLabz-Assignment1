package JavaMethods.Level2;
import java.util.Scanner;
public class Q2 {
	 public static int sumRecursive(int n) {
	        if (n <= 1) return n;
	        return n + sumRecursive(n - 1);
	    }

	    public static int sumFormula(int n) {
	        return n * (n + 1) / 2;
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a natural number: ");
	        int n = sc.nextInt();

	        if (n <= 0) {
	            System.out.println("Invalid input. Enter a natural number (>0).");
	        } else {
	            int sumRec = sumRecursive(n);
	            int sumFor = sumFormula(n);
	            System.out.println("Sum using recursion: " + sumRec);
	            System.out.println("Sum using formula: " + sumFor);
	            System.out.println("Both results match: " + (sumRec == sumFor));
	        }

	        sc.close();
	    }

}

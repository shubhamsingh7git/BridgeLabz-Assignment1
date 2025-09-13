package JavaMethods.Level2;
import java.util.Scanner;
public class Q11 {
	 public static double[] findRoots(double a, double b, double c) {
	        double delta = Math.pow(b, 2) - 4 * a * c;

	        if (delta < 0) {
	            return new double[0]; 
	        } else if (delta == 0) {
	            return new double[]{-b / (2 * a)};
	        } else {
	            double sqrtDelta = Math.sqrt(delta);
	            double root1 = (-b + sqrtDelta) / (2 * a);
	            double root2 = (-b - sqrtDelta) / (2 * a);
	            return new double[]{root1, root2}; 
	        }
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a: ");
	        double a = sc.nextDouble();
	        System.out.print("Enter b: ");
	        double b = sc.nextDouble();
	        System.out.print("Enter c: ");
	        double c = sc.nextDouble();

	        double[] roots = findRoots(a, b, c);

	        if (roots.length == 0) {
	            System.out.println("No real roots exist.");
	        } else if (roots.length == 1) {
	            System.out.println("One root: " + roots[0]);
	        } else {
	            System.out.println("Two roots: " + roots[0] + " and " + roots[1]);
	        }

	        sc.close();
	    }

}

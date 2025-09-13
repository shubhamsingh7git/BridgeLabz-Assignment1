package JavaMethods.Level1;
import java.util.Scanner;
public class Q3 {
	 public static int calculateRounds(double side1, double side2, double side3, double totalDistanceMeters) {
	        double perimeter = side1 + side2 + side3;
	        return (int) Math.ceil(totalDistanceMeters / perimeter); 
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the first side of the triangle (in meters): ");
	        double side1 = sc.nextDouble();

	        System.out.print("Enter the second side of the triangle (in meters): ");
	        double side2 = sc.nextDouble();

	        System.out.print("Enter the third side of the triangle (in meters): ");
	        double side3 = sc.nextDouble();

	        double totalDistanceMeters = 5000;

	        int rounds = calculateRounds(side1, side2, side3, totalDistanceMeters);
	        System.out.println("The athlete must complete " + rounds + " rounds to run 5 km.");

	        sc.close();
	    }

}

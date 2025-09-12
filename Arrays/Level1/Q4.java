package Arrays.Level1;
import java.util.Scanner;
public class Q4 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        double[] arr = new double[10];
	        double total = 0.0;
	        int i = 0;

	        System.out.println("Enter numbers (max 10). Enter 0 or negative to stop:");

	        while (true) {
	            double num = sc.nextDouble();

	            if (num <= 0 || i == 10) {
	                break;
	            }

	            arr[i] = num;
	            i++;
	        }

	        System.out.print("Numbers entered: ");
	        for (int j = 0; j < i; j++) {
	            System.out.print(arr[j] + " ");
	            total += arr[j];
	        }

	        System.out.println("\nSum = " + total);
	        sc.close();
	    }
	 
}
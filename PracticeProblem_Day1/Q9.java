package PracticeProblem_Day1;
import java.util.Scanner;
public class Q9 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double n1 = sc.nextDouble();
        System.out.print("Enter second number: ");
        double n2 = sc.nextDouble();
        System.out.print("Enter third number: ");
        double n3 = sc.nextDouble();
        double avg = (n1 + n2 + n3) / 3;
        System.out.println("Average: " + avg);
        sc.close();
    }

}

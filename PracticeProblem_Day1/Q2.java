package PracticeProblem_Day1;
import java.util.Scanner;

public class Q2 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();
        System.out.println("Sum = " + (num1 + num2));
        sc.close();
    }

}

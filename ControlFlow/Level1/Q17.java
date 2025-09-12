package ControlFlow.Level1;
import java.util.Scanner;

public class Q17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the employee's salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter the years of service: ");
        int yearsOfService = sc.nextInt();
        double bonus = 0.0;

        if (yearsOfService > 5) {
            bonus = salary * 0.05;
        }
        System.out.println("The bonus amount is: INR " + bonus);
        sc.close();
    }
}

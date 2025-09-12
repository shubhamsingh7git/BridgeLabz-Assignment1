package ControlFlow.Level1;
import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double total = 0.0;
        double number;
        System.out.print("Enter a number (0 to stop): ");
        number = sc.nextDouble();
        while (number != 0) {
            total += number; 
            System.out.print("Enter a number (0 to stop): ");
            number = sc.nextDouble();
        }
        System.out.println("The total sum is: " + total);

        sc.close();
    }
}

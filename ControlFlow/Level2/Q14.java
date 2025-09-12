package ControlFlow.Level2;
import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base number (positive integer): ");
        int number = sc.nextInt();

        System.out.print("Enter the power (positive integer): ");
        int power = sc.nextInt();
        int result = 1;
        int counter = 0;

        while (counter < power) {
            result *= number;
            counter++;
        }
        System.out.println(number + " raised to the power of " + power + " is: " + result);

        sc.close();
    }
}

package ControlFlow.Level2;
import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        if (number < 1) {
            System.out.println("The number " + number + " is not a positive integer.");
        } else {
            System.out.print("Factors of " + number + " are: ");
            int counter = 1;

            while (counter <= number) {
                if (number % counter == 0) {
                    System.out.print(counter + " ");
                }
                counter++;
            }
        }

        sc.close();
    }
}

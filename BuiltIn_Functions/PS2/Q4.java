package BuiltIn_Functions.PS2;
import java.util.Scanner;

public class Q4 {

    
    public static void generateFibonacci(int terms) {
        int first = 0, second = 1;

        System.out.print("Fibonacci Sequence (" + terms + " terms): ");

        for (int i = 1; i <= terms; i++) {
            System.out.print(first + " ");


            int next = first + second;
            first = second;
            second = next;
        }
        System.out.println();
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive number greater than 0.");
        } else {
            generateFibonacci(n);
        }

        sc.close();
    }
}

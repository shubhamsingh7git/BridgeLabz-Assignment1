package BuiltIn_Functions.PS2;
import java.util.Scanner;

public class Q6 {

  
    public static int getInput(Scanner sc) {
        System.out.print("Enter a number to calculate factorial: ");
        return sc.nextInt();
    }

    
    public static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;  
        } else {
            return n * factorial(n - 1);  
        }
    }

   
    public static void displayResult(int n, long result) {
        System.out.println("Factorial of " + n + " is: " + result);
    }

  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = getInput(sc);

        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            long result = factorial(number);
            displayResult(number, result);
        }

        sc.close();
    }
}

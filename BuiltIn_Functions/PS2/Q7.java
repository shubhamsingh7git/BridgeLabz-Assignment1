package BuiltIn_Functions.PS2;
import java.util.Scanner;

public class Q7 {

    
    public static int getInput(Scanner sc, String prompt) {
        System.out.print(prompt);
        return sc.nextInt();
    }

    
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

   
    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    
    public static void displayResult(int a, int b, int gcdValue, int lcmValue) {
        System.out.println("Numbers: " + a + " and " + b);
        System.out.println("GCD: " + gcdValue);
        System.out.println("LCM: " + lcmValue);
    }

  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = getInput(sc, "Enter the first number: ");
        int num2 = getInput(sc, "Enter the second number: ");

        int gcdValue = gcd(num1, num2);
        int lcmValue = lcm(num1, num2);

        displayResult(num1, num2, gcdValue, lcmValue);

        sc.close();
    }
}

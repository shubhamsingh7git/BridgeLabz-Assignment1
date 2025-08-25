package section_F.Day_1;
import java.util.Scanner;

public class Q29 {

    public static long factorial(int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        long result = factorial(num);

        System.out.println("Factorial of " + num + " = " + result);

        sc.close();
    }
}

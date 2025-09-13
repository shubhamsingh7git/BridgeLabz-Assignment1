package JavaMethods.Level2;
import java.util.Scanner;
public class Q9 {
	public static boolean isPositive(int n) { return n >= 0; }
    public static boolean isEven(int n) { return n % 2 == 0; }
    public static int compare(int n1, int n2) {
        if (n1 > n2) return 1;
        else if (n1 < n2) return -1;
        else return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i+1) + ": ");
            numbers[i] = sc.nextInt();
        }

        for (int n : numbers) {
            if (isPositive(n)) {
                if (isEven(n)) System.out.println(n + " is positive and even");
                else System.out.println(n + " is positive and odd");
            } else System.out.println(n + " is negative");
        }

        int cmp = compare(numbers[0], numbers[4]);
        if (cmp == 1) System.out.println("First element is greater than last element");
        else if (cmp == -1) System.out.println("First element is less than last element");
        else System.out.println("First element is equal to last element");

        sc.close();
    }

}

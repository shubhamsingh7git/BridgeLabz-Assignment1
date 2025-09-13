package Strings.Level1;
import java.util.Scanner;

public class Q8{
    static void generateException(String[] names) {
        System.out.println("Accessing invalid index: " + names[names.length]);
    }
    static void handleException(String[] names) {
        try {
            System.out.println("Accessing invalid index: " + names[names.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException! Index is out of array bounds.");
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException! Some other runtime error occurred.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of names: ");
        int n = sc.nextInt();
        String[] names = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = sc.next();
        }

        System.out.println("\nGenerating ArrayIndexOutOfBoundsException:");

        System.out.println("\nHandling ArrayIndexOutOfBoundsException:");
        handleException(names);

        sc.close();
    }
}

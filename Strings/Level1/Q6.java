package Strings.Level1;
import java.util.Scanner;

public class Q6 {
    static void generateException(String text) {
        System.out.println("Substring: " + text.substring(5, 2));
    }
    static void handleException(String text) {
        try {
            System.out.println("Substring: " + text.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException! Start index cannot be greater than end index.");
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException! Some other runtime error occurred.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.next();

        System.out.println("\nGenerating IllegalArgumentException:");
        System.out.println("\nHandling IllegalArgumentException:");
        handleException(text);

        sc.close();
    }
}

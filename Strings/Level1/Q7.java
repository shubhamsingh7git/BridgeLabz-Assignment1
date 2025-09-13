package Strings.Level1;
import java.util.Scanner;

public class Q7{

    static void generateException(String text) {
        int number = Integer.parseInt(text);  
        System.out.println("Parsed number: " + number);
    }
    static void handleException(String text) {
        try {
            int number = Integer.parseInt(text);
            System.out.println("Parsed number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException! Input is not a valid integer.");
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException! Some other runtime error occurred.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to parse as integer: ");
        String text = sc.next();

        System.out.println("\nGenerating NumberFormatException:");
        System.out.println("\nHandling NumberFormatException:");
        handleException(text);

        sc.close();
    }
}

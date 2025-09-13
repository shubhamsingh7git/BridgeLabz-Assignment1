package Strings.Level1;
import java.util.Scanner;

public class Q5 {
    static void generateException(String text) {
        System.out.println("Character at invalid index: " + text.charAt(text.length()));
    }
    static void handleException(String text) {
        try {
            System.out.println("Character at invalid index: " + text.charAt(text.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException! Index is out of range.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.next();

        System.out.println("\nGenerating StringIndexOutOfBoundsException:");

        System.out.println("\nHandling StringIndexOutOfBoundsException:");
        handleException(text);

        sc.close();
    }
}

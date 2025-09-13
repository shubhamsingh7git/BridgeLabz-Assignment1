package Strings.Level2;
import java.util.Scanner;

public class Q1{
    static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);  
                count++;             
            }
        } catch (StringIndexOutOfBoundsException e) {
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.next();
        int customLength = findLength(input);
        int builtinLength = input.length();
        System.out.println("\nLength using custom method: " + customLength);
        System.out.println("Length using built-in method: " + builtinLength);

        sc.close();
    }
}

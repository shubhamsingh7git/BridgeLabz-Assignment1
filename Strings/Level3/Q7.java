package Strings.Level3;
import java.util.Scanner;

public class Q7 {

    // Logic 1: Iterative check
    public static boolean isPalindromeIterative(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Logic 2: Recursive check
    public static boolean isPalindromeRecursive(String text, int start, int end) {
        if (start >= end) return true; 
        if (text.charAt(start) != text.charAt(end)) return false;
        return isPalindromeRecursive(text, start + 1, end - 1);
    }
    public static char[] reverseString(String text) {
        int n = text.length();
        char[] reverse = new char[n];

        for (int i = 0; i < n; i++) {
            reverse[i] = text.charAt(n - 1 - i);
        }
        return reverse;
    }

    // Logic 3: Compare char arrays
    public static boolean isPalindromeArray(String text) {
        char[] original = text.toCharArray();
        char[] reversed = reverseString(text);

        for (int i = 0; i < original.length; i++) {
            if (original[i] != reversed[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a text: ");
        String input = sc.nextLine();
        input = input.replaceAll("\\s+", "").toLowerCase();
        boolean result1 = isPalindromeIterative(input);
        boolean result2 = isPalindromeRecursive(input, 0, input.length() - 1);
        boolean result3 = isPalindromeArray(input);

        System.out.println("\nPalindrome Check Results:");
        System.out.println("Logic 1 (Iterative): " + (result1 ? "Palindrome" : "Not Palindrome"));
        System.out.println("Logic 2 (Recursive): " + (result2 ? "Palindrome" : "Not Palindrome"));
        System.out.println("Logic 3 (Array)    : " + (result3 ? "Palindrome" : "Not Palindrome"));

        sc.close();
    }
}

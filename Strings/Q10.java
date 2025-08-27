package Strings;
import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence: ");
        String str = sc.nextLine();

        String[] words = str.split("\\s+"); 
        String result = "";

        for (String word : words) {
            String reversedWord = "";
            for (int i = word.length() - 1; i >= 0; i--) {
                reversedWord += word.charAt(i); 
            }
            result += reversedWord + " ";
        }

        System.out.println("Reversed words: " + result.trim());
    }
}

package Strings.Level1;
import java.util.Scanner;

public class Q10{

    static String convertToLowerCharAt(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32); 
            }
            result += ch;
        }
        return result;
    }
    static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String text = sc.nextLine();
        String lowerCharAt = convertToLowerCharAt(text);
        String lowerBuiltIn = text.toLowerCase();

    
        boolean areEqual = compareStrings(lowerCharAt, lowerBuiltIn);

      
        System.out.println("\nLowercase using charAt(): " + lowerCharAt);
        System.out.println("Lowercase using built-in toLowerCase(): " + lowerBuiltIn);
        System.out.println("Are both lowercase strings equal? " + areEqual);

        sc.close();
    }
}

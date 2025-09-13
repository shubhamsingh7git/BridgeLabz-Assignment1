package Strings.Level1;
import java.util.Scanner;

public class Q9 {
    static String convertToUpperCharAt(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 32); 
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
        String upperCharAt = convertToUpperCharAt(text);

        String upperBuiltIn = text.toUpperCase();
        boolean areEqual = compareStrings(upperCharAt, upperBuiltIn);
        System.out.println("\nUppercase using charAt(): " + upperCharAt);
        System.out.println("Uppercase using built-in toUpperCase(): " + upperBuiltIn);
        System.out.println("Are both uppercase strings equal? " + areEqual);

        sc.close();
    }
}

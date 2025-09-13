package Strings.Level1;
import java.util.Scanner;

public class Q3 {
    static char[] getChars(String text) {
        char[] chars = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            chars[i] = text.charAt(i);
        }
        return chars;
    }
    static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.next();
        char[] charsUserDefined = getChars(text);
        char[] charsBuiltIn = text.toCharArray();
        boolean areEqual = compareCharArrays(charsUserDefined, charsBuiltIn);
        System.out.print("\nCharacters using user-defined method: ");
        for (char c : charsUserDefined) {
            System.out.print(c + " ");
        }

        System.out.print("\nCharacters using built-in toCharArray(): ");
        for (char c : charsBuiltIn) {
            System.out.print(c + " ");
        }

        System.out.println("\nAre both character arrays equal? " + areEqual);

        sc.close();
    }
}

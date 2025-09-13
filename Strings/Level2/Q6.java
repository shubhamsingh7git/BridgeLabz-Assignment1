package Strings.Level2;
import java.util.Scanner;

public class Q6 {
    static String checkCharType(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32);
        }
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }

        return "Not a Letter";
    }
    static String[][] analyzeString(String text) {
        String[][] result = new String[text.length()][2];

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            result[i][0] = String.valueOf(ch);  
            result[i][1] = checkCharType(ch);  
        }

        return result;
    }
    static void displayTable(String[][] table) {
        System.out.println("\nCharacter\tType");
        System.out.println(" ");
        for (int i = 0; i < table.length; i++) {
            System.out.println("   " + table[i][0] + "\t\t" + table[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        String[][] result = analyzeString(input);
        displayTable(result);

        sc.close();
    }
}

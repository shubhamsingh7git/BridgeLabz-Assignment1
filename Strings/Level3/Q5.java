package Strings.Level3;
import java.util.Scanner;

public class Q5 {
    public static char[] uniqueCharacters(String text) {
        int n = text.length();
        char[] temp = new char[n];
        int uniqueCount = 0;

        for (int i = 0; i < n; i++) {
            char ch = text.charAt(i);
            boolean isUnique = true;
            for (int j = 0; j < uniqueCount; j++) {
                if (temp[j] == ch) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                temp[uniqueCount] = ch;
                uniqueCount++;
            }
        }
        char[] result = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            result[i] = temp[i];
        }

        return result;
    }
    public static String[][] findFrequency(String text) {
        int[] freq = new int[256]; 
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            freq[ch]++;
        }
        char[] uniqueChars = uniqueCharacters(text);
        String[][] result = new String[uniqueChars.length][2];

        for (int i = 0; i < uniqueChars.length; i++) {
            result[i][0] = String.valueOf(uniqueChars[i]);
            result[i][1] = String.valueOf(freq[uniqueChars[i]]);
        }

        return result;
    }
    public static void displayResult(String[][] data) {
        System.out.printf("%-10s %-10s\n", "Character", "Frequency");
        System.out.println(" ");

        for (int i = 0; i < data.length; i++) {
            System.out.printf("%-10s %-10s\n", data[i][0], data[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String[][] result = findFrequency(input);

        System.out.println("\nCharacter Frequencies:");
        displayResult(result);

        sc.close();
    }
}

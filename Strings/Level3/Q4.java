package Strings.Level3;
import java.util.Scanner;

public class Q4 {
    public static String[][] findFrequency(String text) {
        int[] freq = new int[256]; 
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            freq[ch]++;
        }
        String[][] result = new String[text.length()][2];
        int index = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (freq[ch] != 0) { 
                result[index][0] = String.valueOf(ch);
                result[index][1] = String.valueOf(freq[ch]);
                freq[ch] = 0; 
                index++;
            }
        }
        String[][] finalResult = new String[index][2];
        for (int i = 0; i < index; i++) {
            finalResult[i][0] = result[i][0];
            finalResult[i][1] = result[i][1];
        }

        return finalResult;
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

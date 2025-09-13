package Strings.Level2;
import java.util.Scanner;

public class Q3 {
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
    static String[] manualSplit(String text) {
        int length = findLength(text);
        int wordCount = 1;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        String[] words = new String[wordCount];

        int start = 0, wordIndex = 0;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                words[wordIndex++] = text.substring(start, i);
                start = i + 1;
            }
        }
        words[wordIndex] = text.substring(start, length);

        return words;
    }
    static String[][] wordsWithLength(String[] words) {
        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];                         
            result[i][1] = String.valueOf(findLength(words[i])); 
        }

        return result;
    }
    static void displayTable(String[][] table) {
        System.out.println("\nWord\tLength");
        System.out.println(" ");
        for (int i = 0; i < table.length; i++) {
            String word = table[i][0];
            int length = Integer.parseInt(table[i][1]); 
            System.out.println(word + "\t" + length);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();
        String[] words = manualSplit(text);
        String[][] result = wordsWithLength(words);

        displayTable(result);

        sc.close();
    }
}

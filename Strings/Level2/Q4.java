package Strings.Level2;
import java.util.Scanner;

public class Q4 {
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
    static int[] findShortestAndLongest(String[][] wordsTable) {
        int shortestIndex = 0;
        int longestIndex = 0;

        for (int i = 1; i < wordsTable.length; i++) {
            int len = Integer.parseInt(wordsTable[i][1]);
            int shortestLen = Integer.parseInt(wordsTable[shortestIndex][1]);
            int longestLen = Integer.parseInt(wordsTable[longestIndex][1]);

            if (len < shortestLen) {
                shortestIndex = i;
            }
            if (len > longestLen) {
                longestIndex = i;
            }
        }

        return new int[]{shortestIndex, longestIndex};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();
        String[] words = manualSplit(text);
        String[][] wordsTable = wordsWithLength(words);
        int[] result = findShortestAndLongest(wordsTable);
        System.out.println("\nWord\tLength");
        System.out.println(" ");
        for (int i = 0; i < wordsTable.length; i++) {
            System.out.println(wordsTable[i][0] + "\t" + wordsTable[i][1]);
        }
        System.out.println("\nShortest word: " + wordsTable[result[0]][0] +
                           " (Length: " + wordsTable[result[0]][1] + ")");
        System.out.println("Longest word: " + wordsTable[result[1]][0] +
                           " (Length: " + wordsTable[result[1]][1] + ")");

        sc.close();
    }
}

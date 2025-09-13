package Strings.Level2;
import java.util.Scanner;

public class Q2{
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
    static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) return false;

        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }
        return true;
    }
    static void printArray(String[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();
        String[] manualWords = manualSplit(text);
        String[] builtinWords = text.split(" ");
        boolean areEqual = compareArrays(manualWords, builtinWords);

        System.out.println("\nManual split result:");
        printArray(manualWords);

        System.out.println("\nBuilt-in split() result:");
        printArray(builtinWords);

        System.out.println("\nAre both results same? " + areEqual);

        sc.close();
    }
}

package Strings.Level3;
import java.util.Scanner;

public class Q2 {
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);  
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
        }
        return count;
    }
    public static char[] findUniqueChars(String text) {
        int n = findLength(text);
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        char[] uniqueChars = findUniqueChars(input);

        System.out.print("Unique characters: ");
        for (char c : uniqueChars) {
            System.out.print(c + " ");
        }

        sc.close();
    }
}

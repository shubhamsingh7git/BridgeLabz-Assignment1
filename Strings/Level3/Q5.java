package Strings.Level3;
import java.util.*;

public class Q5 {
    public static char[] uniqueChars(String s) {
        char[] temp = new char[s.length()];
        int k = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            boolean unique = true;
            for (int j = 0; j < i; j++) {
                if (s.charAt(j) == c) { unique = false; break; }
            }
            if (unique) temp[k++] = c;
        }
        return Arrays.copyOf(temp, k);
    }
    public static String[][] frequency(String s) {
        int[] freq = new int[256];
        for (int i = 0; i < s.length(); i++) freq[s.charAt(i)]++;
        char[] uniques = uniqueChars(s);
        String[][] result = new String[uniques.length][2];
        for (int i = 0; i < uniques.length; i++) {
            result[i][0] = String.valueOf(uniques[i]);
            result[i][1] = String.valueOf(freq[uniques[i]]);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        String[][] result = frequency(text);
        for (String[] row : result) System.out.println(row[0] + " -> " + row[1]);
        sc.close();
    }
}

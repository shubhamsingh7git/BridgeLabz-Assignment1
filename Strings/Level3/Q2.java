package Strings.Level3;
import java.util.*;

public class Q2 {
    public static int length(String s) {
        int count = 0;
        try {
            while (true) {
                s.charAt(count);
                count++;
            }
        } catch (Exception e) {}
        return count;
    }
    public static char[] uniqueChars(String s) {
        int n = length(s);
        char[] temp = new char[n];
        int k = 0;
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            boolean unique = true;
            for (int j = 0; j < i; j++) {
                if (s.charAt(j) == c) {
                    unique = false;
                    break;
                }
            }
            if (unique) temp[k++] = c;
        }
        return Arrays.copyOf(temp, k);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        char[] unique = uniqueChars(text);
        System.out.println("Unique characters: " + Arrays.toString(unique));
        sc.close();
    }
}

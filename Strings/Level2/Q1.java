package Strings.Level2;
import java.util.*;

public class Q1 {
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.next();
        int customLength = findLength(text);
        int builtInLength = text.length();
        System.out.println("Custom Length: " + customLength);
        System.out.println("Built-in Length: " + builtInLength);
        sc.close();
    }
}

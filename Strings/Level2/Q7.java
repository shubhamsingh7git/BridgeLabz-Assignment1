package Strings.Level2;
import java.util.*;

public class Q7 {
    public static int[] findTrimIndexes(String str) {
        int start=0, end=str.length()-1;
        while (start<=end && str.charAt(start)==' ') start++;
        while (end>=start && str.charAt(end)==' ') end--;
        return new int[]{start, end};
    }

    public static String substring(String str, int start, int end) {
        StringBuilder sb = new StringBuilder();
        for (int i=start; i<=end; i++) sb.append(str.charAt(i));
        return sb.toString();
    }

    public static boolean compareStrings(String a, String b) {
        if (a.length() != b.length()) return false;
        for (int i=0; i<a.length(); i++) if (a.charAt(i) != b.charAt(i)) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string with spaces: ");
        String text = sc.nextLine();
        int[] idx = findTrimIndexes(text);
        String customTrim = substring(text, idx[0], idx[1]);
        String builtInTrim = text.trim();
        System.out.println("Custom Trim: '" + customTrim + "'");
        System.out.println("Built-in Trim: '" + builtInTrim + "'");
        System.out.println("Are both same? " + compareStrings(customTrim, builtInTrim));
        sc.close();
    }
}

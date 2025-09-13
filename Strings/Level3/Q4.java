package Strings.Level3;
import java.util.*;

public class Q4 {
    public static String[][] frequency(String s) {
        int[] freq = new int[256];
        for (int i = 0; i < s.length(); i++) freq[s.charAt(i)]++;
        List<String[]> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (freq[c] > 0) {
                list.add(new String[]{String.valueOf(c), String.valueOf(freq[c])});
                freq[c] = 0;
            }
        }
        return list.toArray(new String[0][0]);
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

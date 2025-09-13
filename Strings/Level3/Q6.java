package Strings.Level3;
import java.util.*;

public class Q6 {
    public static String[] frequency(String s) {
        char[] chars = s.toCharArray();
        int[] freq = new int[chars.length];
        for (int i = 0; i < chars.length; i++) {
            freq[i] = 1;
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    freq[i]++;
                    chars[j] = 0;
                }
            }
        }
        List<String> list = new ArrayList<>();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != 0) list.add(chars[i] + " -> " + freq[i]);
        }
        return list.toArray(new String[0]);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        String[] result = frequency(text);
        for (String r : result) System.out.println(r);
        sc.close();
    }
}

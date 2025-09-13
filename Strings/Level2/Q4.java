package Strings.Level2;
import java.util.*;

public class Q4 {
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) { str.charAt(count); count++; }
        } catch (Exception e) {}
        return count;
    }

    public static String[] splitWords(String str) {
        int length = findLength(str);
        List<String> words = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            char c = str.charAt(i);
            if (c == ' ') {
                if (sb.length() > 0) {
                    words.add(sb.toString());
                    sb.setLength(0);
                }
            } else sb.append(c);
        }
        if (sb.length() > 0) words.add(sb.toString());
        return words.toArray(new String[0]);
    }

    public static String[] findShortestLongest(String[] words) {
        String shortest = words[0], longest = words[0];
        for (String word : words) {
            if (findLength(word) < findLength(shortest)) shortest = word;
            if (findLength(word) > findLength(longest)) longest = word;
        }
        return new String[]{shortest, longest};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();
        String[] words = splitWords(text);
        String[] result = findShortestLongest(words);
        System.out.println("Shortest Word: " + result[0]);
        System.out.println("Longest Word: " + result[1]);
        sc.close();
    }
}

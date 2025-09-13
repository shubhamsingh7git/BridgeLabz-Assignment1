package Strings.Level2;
import java.util.*;

public class Q6 {
    public static String charType(char c) {
        if (!Character.isLetter(c)) return "Not a Letter";
        c = Character.toLowerCase(c);
        if ("aeiou".indexOf(c) >= 0) return "Vowel";
        return "Consonant";
    }

    public static String[][] analyzeString(String str) {
        String[][] result = new String[str.length()][2];
        for (int i=0; i<str.length(); i++) {
            result[i][0] = String.valueOf(str.charAt(i));
            result[i][1] = charType(str.charAt(i));
        }
        return result;
    }

    public static void display2D(String[][] arr) {
        System.out.println("Char\tType");
        for (String[] row : arr) System.out.println(row[0] + "\t" + row[1]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();
        String[][] analysis = analyzeString(text);
        display2D(analysis);
        sc.close();
    }
}

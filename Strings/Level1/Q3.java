package Strings.Level1;
import java.util.Scanner;
public class Q3 {
	public static char[] customToCharArray(String str) {
        char[] arr = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i);
        }
        return arr;
    }

    public static boolean compareArrays(char[] a, char[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.next();

        char[] customArr = customToCharArray(text);
        char[] builtInArr = text.toCharArray();

        System.out.println("Comparison: " + compareArrays(customArr, builtInArr));
        sc.close();
    }

}

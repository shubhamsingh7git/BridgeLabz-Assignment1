package JavaString_Extra;
import java.util.Scanner;
public class Q9 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int[] freq = new int[256];
        for (char c : str.toCharArray()) freq[c]++;

        int maxFreq = -1;
        char result = ' ';
        for (char c : str.toCharArray()) {
            if (freq[c] > maxFreq) {
                maxFreq = freq[c];
                result = c;
            }
        }

        System.out.println("Most Frequent Character: " + result);
        sc.close();
    }

}

package JavaString_Extra;
import java.util.Scanner;
public class Q6 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the main string: ");
        String str = sc.nextLine();

        System.out.print("Enter the substring: ");
        String sub = sc.nextLine();

        int count = 0, index = 0;
        while ((index = str.indexOf(sub, index)) != -1) {
            count++;
            index += sub.length();
        }

        System.out.println("Occurrences: " + count);
        sc.close();
    }

}

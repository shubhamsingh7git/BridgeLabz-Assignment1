package JavaString_Extra;
import java.util.Scanner;
import java.util.HashSet;
public class Q4 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        StringBuilder sb = new StringBuilder();
        HashSet<Character> set = new HashSet<>();

        for (char c : str.toCharArray()) {
            if (!set.contains(c)) {
                set.add(c);
                sb.append(c);
            }
        }

        System.out.println("Modified String: " + sb.toString());
        sc.close();
    }

}

package JavaString_Extra;
import java.util.Scanner;
public class Q8 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();

        int result = s1.compareTo(s2);

        if (result == 0)
            System.out.println("Both strings are equal.");
        else if (result < 0)
            System.out.println(s1 + " comes before " + s2);
        else
            System.out.println(s1 + " comes after " + s2);
        sc.close();
    }

}

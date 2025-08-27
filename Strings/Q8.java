package Strings;
import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        String result = str.replace(" ", "-");
        System.out.println("Modified string: " + result);
    }
}

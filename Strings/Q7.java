package Strings;
import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        String[] words = str.trim().split("\\s+");
        System.out.println("Number of words: " + words.length);
    }
}

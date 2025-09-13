package Strings.Level1;
import java.util.Scanner;
public class Q8 {
	public static void generateException(String[] names) {
        System.out.println(names[names.length]); // out of bounds
    }

    public static void handleException(String[] names) {
        try {
            System.out.println(names[names.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Handled Exception: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = {"Alice", "Bob", "Charlie"};
       
        handleException(names);
        sc.close();
    }

}

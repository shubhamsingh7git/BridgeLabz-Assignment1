package Strings.Level1;
import java.util.Scanner;
public class Q5 {
	 public static void generateException(String text) {
	        System.out.println(text.charAt(text.length()));
	    }

	    public static void handleException(String text) {
	        try {
	            System.out.println(text.charAt(text.length()));
	        } catch (StringIndexOutOfBoundsException e) {
	            System.out.println("Handled Exception: " + e);
	        }
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter text: ");
	        String text = sc.next();
	     
	        handleException(text);
	        sc.close();
	    }

}

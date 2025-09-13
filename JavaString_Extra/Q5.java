package JavaString_Extra;
import java.util.Scanner;
public class Q5 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        String[] words = sentence.split("\\s+");
        String longest = "";

        for (String word : words) {
            if (word.length() > longest.length()) longest = word;
        }

        System.out.println("Longest Word: " + longest);
        sc.close();
    }

}

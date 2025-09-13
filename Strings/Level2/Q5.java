package Strings.Level2;
import java.util.*;

public class Q5 {
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return (c=='a' || c=='e' || c=='i' || c=='o' || c=='u');
    }

    public static int[] countVowelsConsonants(String str) {
        int vowels=0, consonants=0;
        for (int i=0; i<str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isLetter(c)) {
                if (isVowel(c)) vowels++;
                else consonants++;
            }
        }
        return new int[]{vowels, consonants};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();
        int[] counts = countVowelsConsonants(text);
        System.out.println("Vowels: " + counts[0]);
        System.out.println("Consonants: " + counts[1]);
        sc.close();
    }
}

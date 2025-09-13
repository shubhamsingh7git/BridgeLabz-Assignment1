package JavaString_Extra;
import java.util.Scanner;
import java.util.Arrays;
public class Q11 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s1 = sc.nextLine().replaceAll("\\s+", "").toLowerCase();

        System.out.print("Enter second string: ");
        String s2 = sc.nextLine().replaceAll("\\s+", "").toLowerCase();

        if (s1.length() != s2.length()) {
            System.out.println("Not Anagrams");
            sc.close();
            return;
            
        }

        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (Arrays.equals(arr1, arr2))
            System.out.println("Strings are Anagrams");
        else
            System.out.println("Not Anagrams");
        
    }

}

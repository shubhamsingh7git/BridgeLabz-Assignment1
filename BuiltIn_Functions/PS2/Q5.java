package BuiltIn_Functions.PS2;
import java.util.*;

public class Q5 {
    public static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        System.out.println(s + (isPalindrome(s) ? " is a Palindrome" : " is not a Palindrome"));
        sc.close();
    }
}

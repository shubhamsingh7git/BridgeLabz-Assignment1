package Strings;
import java.util.*;
public class Q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str=sc.next();
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 32); 
            }

            result += ch;
        }

        System.out.println("Original: " + str);
        System.out.println("Uppercase: " + result);
        sc.close();
    }
}

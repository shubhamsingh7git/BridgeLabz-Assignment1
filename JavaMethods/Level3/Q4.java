package JavaMethods.Level3;

public class Q4 {
	public static int[] storeDigits(int n) {
        String s = String.valueOf(n);
        int[] digits = new int[s.length()];
        for (int i = 0; i < s.length(); i++) digits[i] = s.charAt(i) - '0';
        return digits;
    }

    public static int[] reverseDigits(int n) {
        int[] digits = storeDigits(n);
        int[] rev = new int[digits.length];
        for (int i = 0; i < digits.length; i++) rev[i] = digits[digits.length - 1 - i];
        return rev;
    }

    public static boolean compareArrays(int[] a, int[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) if (a[i] != b[i]) return false;
        return true;
    }

    public static boolean isPalindrome(int n) {
        return compareArrays(storeDigits(n), reverseDigits(n));
    }

    public static boolean isDuckNumber(int n) {
        return storeDigits(n)[0] != 0;
    }

    public static void main(String[] args) {
        int number = 121;
        System.out.println("Digits: " + java.util.Arrays.toString(storeDigits(number)));
        System.out.println("Reversed: " + java.util.Arrays.toString(reverseDigits(number)));
        System.out.println("Is Palindrome: " + isPalindrome(number));
        System.out.println("Is Duck Number: " + isDuckNumber(number));
    }

}

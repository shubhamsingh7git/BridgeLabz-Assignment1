package Java_Class_And_Objects.Level2;

public class Q8 {

    public static class PalindromeChecker {

        String text;

        PalindromeChecker(String text) {
            this.text = text;
        }

        boolean isPalindrome() {
            String cleanText = text.replaceAll("[^a-z0-9]", "").toLowerCase();

            int left = 0;
            int right = cleanText.length() - 1;

            while (left < right) {
                if (cleanText.charAt(left) != cleanText.charAt(right)) {
                    return false;
                }
                left++;
                right--;
            }
            return true;
        }

        void display() {
            if (isPalindrome()) {
                System.out.println( text + " is a Palindrome.");
            } else {
                System.out.println(text + " is NOT a Palindrome.");
            }
        }
    }

    public static void main(String[] args) {
        PalindromeChecker p1 = new PalindromeChecker("madam");
        PalindromeChecker p2 = new PalindromeChecker("hello");
        PalindromeChecker p3 = new PalindromeChecker("Race car");

        p1.display();
        p2.display();
        p3.display();
    }
}
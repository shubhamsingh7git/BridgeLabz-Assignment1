package Strings.Level1;
public class Q4 {
    static void generateException() {
        String text = null;
        System.out.println(text.length());
    }
    static void handleException() {
        String text = null;
        try {
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException! Cannot access methods of null object.");
        }
    }

    public static void main(String[] args) {
        System.out.println("Generating NullPointerException:");

        System.out.println("\nHandling NullPointerException:");
        handleException();
    }
}

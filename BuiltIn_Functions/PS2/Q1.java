package BuiltIn_Functions.PS2;
import java.util.*;

public class Q1 {
    static Random rand = new Random();

    public static int generateGuess(int low, int high) {
        return rand.nextInt(high - low + 1) + low;
    }

    public static String getUserFeedback(Scanner sc, int guess) {
        System.out.print("Is " + guess + " your number? (high/low/correct): ");
        return sc.nextLine().toLowerCase();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int low = 1, high = 100, guess;
        String feedback;

        while (true) {
            guess = generateGuess(low, high);
            feedback = getUserFeedback(sc, guess);

            if (feedback.equals("correct")) {
                System.out.println("Yay! The computer guessed it right: " + guess);
                break;
            } else if (feedback.equals("low")) {
                low = guess + 1;
            } else if (feedback.equals("high")) {
                high = guess - 1;
            } else {
                System.out.println("Please enter 'high', 'low', or 'correct'.");
            }
        }
        sc.close();
    }
}

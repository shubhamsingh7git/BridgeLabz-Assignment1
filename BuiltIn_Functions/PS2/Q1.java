package BuiltIn_Functions.PS2;
import java.util.Random;
import java.util.Scanner;

public class Q1 {
    public static int generateGuess(int low, int high) {
        Random rand = new Random();
        return rand.nextInt(high - low + 1) + low; 
    }
    public static String getUserFeedback(Scanner sc, int guess) {
        System.out.print("Is " + guess + " correct, high, or low? (enter 'correct', 'high', or 'low'): ");
        return sc.nextLine().toLowerCase();
    }
    public static void playGame() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Think of a number between 1 and 100, and I will try to guess it!");
        int low = 1, high = 100;
        int guess;
        String feedback;

        while (true) {
            guess = generateGuess(low, high);  
            feedback = getUserFeedback(sc, guess);

            if (feedback.equals("correct")) {
                System.out.println("Yay! I guessed your number: " + guess);
                break;
            } else if (feedback.equals("high")) {
                high = guess - 1; 
            } else if (feedback.equals("low")) {
                low = guess + 1; 
            } else {
                System.out.println("Invalid input! Please enter 'correct', 'high', or 'low'.");
            }

            
            if (low > high) {
                System.out.println("Your hints are inconsistent. Please restart the game.");
                break;
            }
        }
        sc.close();
    }

    public static void main(String[] args) {
        playGame();
    }
}

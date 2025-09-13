package Strings.Level2;
import java.util.Scanner;

public class Q9 {
    static String getComputerChoice() {
        int choice = (int) (Math.random() * 3); 
        if (choice == 0) return "rock";
        else if (choice == 1) return "paper";
        else return "scissors";
    }
    static String findWinner(String userChoice, String compChoice) {
        if (userChoice.equals(compChoice)) {
            return "Draw";
        } else if ((userChoice.equals("rock") && compChoice.equals("scissors")) ||
                   (userChoice.equals("paper") && compChoice.equals("rock")) ||
                   (userChoice.equals("scissors") && compChoice.equals("paper"))) {
            return "User";
        } else {
            return "Computer";
        }
    }
    static String[][] calculateStats(int userWins, int compWins, int totalGames) {
        String[][] stats = new String[2][3];
        
        stats[0][0] = "User";
        stats[0][1] = String.valueOf(userWins);
        stats[0][2] = String.format("%.2f", (userWins * 100.0 / totalGames));

        stats[1][0] = "Computer";
        stats[1][1] = String.valueOf(compWins);
        stats[1][2] = String.format("%.2f", (compWins * 100.0 / totalGames));

        return stats;
    }
    static void displayResults(String[][] gameResults, String[][] stats) {
        System.out.println("\n ");
        System.out.printf("%-8s | %-10s | %-10s | %-10s%n", "Game", "User", "Computer", "Winner");
        System.out.println(" ");

        for (int i = 0; i < gameResults.length; i++) {
            System.out.printf("%-8d | %-10s | %-10s | %-10s%n",
                    (i + 1),
                    gameResults[i][0],
                    gameResults[i][1],
                    gameResults[i][2]);
        }

        System.out.println(" ");
        System.out.println("\nStats:");
        System.out.printf("%-10s | %-10s | %-10s%n", "Player", "Wins", "Win %");
        System.out.println(" ");

        for (String[] row : stats) {
            System.out.printf("%-10s | %-10s | %-10s%n", row[0], row[1], row[2]);
        }
        System.out.println(" ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of games to play: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        String[][] gameResults = new String[n][3];
        int userWins = 0, compWins = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("\nEnter your choice (rock/paper/scissors): ");
            String userChoice = sc.nextLine().toLowerCase();

            String compChoice = getComputerChoice();
            String winner = findWinner(userChoice, compChoice);

            if (winner.equals("User")) userWins++;
            else if (winner.equals("Computer")) compWins++;

            gameResults[i][0] = userChoice;
            gameResults[i][1] = compChoice;
            gameResults[i][2] = winner;
        }
        String[][] stats = calculateStats(userWins, compWins, n);
        displayResults(gameResults, stats);

        sc.close();
    }
}

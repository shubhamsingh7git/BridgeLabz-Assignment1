package Strings.Level2;
import java.util.*;

public class Q9 {
    public static String computerChoice() {
        String[] choices = {"rock","paper","scissors"};
        return choices[(int)(Math.random()*3)];
    }

    public static String winner(String user, String comp) {
        if (user.equals(comp)) return "Draw";
        if ((user.equals("rock") && comp.equals("scissors")) ||
            (user.equals("paper") && comp.equals("rock")) ||
            (user.equals("scissors") && comp.equals("paper"))) return "User";
        return "Computer";
    }

    public static String[][] gameStats(String[][] results) {
        int userWins=0, compWins=0, draws=0;
        for (String[] r : results) {
            if (r[2].equals("User")) userWins++;
            else if (r[2].equals("Computer")) compWins++;
            else draws++;
        }
        double total = results.length;
        String[][] stats = {
            {"User Wins", String.valueOf(userWins), String.format("%.2f%%", userWins*100/total)},
            {"Computer Wins", String.valueOf(compWins), String.format("%.2f%%", compWins*100/total)},
            {"Draws", String.valueOf(draws), String.format("%.2f%%", draws*100/total)}
        };
        return stats;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of games: ");
        int n = sc.nextInt();
        String[][] results = new String[n][3];
        for (int i=0; i<n; i++) {
            System.out.print("Game "+(i+1)+" - Enter rock, paper, or scissors: ");
            String user = sc.next().toLowerCase();
            String comp = computerChoice();
            String win = winner(user, comp);
            results[i][0] = user; results[i][1] = comp; results[i][2] = win;
        }
        System.out.println("User\tComputer\tWinner");
        for (String[] r : results) System.out.println(r[0]+"\t"+r[1]+"\t"+r[2]);
        System.out.println("\nStats:");
        String[][] stats = gameStats(results);
        for (String[] s : stats) System.out.println(s[0]+"\t"+s[1]+"\t"+s[2]);
        sc.close();
    }
}

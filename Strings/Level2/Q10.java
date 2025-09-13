package Strings.Level2;
import java.util.Random;

public class Q10 {

    public static int[][] generateScores(int numStudents) {
        Random rand = new Random();
        int[][] scores = new int[numStudents][3];
        for (int i = 0; i < numStudents; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = rand.nextInt(41) + 60;
            }
        }
        return scores;
    }

    public static double[][] calculateStats(int[][] scores) {
        int numStudents = scores.length;
        double[][] stats = new double[numStudents][3];
        for (int i = 0; i < numStudents; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;
            stats[i][0] = total;
            stats[i][1] = Math.round(average * 100.0) / 100.0;
            stats[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return stats;
    }

    public static char[] calculateGrades(double[][] stats) {
        int numStudents = stats.length;
        char[] grades = new char[numStudents];
        for (int i = 0; i < numStudents; i++) {
            double percentage = stats[i][2];
            if (percentage >= 80) grades[i] = 'A';
            else if (percentage >= 70) grades[i] = 'B';
            else if (percentage >= 50) grades[i] = 'C';
            else if (percentage >= 35) grades[i] = 'D';
            else grades[i] = 'R';
        }
        return grades;
    }

    public static void displayScorecard(int[][] scores, double[][] stats, char[] grades) {
        System.out.printf("%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s\n", "Student", "Physics", "Chemistry", "Math", "Total", "Average", "Percent", "Grade");
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%-10d%-10d%-10d%-10d%-10.0f%-10.2f%-10.2f%-10c\n",
                    i + 1,
                    scores[i][0],
                    scores[i][1],
                    scores[i][2],
                    stats[i][0],
                    stats[i][1],
                    stats[i][2],
                    grades[i]);
        }
    }

    public static void main(String[] args) {
        int numStudents = 5;
        int[][] scores = generateScores(numStudents);
        double[][] stats = calculateStats(scores);
        char[] grades = calculateGrades(stats);
        displayScorecard(scores, stats, grades);
    }
}
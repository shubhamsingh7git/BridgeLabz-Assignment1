package Strings.Level2;
import java.util.Scanner;

public class Q10{
    static int[][] generateScores(int n) {
        int[][] scores = new int[n][3];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = (int) (Math.random() * 41) + 60; 
            }
        }
        return scores;
    }
    static double[][] calculateResults(int[][] scores) {
        int n = scores.length;
        double[][] results = new double[n][3]; 

        for (int i = 0; i < n; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100.0;

            results[i][0] = total;
            results[i][1] = Math.round(average * 100.0) / 100.0;
            results[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return results;
    }
    static String[] calculateGrades(double[][] results) {
        int n = results.length;
        String[] grades = new String[n];

        for (int i = 0; i < n; i++) {
            double percentage = results[i][2];
            if (percentage >= 80) grades[i] = "A";
            else if (percentage >= 70) grades[i] = "B";
            else if (percentage >= 60) grades[i] = "C";
            else if (percentage >= 50) grades[i] = "D";
            else if (percentage >= 40) grades[i] = "E";
            else grades[i] = "R";
        }
        return grades;
    }
    static void displayResults(int[][] scores, double[][] results, String[] grades) {
        System.out.println(" ");
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-12s %-12s %-10s%n",
                "Student", "Physics", "Chemistry", "Maths", "Total", "Average", "Percentage", "Grade");
        System.out.println(" ");

        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%-10d %-10d %-10d %-10d %-10.0f %-12.2f %-12.2f %-10s%n",
                    (i + 1),
                    scores[i][0], scores[i][1], scores[i][2],
                    results[i][0], results[i][1], results[i][2],
                    grades[i]);
        }
        System.out.println(" ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] scores = generateScores(n);
        double[][] results = calculateResults(scores);
        String[] grades = calculateGrades(results);

        displayResults(scores, results, grades);

        sc.close();
    }
}

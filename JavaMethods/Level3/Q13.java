package JavaMethods.Level3;
import java.util.Random;

public class Q13 {

    public static double[][] generateScores(int numStudents) {
        double[][] scores = new double[numStudents][3];
        Random rand = new Random();
        for (int i = 0; i < numStudents; i++) {
            scores[i][0] = rand.nextInt(41) + 60; 
            scores[i][1] = rand.nextInt(41) + 60; 
            scores[i][2] = rand.nextInt(41) + 60; 
        }
        return scores;
    }

    public static double[][] calculateResults(double[][] scores) {
        int numStudents = scores.length;
        double[][] results = new double[numStudents][3]; 
        for (int i = 0; i < numStudents; i++) {
            double total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100.0;
            results[i][0] = Math.round(total * 100.0) / 100.0;
            results[i][1] = Math.round(average * 100.0) / 100.0;
            results[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return results;
    }

    public static void displayScorecard(double[][] scores, double[][] results) {
        System.out.println("Student\tPhysics\tChemistry\tMath\tTotal\tAverage\tPercentage");
        for (int i = 0; i < scores.length; i++) {
            System.out.print((i + 1) + "\t");
            System.out.print(scores[i][0] + "\t");
            System.out.print(scores[i][1] + "\t\t");
            System.out.print(scores[i][2] + "\t");
            System.out.print(results[i][0] + "\t");
            System.out.print(results[i][1] + "\t");
            System.out.println(results[i][2]);
        }
    }

    public static void main(String[] args) {
        int numStudents = 10;
        double[][] scores = generateScores(numStudents);
        double[][] results = calculateResults(scores);
        displayScorecard(scores, results);
    }
}
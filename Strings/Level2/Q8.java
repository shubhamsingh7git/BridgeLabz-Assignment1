package Strings.Level2;
import java.util.Random;
import java.util.Scanner;

public class Q8 {
    static int[] generateAges(int n) {
        Random rand = new Random();
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            ages[i] = 10 + rand.nextInt(90);
        }
        return ages;
    }
    static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);

            if (ages[i] < 0) {
                result[i][1] = "false"; 
            } else if (ages[i] >= 18) {
                result[i][1] = "true";  
            } else {
                result[i][1] = "false"; 
            }
        }
        return result;
    }
    static void displayTable(String[][] data) {
        System.out.println("\n ");
        System.out.printf("%-10s | %-10s%n", "Age", "Can Vote?");
        System.out.println(" ");
        for (String[] row : data) {
            System.out.printf("%-10s | %-10s%n", row[0], row[1]);
        }
        System.out.println(" ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        int[] ages = generateAges(n);
        String[][] results = checkVotingEligibility(ages);
        displayTable(results);

        sc.close();
    }
}

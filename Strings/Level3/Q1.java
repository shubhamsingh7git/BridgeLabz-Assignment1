package Strings.Level3;
import java.util.Scanner;

public class Q1 {

    public static String[][] calculateBMI(double[][] data) {
        String[][] result = new String[10][4];
        for (int i = 0; i < 10; i++) {
            double weight = data[i][0];
            double heightCm = data[i][1];
            double heightM = heightCm / 100.0;
            double bmi = weight / (heightM * heightM);
            String status;
            if (bmi < 18.5) {
                status = "Underweight";
            } else if (bmi < 25) {
                status = "Normal";
            } else if (bmi < 30) {
                status = "Overweight";
            } else {
                status = "Obese";
            }
            result[i][0] = String.format("%.2f", heightCm);
            result[i][1] = String.format("%.2f", weight);
            result[i][2] = String.format("%.2f", bmi);
            result[i][3] = status;
        }
        return result;
    }

    public static void displayResults(String[][] results) {
        System.out.printf("%-10s %-10s %-10s %-15s%n", "Height(cm)", "Weight(kg)", "BMI", "Status");
        System.out.println(" ");
        for (int i = 0; i < results.length; i++) {
            System.out.printf("%-10s %-10s %-10s %-15s%n",
                    results[i][0], results[i][1], results[i][2], results[i][3]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] data = new double[10][2];
        System.out.println("Enter weight (kg) and height (cm) for 10 persons:");
        for (int i = 0; i < 10; i++) {
            System.out.printf("Person %d:%n", i + 1);
            System.out.print("Weight (kg): ");
            data[i][0] = scanner.nextDouble();
            System.out.print("Height (cm): ");
            data[i][1] = scanner.nextDouble();
        }
        String[][] results = calculateBMI(data);
        displayResults(results);
        scanner.close();
    }
}
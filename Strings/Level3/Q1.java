package Strings.Level3;
import java.util.Scanner;

public class Q1 {
    public static String[][] calculateBMI(double[][] personData) {
        String[][] result = new String[personData.length][4];

        for (int i = 0; i < personData.length; i++) {
            double weight = personData[i][0];   
            double heightCm = personData[i][1]; 
            double heightM = heightCm / 100.0;  
            double bmi = weight / (heightM * heightM);
            String status;

            if (bmi <= 18.4) {
                status = "Underweight";
            } else if (bmi <= 24.9) {
                status = "Normal";
            } else if (bmi <= 39.9) {
                status = "Overweight";
            } else {
                status = "Obese";
            }
            result[i][0] = String.format("%.1f", heightCm);
            result[i][1] = String.format("%.1f", weight);
            result[i][2] = String.format("%.2f", bmi);
            result[i][3] = status;
        }

        return result;
    }
    public static void displayResult(String[][] data) {
        System.out.printf("%-10s %-10s %-10s %-15s\n", "Height(cm)", "Weight(kg)", "BMI", "Status");
        System.out.println(" ");

        for (int i = 0; i < data.length; i++) {
            System.out.printf("%-10s %-10s %-10s %-15s\n", 
                               data[i][0], data[i][1], data[i][2], data[i][3]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[][] personData = new double[10][2]; 

        System.out.println("Enter weight (kg) and height (cm) for 10 persons:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Person " + (i + 1) + " - Weight (kg): ");
            personData[i][0] = sc.nextDouble();

            System.out.print("Person " + (i + 1) + " - Height (cm): ");
            personData[i][1] = sc.nextDouble();
        }
        String[][] result = calculateBMI(personData);

        System.out.println("\nBMI Report of Team Members:");
        displayResult(result);

        sc.close();
    }
}

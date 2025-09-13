package JavaMethods.Level2;
import java.util.Scanner;
public class Q10 {
	public static void calculateBMI(double[][] personData) {
        for (int i = 0; i < personData.length; i++) {
            double weight = personData[i][0]; 
            double heightCm = personData[i][1];
            double heightM = heightCm / 100; 
            double bmi = weight / (heightM * heightM);
            personData[i][2] = bmi; 
        }
    }
    public static String[] determineBMIStatus(double[][] personData) {
        String[] status = new String[personData.length];
        for (int i = 0; i < personData.length; i++) {
            double bmi = personData[i][2];
            if (bmi <= 18.4) status[i] = "Underweight";
            else if (bmi <= 24.9) status[i] = "Normal";
            else if (bmi <= 39.9) status[i] = "Overweight";
            else status[i] = "Obese";
        }
        return status;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfPersons = 10;
        double[][] personData = new double[numberOfPersons][3]; 
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            personData[i][0] = sc.nextDouble();
            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            personData[i][1] = sc.nextDouble();
        }

       
        calculateBMI(personData);
        String[] status = determineBMIStatus(personData);

        System.out.println("\nPerson\tWeight(kg)\tHeight(cm)\tBMI\t\tStatus");
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.printf("%d\t%.2f\t\t%.2f\t\t%.2f\t%s\n", 
                i + 1, personData[i][0], personData[i][1], personData[i][2], status[i]);
        }

        sc.close();
    }

}

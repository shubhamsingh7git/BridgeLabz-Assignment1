package Arrays.Level2;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int EMPLOYEES = 10;

        double[] salary = new double[EMPLOYEES];
        double[] yearsOfService = new double[EMPLOYEES];
        double[] bonus = new double[EMPLOYEES];
        double[] newSalary = new double[EMPLOYEES];

        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        for (int i = 0; i < EMPLOYEES; i++) {
            System.out.println("Employee " + (i + 1) + ":");
            System.out.print("Enter salary: ");
            double inputSalary = sc.nextDouble();
            if (inputSalary <= 0) {
                System.out.println("Invalid salary. Please enter again.");
                i--; 
                continue;
            }
            System.out.print("Enter years of service: ");
            double inputYears = sc.nextDouble();
            if (inputYears < 0) {
                System.out.println("Invalid years of service. Please enter again.");
                i--; 
                continue;
            }

            salary[i] = inputSalary;
            yearsOfService[i] = inputYears;
        }
        for (int i = 0; i < EMPLOYEES; i++) {
            double bonusPercentage = (yearsOfService[i] > 5) ? 0.05 : 0.02;
            bonus[i] = salary[i] * bonusPercentage;
            newSalary[i] = salary[i] + bonus[i];
            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }
        System.out.println("\nEmployee Bonus Details:");
        for (int i = 0; i < EMPLOYEES; i++) {
            System.out.printf("Employee %d: Old Salary = %.2f, Bonus = %.2f, New Salary = %.2f%n",
                    i + 1, salary[i], bonus[i], newSalary[i]);
        }

        System.out.printf("%nTotal Bonus Payout = %.2f%n", totalBonus);
        System.out.printf("Total Old Salary = %.2f%n", totalOldSalary);
        System.out.printf("Total New Salary = %.2f%n", totalNewSalary);

        sc.close();
    }
}

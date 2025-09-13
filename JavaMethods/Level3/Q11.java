package JavaMethods.Level3;

public class Q11 {
	public static int[][] generateEmployeeData() {
        int[][] data = new int[10][2]; 
        for (int i = 0; i < 10; i++) {
            data[i][0] = 10000 + (int)(Math.random() * 90000); 
            data[i][1] = 1 + (int)(Math.random() * 10); 
        }
        return data;
    }
    public static double[][] calculateBonus(int[][] employeeData) {
        double[][] result = new double[10][2]; 
        for (int i = 0; i < 10; i++) {
            int salary = employeeData[i][0];
            int years = employeeData[i][1];
            double bonus = (years > 5) ? salary * 0.05 : salary * 0.02;
            double newSalary = salary + bonus;
            result[i][0] = newSalary;
            result[i][1] = bonus;
        }
        return result;
    }
    public static void displayResults(int[][] employeeData, double[][] bonusData) {
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;

        System.out.println("EmpID  OldSalary  Years  Bonus     NewSalary");
        for (int i = 0; i < 10; i++) {
            totalOldSalary += employeeData[i][0];
            totalNewSalary += bonusData[i][0];
            totalBonus += bonusData[i][1];
            System.out.printf("%5d  %9d  %5d  %7.2f  %9.2f\n", 
                i+1, employeeData[i][0], employeeData[i][1], bonusData[i][1], bonusData[i][0]);
        }
        System.out.println(" ");
        System.out.printf("Total  %9.2f        %7.2f  %9.2f\n", totalOldSalary, totalBonus, totalNewSalary);
    }

    public static void main(String[] args) {
        int[][] employees = generateEmployeeData();
        double[][] bonuses = calculateBonus(employees);
        displayResults(employees, bonuses);
    }

}

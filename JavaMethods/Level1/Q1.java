package JavaMethods.Level1;
import java.util.Scanner;

public class Q1 {
    public static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principal amount: ");
        double principal = sc.nextDouble();

        System.out.print("Enter Rate of Interest (in %): ");
        double rate = sc.nextDouble();

        System.out.print("Enter Time period (in years): ");
        double time = sc.nextDouble();
        double simpleInterest = calculateSimpleInterest(principal, rate, time);

        System.out.println("The Simple Interest is " + simpleInterest +
                " for Principal " + principal + ", Rate of Interest " + rate + " and Time " + time);
        
        sc.close();
    }
}

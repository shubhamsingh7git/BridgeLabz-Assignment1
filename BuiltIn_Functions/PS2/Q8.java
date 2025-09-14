package BuiltIn_Functions.PS2;
import java.util.*;

public class Q8 {
    public static double cToF(double c) {
        return (c * 9 / 5) + 32;
    }

    public static double fToC(double f) {
        return (f - 32) * 5 / 9;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature: ");
        double temp = sc.nextDouble();
        System.out.print("Convert to (C/F): ");
        char choice = sc.next().charAt(0);

        if (choice == 'C' || choice == 'c')
            System.out.println("Converted: " + fToC(temp) + "°C");
        else if (choice == 'F' || choice == 'f')
            System.out.println("Converted: " + cToF(temp) + "°F");
        else
            System.out.println("Invalid choice!");
        sc.close();
    }
}

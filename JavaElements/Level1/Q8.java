package JavaElements.Level1;
import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        double km, miles;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter distance in kilometers: ");
        km = sc.nextDouble();
        miles = km / 1.6;
        System.out.println("The total miles is " + miles + " mile for the given " + km + " km");
        sc.close();
    }
}

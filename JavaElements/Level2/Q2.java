package JavaElements.Level2;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base of the triangle in cm: ");
        double baseCm = sc.nextDouble();
        System.out.print("Enter height of the triangle in cm: ");
        double heightCm = sc.nextDouble();

        double areaCm2 = 0.5 * baseCm * heightCm;
        double areaIn2 = areaCm2 / 6.4516;
        System.out.println("The Area of the triangle in sq in is " + areaIn2 +
                           " and sq cm is " + areaCm2);

        sc.close();
    }
}

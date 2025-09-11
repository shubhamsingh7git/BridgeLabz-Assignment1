package JavaElements.Level1;
import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter distance in feet: ");
        double distanceFeet = input.nextDouble();

        double distanceYards = distanceFeet / 3.0;

        double distanceMiles = distanceYards / 1760.0;

        System.out.println("The distance of " + distanceFeet + " feet is " + distanceYards +
                           " yards and " + distanceMiles + " miles.");

        input.close();
    }
}

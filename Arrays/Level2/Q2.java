package Arrays.Level2;
import java.util.Scanner;

public class Q2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] friends = {"Amar", "Akbar", "Anthony"};
        double[] age = new double[3];
        double[] height = new double[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + friends[i] + ": ");
            age[i] = sc.nextDouble();
            System.out.print("Enter height of " + friends[i] + " in cm: ");
            height[i] = sc.nextDouble();
        }
        double minAge = age[0];
        int youngestIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (age[i] < minAge) {
                minAge = age[i];
                youngestIndex = i;
            }
        }
        double maxHeight = height[0];
        int tallestIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (height[i] > maxHeight) {
                maxHeight = height[i];
                tallestIndex = i;
            }
        }
        System.out.println("\nThe youngest friend is: " + friends[youngestIndex] + " (Age: " + minAge + ")");
        System.out.println("The tallest friend is: " + friends[tallestIndex] + " (Height: " + maxHeight + " cm)");

        sc.close();
    }
}

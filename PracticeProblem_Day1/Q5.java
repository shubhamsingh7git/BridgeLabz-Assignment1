package PracticeProblem_Day1;
import java.util.Scanner;
public class Q5 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of cylinder: ");
        double radius = sc.nextDouble();
        System.out.print("Enter height of cylinder: ");
        double height = sc.nextDouble();
        double volume = Math.PI * radius * radius * height;
        System.out.println("Volume of the cylinder: " + volume);
        sc.close();
    }

}

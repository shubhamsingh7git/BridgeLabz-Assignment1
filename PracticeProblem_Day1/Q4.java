package PracticeProblem_Day1;
import java.util.Scanner;

public class Q4 {


public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter radius of circle: ");
    double radius = sc.nextDouble();
    double area = Math.PI * radius * radius;
    System.out.println("Area of the circle: " + area);
    sc.close();
}
}
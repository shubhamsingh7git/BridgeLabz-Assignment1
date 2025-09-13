package JavaMethods.Level2;
import java.util.Scanner;
public class Q8 {
	public static int findYoungest(int[] ages) {
        int min = ages[0];
        for (int a : ages) if (a < min) min = a;
        return min;
    }

    public static double findTallest(double[] heights) {
        double max = heights[0];
        for (double h : heights) if (h > max) max = h;
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[3];
        double[] heights = new double[3];
        String[] names = {"Amar", "Akbar", "Anthony"};

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            ages[i] = sc.nextInt();
            System.out.print("Enter height of " + names[i] + ": ");
            heights[i] = sc.nextDouble();
        }

        System.out.println("Youngest age: " + findYoungest(ages));
        System.out.println("Tallest height: " + findTallest(heights));

        sc.close();
    }

}

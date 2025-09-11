package JavaElements.Level1;
import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the course fee (INR): ");
        int fee = sc.nextInt();

        System.out.print("Enter the discount percentage: ");
        int discountPercent = sc.nextInt();

        int discount = (fee * discountPercent) / 100;

        int finalFee = fee - discount;

        System.out.println("The discount amount is INR " + discount +
                           " and final discounted fee is INR " + finalFee);

        sc.close();
    }
}

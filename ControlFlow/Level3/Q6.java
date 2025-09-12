package ControlFlow.Level3;
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();
        number = Math.abs(number);

        if (number == 0) {
            System.out.println("Number of digits: 1");
            sc.close();
            return;
        }
        int count = 0;
        while (number != 0) {
            number = number / 10; 
            count++;              
        }
        System.out.println("Number of digits: " + count);

        sc.close();
    }
}

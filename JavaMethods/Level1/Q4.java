package JavaMethods.Level1;
import java.util.Scanner;
public class Q4 {
	public static int checkNumber(int num) {
        if (num > 0) {
            return 1;   
        } else if (num < 0) {
            return -1;  
        } else {
            return 0;   
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        int result = checkNumber(number);

        if (result == 1) {
            System.out.println(number + " is a positive number.");
        } else if (result == -1) {
            System.out.println(number + " is a negative number.");
        } else {
            System.out.println("The number is zero.");
        }

        sc.close();
    }

}

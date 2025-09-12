package Arrays.Level2;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int maxDigit = 10; 
        int[] digits = new int[maxDigit];
        int index = 0;
        int tempNumber = number;
        while (tempNumber != 0) {
            int lastDigit = tempNumber % 10;
            digits[index] = lastDigit;
            index++;
            if (index == maxDigit) {
                break;
            }
            tempNumber /= 10;
        }
        int largest = 0;
        int secondLargest = 0;

        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }
        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);

        sc.close();
    }
}

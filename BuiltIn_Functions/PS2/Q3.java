package BuiltIn_Functions.PS2;
import java.util.Scanner;

public class Q3{

   
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        if (num == 2) return true;  
        if (num % 2 == 0) return false; 

      
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to check if it's prime: ");
        int number = sc.nextInt();

        if (isPrime(number)) {
            System.out.println(number + " is a Prime Number.");
        } else {
            System.out.println(number + " is not a Prime Number.");
        }

        sc.close();
    }
}

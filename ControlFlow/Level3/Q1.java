package ControlFlow.Level3;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year (>= 1582): ");
        int year = sc.nextInt();

        // Part 1: Using multiple if-else statements
        if (year < 1582) {
            System.out.println("The program works only for years >= 1582 (Gregorian calendar).");
        } else {
            if (year % 400 == 0) {
                System.out.println(year + " is a Leap Year (Checked with if-else).");
            } else if (year % 100 == 0) {
                System.out.println(year + " is NOT a Leap Year (Checked with if-else).");
            } else if (year % 4 == 0) {
                System.out.println(year + " is a Leap Year (Checked with if-else).");
            } else {
                System.out.println(year + " is NOT a Leap Year (Checked with if-else).");
            }
        }

        // Part 2: Using a single if statement with logical conditions
        if (year >= 1582 && ( (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0) )) {
            System.out.println(year + " is a Leap Year (Checked with logical condition).");
        } else if (year >= 1582) {
            System.out.println(year + " is NOT a Leap Year (Checked with logical condition).");
        }

        sc.close();
    }
}

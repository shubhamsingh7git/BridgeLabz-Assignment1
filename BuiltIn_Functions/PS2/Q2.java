package BuiltIn_Functions.PS2;
import java.util.*;

public class Q2 {
    public static int takeInput(Scanner sc, String msg) {
        System.out.print(msg);
        return sc.nextInt();
    }

    public static int findMax(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = takeInput(sc, "Enter first number: ");
        int b = takeInput(sc, "Enter second number: ");
        int c = takeInput(sc, "Enter third number: ");
        System.out.println("Maximum: " + findMax(a, b, c));
        sc.close();
    }
}

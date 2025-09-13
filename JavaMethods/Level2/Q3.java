package JavaMethods.Level2;
import java.util.Scanner;
public class Q3 {
	 public static boolean isLeapYear(int year) {
	        if (year < 1582) return false;
	        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a year: ");
	        int year = sc.nextInt();

	        if (isLeapYear(year)) System.out.println(year + " is a Leap Year");
	        else System.out.println(year + " is not a Leap Year");

	        sc.close();
	    }

}

package Extras_Day8;

import java.util.Scanner;
import java.time.LocalDate;

public class Q4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Date1(yyyy-mm-dd): ");
		String input1=sc.nextLine();
		LocalDate date1=LocalDate.parse(input1);
		
		System.out.println("Enter Date2(yyyy-mm-dd): ");
		String input2=sc.nextLine();
		LocalDate date2=LocalDate.parse(input2);
		
		if(date1.isBefore(date2)) {
			System.out.println("Date1 is before Date2.");
		}
		else if(date1.isAfter(date2)) {
			System.out.println("Date1 is after Date2.");
		}
		else if(date1.isEqual(date2)) {
			System.out.println("Both the dates are same.");
		}
		sc.close();
	}

}

package BuiltIn_Functions.PS1;

import java.util.Scanner;
import java.time.LocalDate;

public class Q2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the date (yyyy-mm-dd) :");
		String input=sc.nextLine();
		
		LocalDate date=LocalDate.parse(input);
		LocalDate addedDays=date.plusDays(7).plusMonths(1).plusYears(2);
		System.out.println("After adding :"+addedDays);
		LocalDate subWeeks=addedDays.minusWeeks(3);
		System.out.println("After subtracting weeks :"+subWeeks);
		
		sc.close();
		
	}

}

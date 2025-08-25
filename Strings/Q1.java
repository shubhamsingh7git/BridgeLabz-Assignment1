package Strings;
import java.util.*;

public class Q1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String1: ");
		String str1=sc.next();
		System.out.println("Enter String2: ");
		String str2=sc.next();
		if(str1.equals(str2)) {
			System.out.println("Equal");
		}
		else {
			System.out.println("Not Equal");
		}
		sc.close();
		
	}

}

package Strings;
import java.util.*;
public class Q4 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String: ");
		String str=sc.next();
		int count=0;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			count=i+1;
			
		}
		System.out.println("Total length: "+count);
	}

}

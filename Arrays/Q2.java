package Arrays;

import java.util.Scanner;

public class Q2 {
	public static void main(String...args) {
		System.out.println("Enter the class capacity :");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int []arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			if(arr[i]<0) {
				System.out.println("Number is negative");
			}
			else if(arr[i]==0) {
				System.out.println("Number is Zero");
			}
			else {
				if(arr[i]%2==0) {
					System.out.println("Number is even positive");
				}
				else {
					System.out.println("Number is odd positve");
				}
			}
		}
		int num1=arr[0];
		int num2=arr[n-1];
		if(num1==num2) {
			System.out.println("They are equal");
		}
		else if(num1>num2) {
			System.out.println("num1 is greater");
		}
		else {
			System.out.println("num2 is greater");
		}
		sc.close();
	}

}

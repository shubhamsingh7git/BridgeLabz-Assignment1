package section_F.Day_1;

import java.util.Scanner;

public class Q9 {
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 3 numbers:");
        double num1=sc.nextDouble();
        double num2=sc.nextDouble();
        double num3=sc.nextDouble();
        double avg=(num1+num2+num3);
        System.out.println("The average is:"+avg);
        sc.close();

    }

}

package section_F.Day_1;
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Principle Amount:");
        int principle=sc.nextInt();
        System.out.println("Enter Rate:");
        int rate=sc.nextInt();
        System.out.println("Enter Time:");
        int time=sc.nextInt();
        int si=(principle*rate*time)/100;
        System.out.println("The interest is:" + si);
        sc.close();
    }
    
}

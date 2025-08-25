package section_F.Day_1;
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter radius:");
        double rad=sc.nextDouble();
        System.out.println("Enter height:");
        double  height=sc.nextDouble();
        double vol=3.14*rad*rad*height;
        System.out.println(vol);
        sc.close();
    }
    
}

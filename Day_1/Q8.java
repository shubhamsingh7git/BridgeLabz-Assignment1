import java.util.*;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter base value:");
        double base=sc.nextDouble();
        System.out.println("Enter exponent value");
        double exp=sc.nextDouble();
        double res=Math.pow(base,exp);
        System.out.println("The result is:"+res);
    }
    
}

import java.util.*;
public class Q7{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Length:");
        double len=sc.nextDouble();
        System.out.println("Enter width:");
        double wid=sc.nextDouble();
        double perimeter=2*(len+wid);
        System.out.println("The perimeter is:"+perimeter);
    }
}
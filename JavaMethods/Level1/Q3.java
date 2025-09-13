package JavaMethods.Level1;
import java.util.Scanner;
public class Q3 {
    public static int calculateRounds(int a,int b,int c){
        int perimeter=a+b+c;
        return (5000/perimeter);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println("Rounds required: "+calculateRounds(a,b,c));
        sc.close();
    }
}

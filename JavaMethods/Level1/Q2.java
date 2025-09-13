package JavaMethods.Level1;
import java.util.Scanner;
public class Q2 {
    public static int calculateHandshakes(int n){
        return (n*(n-1))/2;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Maximum number of handshakes: "+calculateHandshakes(n));
        sc.close();
    }
}

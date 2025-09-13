package JavaMethods.Level2;
import java.util.Scanner;
public class Q1 {
    public static int[] findFactors(int n) {
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0) count++;
        }
        int[] factors=new int[count];
        int idx=0;
        for(int i=1;i<=n;i++){
            if(n%i==0) factors[idx++]=i;
        }
        return factors;
    }
    public static int sumFactors(int[] f){
        int sum=0;
        for(int x:f) sum+=x;
        return sum;
    }
    public static int productFactors(int[] f){
        int prod=1;
        for(int x:f) prod*=x;
        return prod;
    }
    public static int sumSquaresFactors(int[] f){
        int sum=0;
        for(int x:f) sum+=Math.pow(x,2);
        return sum;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] factors=findFactors(n);
        System.out.print("Factors: ");
        for(int x:factors) System.out.print(x+" ");
        System.out.println();
        System.out.println("Sum: "+sumFactors(factors));
        System.out.println("Sum of Squares: "+sumSquaresFactors(factors));
        System.out.println("Product: "+productFactors(factors));
        sc.close();
    }
}

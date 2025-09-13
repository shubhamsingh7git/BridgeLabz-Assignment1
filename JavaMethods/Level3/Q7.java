package JavaMethods.Level3;
import java.util.*;
public class Q7 {
    public static int[] factors(int n){
        int c=0;
        for(int i=1;i<=n;i++) if(n%i==0) c++;
        int[] f=new int[c];int k=0;
        for(int i=1;i<=n;i++) if(n%i==0) f[k++]=i;
        return f;
    }
    public static int greatestFactor(int[] f){return f[f.length-2];}
    public static int sum(int[] f){int s=0;for(int x:f)s+=x;return s;}
    public static int product(int[] f){int p=1;for(int x:f)p*=x;return p;}
    public static double cubeProduct(int[] f){
        double p=1;for(int x:f)p*=Math.pow(x,3);return p;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] f=factors(n);
        System.out.println("Factors: "+Arrays.toString(f));
        System.out.println("Greatest factor: "+greatestFactor(f));
        System.out.println("Sum: "+sum(f));
        System.out.println("Product: "+product(f));
        System.out.println("Cube product: "+cubeProduct(f));
        sc.close();
    }
}

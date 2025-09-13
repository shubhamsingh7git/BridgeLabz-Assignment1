package JavaMethods.Level3;
import java.util.*;
public class Q6 {
    public static int sumDivisors(int n){
        int s=1;
        for(int i=2;i<=n/2;i++) if(n%i==0) s+=i;
        return n==1?0:s;
    }
    public static boolean isPerfect(int n){
        return sumDivisors(n)==n;
    }
    public static boolean isAbundant(int n){
        return sumDivisors(n)>n;
    }
    public static boolean isDeficient(int n){
        return sumDivisors(n)<n;
    }
    public static int fact(int x){
        int f=1;for(int i=1;i<=x;i++) f*=i;return f;
    }
    public static boolean isStrong(int n){
        int sum=0,tmp=n;
        while(tmp>0){sum+=fact(tmp%10);tmp/=10;}
        return sum==n;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Perfect: "+isPerfect(n));
        System.out.println("Abundant: "+isAbundant(n));
        System.out.println("Deficient: "+isDeficient(n));
        System.out.println("Strong: "+isStrong(n));
        sc.close();
    }
}

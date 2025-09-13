package JavaMethods.Level3;
import java.util.*;
public class Q2 {
    public static int countDigits(int n){
        return String.valueOf(n).length();
    }
    public static int[] toDigits(int n){
        String s=String.valueOf(n);
        int[] d=new int[s.length()];
        for(int i=0;i<s.length();i++) d[i]=s.charAt(i)-'0';
        return d;
    }
    public static boolean isDuck(int[] d){
        for(int x:d) if(x==0) return true;
        return false;
    }
    public static boolean isArmstrong(int[] d){
        int p=d.length,sum=0;
        for(int x:d) sum+=Math.pow(x,p);
        int num=0;
        for(int x:d) num=num*10+x;
        return num==sum;
    }
    public static int[] largestAndSecondLargest(int[] d){
        int f=Integer.MIN_VALUE,s=Integer.MIN_VALUE;
        for(int x:d){
            if(x>f){s=f;f=x;}
            else if(x>s && x!=f) s=x;
        }
        return new int[]{f,s};
    }
    public static int[] smallestAndSecondSmallest(int[] d){
        int f=Integer.MAX_VALUE,s=Integer.MAX_VALUE;
        for(int x:d){
            if(x<f){s=f;f=x;}
            else if(x<s && x!=f) s=x;
        }
        return new int[]{f,s};
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] d=toDigits(n);
        System.out.println("Digit count: "+countDigits(n));
        System.out.println("Duck: "+isDuck(d));
        System.out.println("Armstrong: "+isArmstrong(d));
        System.out.println("Largest & 2nd: "+Arrays.toString(largestAndSecondLargest(d)));
        System.out.println("Smallest & 2nd: "+Arrays.toString(smallestAndSecondSmallest(d)));
        sc.close();
    }
}

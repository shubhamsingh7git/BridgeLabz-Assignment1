package JavaMethods.Level3;
import java.util.*;
public class Q3 {
    public static int countDigits(int n){return String.valueOf(n).length();}
    public static int[] toDigits(int n){
        String s=String.valueOf(n);
        int[] d=new int[s.length()];
        for(int i=0;i<s.length();i++) d[i]=s.charAt(i)-'0';
        return d;
    }
    public static int sumDigits(int[] d){
        int s=0;for(int x:d)s+=x;return s;
    }
    public static int sumSquares(int[] d){
        int s=0;for(int x:d)s+=Math.pow(x,2);return s;
    }
    public static boolean isHarshad(int n,int[] d){
        return n%sumDigits(d)==0;
    }
    public static int[][] frequency(int[] d){
        int[][] freq=new int[10][2];
        for(int i=0;i<10;i++) freq[i][0]=i;
        for(int x:d) freq[x][1]++;
        return freq;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] d=toDigits(n);
        System.out.println("Sum digits: "+sumDigits(d));
        System.out.println("Sum squares: "+sumSquares(d));
        System.out.println("Harshad: "+isHarshad(n,d));
        int[][] f=frequency(d);
        for(int[] row:f) if(row[1]>0) System.out.println(row[0]+": "+row[1]);
        sc.close();
    }
}

package JavaMethods.Level3;
import java.util.*;
public class Q1 {
    public static int sum(int[] arr){
        int s=0;
        for(int n:arr) s+=n;
        return s;
    }
    public static double mean(int[] arr){
        return sum(arr)/(double)arr.length;
    }
    public static int min(int[] arr){
        int m=arr[0];
        for(int n:arr) if(n<m) m=n;
        return m;
    }
    public static int max(int[] arr){
        int m=arr[0];
        for(int n:arr) if(n>m) m=n;
        return m;
    }
    public static void main(String[] args){
        int[] heights=new int[11];
        for(int i=0;i<heights.length;i++){
            heights[i]=150+(int)(Math.random()*101);
        }
        System.out.println("Heights: "+Arrays.toString(heights));
        System.out.println("Shortest: "+min(heights));
        System.out.println("Tallest: "+max(heights));
        System.out.println("Mean: "+mean(heights));
    }
}

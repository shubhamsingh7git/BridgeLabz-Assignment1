package JavaMethods.Level2;
import java.util.*;
public class Q12 {
    public static int[] generate4DigitRandomArray(int size){
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=1000+(int)(Math.random()*9000);
        }
        return arr;
    }
    public static double[] findAverageMinMax(int[] numbers){
        int min=numbers[0],max=numbers[0],sum=0;
        for(int n:numbers){
            sum+=n;
            min=Math.min(min,n);
            max=Math.max(max,n);
        }
        double avg=sum/(double)numbers.length;
        return new double[]{avg,min,max};
    }
    public static void main(String[] args){
        int[] nums=generate4DigitRandomArray(5);
        System.out.println("Numbers: "+Arrays.toString(nums));
        double[] res=findAverageMinMax(nums);
        System.out.println("Average: "+res[0]);
        System.out.println("Min: "+res[1]);
        System.out.println("Max: "+res[2]);
    }
}

package JavaMethods.Level3;
import java.util.*;
public class Q8 {
    public static int generateOTP(){
        return 100000+(int)(Math.random()*900000);
    }
    public static boolean allUnique(int[] arr){
        Set<Integer> set=new HashSet<>();
        for(int x:arr) set.add(x);
        return set.size()==arr.length;
    }
    public static void main(String[] args){
        int[] otps=new int[10];
        for(int i=0;i<10;i++) otps[i]=generateOTP();
        System.out.println("OTPs: "+Arrays.toString(otps));
        System.out.println("All unique: "+allUnique(otps));
    }
}

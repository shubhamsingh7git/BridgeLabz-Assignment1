package JavaMethods.Level1;
import java.util.Scanner;
public class Q9 {
    public static int[] findRemainderAndQuotient(int chocolates,int children){
        return new int[]{chocolates%children,chocolates/children};
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int chocolates=sc.nextInt();
        int children=sc.nextInt();
        int[] result=findRemainderAndQuotient(chocolates,children);
        System.out.println("Each child gets: "+result[1]+" Remaining: "+result[0]);
        sc.close();
    }
}

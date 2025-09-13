package JavaMethods.Level2;
import java.util.Scanner;
public class Q9 {
    public static boolean isPositive(int n){ return n>=0; }
    public static boolean isEven(int n){ return n%2==0; }
    public static int compare(int a,int b){
        if(a>b) return 1;
        else if(a==b) return 0;
        else return -1;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
            if(isPositive(arr[i])){
                if(isEven(arr[i])) System.out.println(arr[i]+" is Positive Even");
                else System.out.println(arr[i]+" is Positive Odd");
            } else {
                System.out.println(arr[i]+" is Negative");
            }
        }
        int res=compare(arr[0],arr[4]);
        if(res==0) System.out.println("First and Last are Equal");
        else if(res==1) System.out.println("First is Greater");
        else System.out.println("First is Less");
        sc.close();
    }
}

package JavaMethods.Level3;
import java.util.*;
public class Q10 {
    public static boolean collinearSlope(int x1,int y1,int x2,int y2,int x3,int y3){
        double ab=(double)(y2-y1)/(x2-x1);
        double bc=(double)(y3-y2)/(x3-x2);
        double ac=(double)(y3-y1)/(x3-x1);
        return ab==bc && bc==ac;
    }
    public static boolean collinearArea(int x1,int y1,int x2,int y2,int x3,int y3){
        double area=0.5*(x1*(y2-y3)+x2*(y3-y1)+x3*(y1-y2));
        return area==0;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x1=sc.nextInt(),y1=sc.nextInt();
        int x2=sc.nextInt(),y2=sc.nextInt();
        int x3=sc.nextInt(),y3=sc.nextInt();
        System.out.println("Collinear by slope: "+collinearSlope(x1,y1,x2,y2,x3,y3));
        System.out.println("Collinear by area: "+collinearArea(x1,y1,x2,y2,x3,y3));
        sc.close();
    }
}

package JavaMethods.Level3;
import java.util.*;
public class Q14 {
    public static int[][] createMatrix(int rows,int cols){
        int[][] m=new int[rows][cols];
        for(int i=0;i<rows;i++) for(int j=0;j<cols;j++) m[i][j]=(int)(Math.random()*10);
        return m;
    }
    public static int[][] add(int[][] a,int[][] b){
        int[][] res=new int[a.length][a[0].length];
        for(int i=0;i<a.length;i++) for(int j=0;j<a[0].length;j++) res[i][j]=a[i][j]+b[i][j];
        return res;
    }
    public static int[][] subtract(int[][] a,int[][] b){
        int[][] res=new int[a.length][a[0].length];
        for(int i=0;i<a.length;i++) for(int j=0;j<a[0].length;j++) res[i][j]=a[i][j]-b[i][j];
        return res;
    }
    public static int[][] multiply(int[][] a,int[][] b){
        int[][] res=new int[a.length][b[0].length];
        for(int i=0;i<a.length;i++) for(int j=0;j<b[0].length;j++) for(int k=0;k<a[0].length;k++) res[i][j]+=a[i][k]*b[k][j];
        return res;
    }
    public static void display(int[][] m){
        for(int[] row:m){ for(int v:row) System.out.print(v+" "); System.out.println(); }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt(),c=sc.nextInt();
        int[][] a=createMatrix(r,c),b=createMatrix(r,c);
        System.out.println("Matrix A:");display(a);
        System.out.println("Matrix B:");display(b);
        System.out.println("Addition:");display(add(a,b));
        System.out.println("Subtraction:");display(subtract(a,b));
        if(r==c){
            System.out.println("Multiplication:");display(multiply(a,b));
        } else System.out.println("Multiplication not possible unless square matrix");
        sc.close();
    }
}

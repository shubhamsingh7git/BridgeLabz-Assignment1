package JavaMethods.Level3;
import java.util.*;
public class Q15 {
    public static double[][] createMatrix(int rows,int cols){
        double[][] m=new double[rows][cols];
        for(int i=0;i<rows;i++) for(int j=0;j<cols;j++) m[i][j]=(int)(Math.random()*10);
        return m;
    }
    public static double[][] transpose(double[][] m){
        double[][] t=new double[m[0].length][m.length];
        for(int i=0;i<m.length;i++) for(int j=0;j<m[0].length;j++) t[j][i]=m[i][j];
        return t;
    }
    public static double det2x2(double[][] m){
        return m[0][0]*m[1][1]-m[0][1]*m[1][0];
    }
    public static double det3x3(double[][] m){
        return m[0][0]*(m[1][1]*m[2][2]-m[1][2]*m[2][1])-
               m[0][1]*(m[1][0]*m[2][2]-m[1][2]*m[2][0])+
               m[0][2]*(m[1][0]*m[2][1]-m[1][1]*m[2][0]);
    }
    public static double[][] inverse2x2(double[][] m){
        double d=det2x2(m);
        if(d==0) return null;
        double[][] inv={{m[1][1]/d,-m[0][1]/d},{-m[1][0]/d,m[0][0]/d}};
        return inv;
    }
    public static double[][] inverse3x3(double[][] m){
        double d=det3x3(m);
        if(d==0) return null;
        double[][] inv=new double[3][3];
        inv[0][0]=(m[1][1]*m[2][2]-m[1][2]*m[2][1])/d;
        inv[0][1]=(m[0][2]*m[2][1]-m[0][1]*m[2][2])/d;
        inv[0][2]=(m[0][1]*m[1][2]-m[0][2]*m[1][1])/d;
        inv[1][0]=(m[1][2]*m[2][0]-m[1][0]*m[2][2])/d;
        inv[1][1]=(m[0][0]*m[2][2]-m[0][2]*m[2][0])/d;
        inv[1][2]=(m[0][2]*m[1][0]-m[0][0]*m[1][2])/d;
        inv[2][0]=(m[1][0]*m[2][1]-m[1][1]*m[2][0])/d;
        inv[2][1]=(m[0][1]*m[2][0]-m[0][0]*m[2][1])/d;
        inv[2][2]=(m[0][0]*m[1][1]-m[0][1]*m[1][0])/d;
        return inv;
    }
    public static void display(double[][] m){
        if(m==null){System.out.println("Not invertible");return;}
        for(double[] row:m){ for(double v:row) System.out.print(v+" "); System.out.println(); }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double[][] m=createMatrix(n,n);
        System.out.println("Matrix:");display(m);
        System.out.println("Transpose:");display(transpose(m));
        if(n==2){
            System.out.println("Determinant: "+det2x2(m));
            System.out.println("Inverse:");display(inverse2x2(m));
        } else if(n==3){
            System.out.println("Determinant: "+det3x3(m));
            System.out.println("Inverse:");display(inverse3x3(m));
        }
        sc.close();
    }
}

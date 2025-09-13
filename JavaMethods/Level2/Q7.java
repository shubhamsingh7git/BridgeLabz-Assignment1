package JavaMethods.Level2;
import java.util.Scanner;
public class Q7 {
    public static boolean canStudentVote(int age){
        if(age<0) return false;
        return age>=18;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] ages=new int[10];
        for(int i=0;i<10;i++){
            ages[i]=sc.nextInt();
            boolean canVote=canStudentVote(ages[i]);
            System.out.println("Student "+(i+1)+" age "+ages[i]+" can vote: "+canVote);
        }
        sc.close();
    }
}

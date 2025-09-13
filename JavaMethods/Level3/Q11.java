package JavaMethods.Level3;
public class Q11 {
    public static int[][] generateEmployees(int n){
        int[][] data=new int[n][2];
        for(int i=0;i<n;i++){
            data[i][0]=10000+(int)(Math.random()*90000);
            data[i][1]=1+(int)(Math.random()*10);
        }
        return data;
    }
    public static double[][] calculateBonus(int[][] data){
        double[][] res=new double[data.length][2];
        for(int i=0;i<data.length;i++){
            double bonusRate=data[i][1]>5?0.05:0.02;
            double bonus=data[i][0]*bonusRate;
            double newSalary=data[i][0]+bonus;
            res[i][0]=newSalary;
            res[i][1]=bonus;
        }
        return res;
    }
    public static void totals(int[][] data,double[][] res){
        double oldSum=0,newSum=0,bonusSum=0;
        System.out.println("Salary\tYears\tNewSalary\tBonus");
        for(int i=0;i<data.length;i++){
            oldSum+=data[i][0];
            newSum+=res[i][0];
            bonusSum+=res[i][1];
            System.out.println(data[i][0]+"\t"+data[i][1]+"\t"+res[i][0]+"\t"+res[i][1]);
        }
        System.out.println("Total Old Salary: "+oldSum);
        System.out.println("Total New Salary: "+newSum);
        System.out.println("Total Bonus: "+bonusSum);
    }
    public static void main(String[] args){
        int[][] data=generateEmployees(10);
        double[][] res=calculateBonus(data);
        totals(data,res);
    }
}

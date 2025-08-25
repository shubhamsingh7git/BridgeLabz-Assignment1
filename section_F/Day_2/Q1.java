package section_F.Day_2;

class car{
    String model;
    int year;

    void display(String model,int year){
        System.out.println("Model: " + model + " Year: " + year);
    }
}

public class Q1 {
    public static void main(String[] args) {
        car obj1=new car();
        car obj2=new car();

        obj1.display("BMW", 2019);
        obj2.display("Mercedes",2015);

    }
    
}

package section_F.Day_2;

class Car1{
    String model;
    int year;
    static int numberOfCars=0;

    Car1(String model,int year){
        this.model=model;
        this.year=year;
        numberOfCars++;
    }



    void display(){
        System.out.println("Model: " + model + " Year: " + year);
    }
}

public class Q2 {
    public static void main(String[] args) {
        Car1 obj1=new Car1("BMW", 2019);
        Car1 obj2=new Car1("Mercedes",2015);

        obj1.display();
        obj2.display();

        System.out.println(Car1.numberOfCars);
    }
    
}

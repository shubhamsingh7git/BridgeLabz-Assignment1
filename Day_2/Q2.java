package Day_2;

class Car{
    String model;
    int year;
    static int numberOfCars=0;

    Car(String model,int year){
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
        Car obj1=new Car("BMW", 2019);
        Car obj2=new Car("Mercedes",2015);

        obj1.display();
        obj2.display();

        System.out.println(Car.numberOfCars);
    }
    
}

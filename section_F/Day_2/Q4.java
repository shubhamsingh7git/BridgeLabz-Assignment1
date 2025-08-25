package section_F.Day_2;

class Student{
    String name;
    int marks;

    Student(String name , int marks){
        this.name = name;
        this.marks = marks;
    }

    void Display(){
        System.out.println("Name : " + name + " ,Marks : " + marks);
    }
}

public class Q4 {
    public static void main(String[] args) {
        Student obj1 = new Student("Nitin" , 100);
        Student obj2 = new Student("Shubham", 100);

        obj1.Display();
        obj2.Display();
    }
}
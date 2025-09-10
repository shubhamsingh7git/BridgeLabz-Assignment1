package Keywords_Level1;
class Student {
    static String universityName = "National Institute of Technology"; 
    private static int totalStudents = 0; 

    static void displayTotalStudents() {
        System.out.println("Total Students Enrolled: " + totalStudents);
    }
    private String name;
    private final int rollNumber; 
    private String grade;

  
    Student(String name, int rollNumber, String grade) {
        this.name = name;             
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }
    void displayDetails() {
        if (this instanceof Student) {
            System.out.println("University: " + universityName);
            System.out.println("Name: " + this.name);
            System.out.println("Roll Number: " + this.rollNumber);
            System.out.println("Grade: " + this.grade);
        } else {
            System.out.println("Not a valid Student object.");
        }
    }

    void updateGrade(String newGrade) {
        if (this instanceof Student) {
            this.grade = newGrade;
            System.out.println("Grade updated for " + this.name + " to " + this.grade);
        } else {
            System.out.println("Cannot update grade. Invalid object.");
        }
    }
}

public class Q5 {
    public static void main(String[] args) {
        Student s1 = new Student("Shubham Singh", 101, "A");
        Student s2 = new Student("Nitin Goyal", 102, "B");

       
        s1.displayDetails();
        System.out.println();
        s2.displayDetails();

        System.out.println();
        
        s2.updateGrade("A+");

        System.out.println();
       
        Student.displayTotalStudents();
    }
}

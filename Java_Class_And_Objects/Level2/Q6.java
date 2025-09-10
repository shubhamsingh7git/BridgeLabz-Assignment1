package Java_Class_And_Objects.Level2;

public class Q6 {
	
    class Student {
        String name;
        int rollNumber;
        double marks;

        Student(String name, int rollNumber, double marks) {
            this.name = name;
            this.rollNumber = rollNumber;
            this.marks = marks;
        }

        String Grade() {
            if (marks >= 90) {
                return "A";
            } else if (marks >= 75) {
                return "B";
            } else if (marks >= 50) {
                return "C";
            } else {
                return "D (Fail)";
            }
        }

        void displayDetails() {
            System.out.println("Student Report:");
            System.out.println("Name       : " + name);
            System.out.println("Roll No.   : " + rollNumber);
            System.out.println("Marks      : " + marks);
            System.out.println("Grade      : " + Grade());
            System.out.println();        }
    }

    public static void main(String[] args) {
        Q6 outer = new Q6();

        Student obj1 = outer.new Student("Ravi", 101, 92.5);
        Student obj2 = outer.new Student("Neha", 102, 78.0);
        Student obj3 = outer.new Student("Amit", 103, 45.0);

        obj1.displayDetails();
        obj2.displayDetails();
        obj3.displayDetails();
    }
}
package OOPs.AccessModifiers;

class Student {
    public int rollNumber;
    protected String name;
    private double CGPA;

    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    public double getCGPA() {
        return CGPA;
    }

    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }
}

class PostgraduateStudent extends Student {
    public PostgraduateStudent(int rollNumber, String name, double CGPA) {
        super(rollNumber, name, CGPA);
    }

    public void displayInfo() {
        System.out.println("Roll No: " + rollNumber + ", Name: " + name + ", CGPA: " + getCGPA());
    }
}

public class Q1 {
    public static void main(String[] args) {
        PostgraduateStudent pg = new PostgraduateStudent(101, "Saul", 8.9);
        pg.displayInfo();
        pg.setCGPA(9.2);
        pg.displayInfo();
    }
}

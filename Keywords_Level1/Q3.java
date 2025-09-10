package Keywords_Level1;
class Employee {
    static String companyName = "Tech Solutions Pvt. Ltd.";
    private static int totalEmployees = 0;

    static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    private String name;
    private final int id;  
    private String designation;
    
    Employee(String name, int id, String designation) {
        this.name = name;               
        this.id = id;
        this.designation = designation;
        totalEmployees++;               
    }

    void displayDetails() {
        if (this instanceof Employee) {
            System.out.println("Company: " + companyName);
            System.out.println("Employee Name: " + this.name);
            System.out.println("Employee ID: " + this.id);
            System.out.println("Designation: " + this.designation);
        } else {
            System.out.println("Not a valid Employee object.");
        }
    }
}

public class Q3{
    public static void main(String[] args) {
        Employee e1 = new Employee("Shubham Singh", 101, "Software Engineer");
        Employee e2 = new Employee("Nitin Goyal", 102, "Project Manager");

        e1.displayDetails();
        System.out.println();
        e2.displayDetails();

        System.out.println();
        Employee.displayTotalEmployees();
    }
}

package OOPs.AccessModifiers;

class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }


    public void updateSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}

class Manager extends Employee {
    public Manager(int employeeID, String department, double salary) {
        super(employeeID, department, salary);
    }

    public void displayEmployee() {
        System.out.println("Manager ID: " + employeeID + ", Department: " + department + ", Salary: " + getSalary());
    }
}

public class Q4 {
    public static void main(String[] args) {
        Manager mgr = new Manager(201, "IT", 75000);
        mgr.displayEmployee();
        mgr.updateSalary(85000);
        mgr.displayEmployee();
    }
}

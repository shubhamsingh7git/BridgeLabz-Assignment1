package Keywords_Level1;

class Patient {
    static String hospitalName = "City Care Hospital"; 
    private static int totalPatients = 0;              

    static void getTotalPatients() {
        System.out.println("Total Patients Admitted: " + totalPatients);
    }

    private String name;
    private int age;
    private String ailment;
    private final int patientID;

    Patient(int patientID, String name, int age, String ailment) {
        this.patientID = patientID;
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        totalPatients++;
    }

    void displayDetails() {
        if (this instanceof Patient) {
            System.out.println("Hospital: " + hospitalName);
            System.out.println("Patient ID: " + this.patientID);
            System.out.println("Name: " + this.name);
            System.out.println("Age: " + this.age);
            System.out.println("Ailment: " + this.ailment);
        } else {
            System.out.println("Not a valid Patient object.");
        }
    }
}

public class Q7 {
    public static void main(String[] args) {
        Patient p1 = new Patient(101, "Shubham Singh", 25, "Fever");
        Patient p2 = new Patient(102, "Sarthak Sahgal", 40, "Fever");

        p1.displayDetails();
        System.out.println();
        p2.displayDetails();

        System.out.println();
        Patient.getTotalPatients();
    }
}

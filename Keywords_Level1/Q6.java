package Keywords_Level1;
class Vehicle {
    static double registrationFee = 5000.0;

    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
        System.out.println("Registration fee updated to: ₹" + registrationFee);
    }
    private String ownerName;
    private String vehicleType;
    private final String registrationNumber;

    Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;             
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    void displayDetails() {
        if (this instanceof Vehicle) {
            System.out.println("Owner Name: " + this.ownerName);
            System.out.println("Vehicle Type: " + this.vehicleType);
            System.out.println("Registration Number: " + this.registrationNumber);
            System.out.println("Registration Fee: ₹" + registrationFee);
        } else {
            System.out.println("Not a valid Vehicle object.");
        }
    }
}

public class Q6 {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Shubham Singh", "Car", "MH12AB1234");
        Vehicle v2 = new Vehicle("Amit Sharma", "Bike", "MH14XY9876");
        v1.displayDetails();
        System.out.println();
        v2.displayDetails();

        System.out.println("\n--- Updating Registration Fee ---");
        Vehicle.updateRegistrationFee(6000.0);

        System.out.println();
        v1.displayDetails();
        System.out.println();
        v2.displayDetails();
    }
}

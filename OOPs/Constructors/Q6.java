package OOPs.Constructors;

public class Q6 {
    static class CarRental {
        String customerName;
        String carModel;
        int rentalDays;
        double dailyRate = 1000.0; 

       
        CarRental() {
            this.customerName = "Customer";
            this.carModel = "Unknown";
            this.rentalDays = 1;
        }

        
        CarRental(String customerName, String carModel, int rentalDays) {
            this.customerName = customerName;
            this.carModel = carModel;
            this.rentalDays = rentalDays;
        }

        double totalCost() {
            return rentalDays * dailyRate;
        }

        void display() {
            System.out.println("Customer: " + customerName + ", Car: " + carModel +
                    ", Days: " + rentalDays + ", Total Cost: " + totalCost());
        }
    }

    public static void main(String[] args) {
        CarRental r1 = new CarRental();
        CarRental r2 = new CarRental("Saul", "SUV", 5);

        r1.display();
        r2.display();
    }
}

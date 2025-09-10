package Constructor.Level1;

public class Q6 {
    String customerName;
    String carModel;
    int rentalDays;
    double dailyRate;

    Q6() {
        this.customerName = "Unknown";
        this.carModel = "Standard";
        this.rentalDays = 1;
        this.dailyRate = 1000; 
    }

    Q6(String customerName, String carModel, int rentalDays, double dailyRate) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.dailyRate = dailyRate;
    }

    double calculateTotalCost() {
        return rentalDays * dailyRate;
    }

    void displayRental() {
        System.out.println("Customer: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Daily Rate: ₹" + dailyRate);
        System.out.println("Total Cost: ₹" + calculateTotalCost());
        System.out.println(" ");
    }

    public static void main(String[] args) {
        Q6 r1 = new Q6();
        r1.displayRental();

        Q6 r2 = new Q6("Alice", "SUV", 5, 2500);
        r2.displayRental();

        Q6 r3 = new Q6("Bob", "Sedan", 3, 1800);
        r3.displayRental();
    }
}

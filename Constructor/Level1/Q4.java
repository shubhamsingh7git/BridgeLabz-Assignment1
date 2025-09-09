package Constructor.Level1;

public class Q4 {
    String guestName;
    String roomType;
    int nights;

    Q4() {
        this.guestName = "Unknown Guest";
        this.roomType = "Standard";
        this.nights = 1;
    }

    Q4(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    Q4(Q4 other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }

    void displayBooking() {
        System.out.println("Guest: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Nights: " + nights);
        System.out.println(" ");
    }

    public static void main(String[] args) {
        // Using default constructor
        Q4 b1 = new Q4();
        b1.displayBooking();

        Q4 b2 = new Q4("Shubham", "Deluxe", 3);
        b2.displayBooking();

        Q4 b3 = new Q4(b2);
        b3.displayBooking();
    }
}
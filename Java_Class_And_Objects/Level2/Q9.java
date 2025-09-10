package Java_Class_And_Objects.Level2;

public class Q9 {
    public static class MovieTicket {
        
        String movieName;
        String seatNumber;
        double price;
        
        void bookTicket(String movieName, String seatNumber, double price) {
            this.movieName = movieName;
            this.seatNumber = seatNumber;
            this.price = price;
            System.out.println("Ticket booked successfully!\n");
        }

        void display() {
            System.out.println("Movie Ticket Details:");
            System.out.println("Movie Name : " + movieName);
            System.out.println("Seat No.   : " + seatNumber);
            System.out.println("Price      : " + price);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        MovieTicket t1 = new MovieTicket();
        MovieTicket t2 = new MovieTicket();

        t1.bookTicket("Avengers: Endgame", "A10", 250);
        t2.bookTicket("Inception", "B15", 300);

        t1.display();
        t2.display();
    }
}
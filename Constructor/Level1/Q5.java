package Constructor.Level1;

public class Q5 {
    String title;
    String author;
    double price;
    boolean available;

    Q5(String title, String author, double price, boolean available) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = available;
    }

    void borrowBook() {
        if (available) {
            available = false;
            System.out.println(title + " has been borrowed successfully.");
        } else {
            System.out.println(title + " is currently not available.");
        }
    }
    void displayBook() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: ₹" + price);
        System.out.println("Available: " + (available ? "Yes" : "No"));
        System.out.println(" ");
    }

    public static void main(String[] args) {
        Q5 b1 = new Q5("The Alchemist", "Paulo Coelho", 499.99, true);
        Q5 b2 = new Q5("1984", "George Orwell", 399.50, false);

        b1.displayBook();
        b2.displayBook();

        b1.borrowBook();
        b2.borrowBook();

        b1.displayBook();
        b2.displayBook();
    }
}

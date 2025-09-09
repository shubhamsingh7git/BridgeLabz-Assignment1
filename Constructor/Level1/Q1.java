package Constructor.Level1;

public class Q1 {
    static class Book {
        String title;
        String author;
        double price;

        Book() {
            this.title = "Unknown";
            this.author = "Unknown";
            this.price = 0.0;
        }

        Book(String title, String author, double price) {
            this.title = title;
            this.author = author;
            this.price = price;
        }

        void display() {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("Price: ₹" + price);
        }
    }

    public static void main(String[] args) {
        Book b1 = new Book();
        b1.display();

        System.out.println();

        Book b2 = new Book("The Alchemist", "Paulo Coelho", 499.99);
        b2.display();
    }
}

package OOPs.Constructors;

public class Q5 {
    static class Book {
        String title;
        String author;
        double price;
        boolean available;

        Book(String title, String author, double price) {
            this.title = title;
            this.author = author;
            this.price = price;
            this.available = true;
        }

        void borrowBook() {
            if (available) {
                available = false;
                System.out.println("Book borrowed successfully: " + title);
            } else {
                System.out.println("Book is not available: " + title);
            }
        }

        void display() {
            System.out.println("Title: " + title + ", Author: " + author + ", Price: " + price + ", Available: " + available);
        }
    }

    public static void main(String[] args) {
        Book b1 = new Book("Data Structures", "Robert Lafore", 350.0);
        b1.display();
        b1.borrowBook();
        b1.display();
    }
}

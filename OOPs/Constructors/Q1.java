package OOPs.Constructors;

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
            System.out.println("Title: " + title + ", Author: " + author + ", Price: " + price);
        }
    }

    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("Java Basics", "James Gosling", 499.99);

        b1.display();
        b2.display();
    }
}

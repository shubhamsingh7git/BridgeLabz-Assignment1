package Java_Class_And_Objects.Level1;

public class Q3 {

    public static class Book {
        String title;
        String author;
        double price;

        Book(String title, String author, double price) {
            this.title = title;
            this.author = author;
            this.price = price;
        }

        void show() {
            System.out.println("Book Title : " + title);
            System.out.println("Author     : " + author);
            System.out.println("Price      : ₹" + price);
            System.out.println();
        }
    }

    public static void main(String... args) {
        Book b1 = new Book("Gitanjali", "Rabindranath Tagore", 200);
        Book b2 = new Book("The White Tiger", "Aravind Adiga", 350);

        b1.show();
        b2.show();
    }
}
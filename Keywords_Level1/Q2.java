package Keywords_Level1;
class Book {
    static String libraryName = "City Central Library"; 

    static void displayLibraryName() {
        System.out.println("Library: " + libraryName);
    }
    private String title;
    private String author;
    private final String isbn;

    Book(String title, String author, String isbn) {
        this.title = title;     
        this.author = author;
        this.isbn = isbn;
    }

    void displayDetails() {
        if (this instanceof Book) {
            System.out.println("Library: " + libraryName);
            System.out.println("Title: " + this.title);
            System.out.println("Author: " + this.author);
            System.out.println("ISBN: " + this.isbn);
        } else {
            System.out.println("Not a valid Book object.");
        }
    }
}
public class Q2 {
    public static void main(String[] args) {
        // Create some books
        Book b1 = new Book("The Alchemist", "Paulo Coelho", "ISBN1001");
        Book b2 = new Book("Clean Code", "Robert C. Martin", "ISBN1002");

        Book.displayLibraryName();
        System.out.println();

        b1.displayDetails();
        System.out.println();
        b2.displayDetails();
    }
}

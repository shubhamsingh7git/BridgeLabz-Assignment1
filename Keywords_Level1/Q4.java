package Keywords_Level1;
class Product {
    
    static double discount = 10.0; 

    static void updateDiscount(double newDiscount) {
        discount = newDiscount;
        System.out.println("Discount updated to: " + discount + "%");
    }

    private String productName;
    private double price;
    private int quantity;
    private final int productID; 

    Product(int productID, String productName, double price, int quantity) {
        this.productID = productID;     
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    void displayDetails() {
        if (this instanceof Product) {
            System.out.println("Product ID: " + this.productID);
            System.out.println("Product Name: " + this.productName);
            System.out.println("Price: ₹" + this.price);
            System.out.println("Quantity: " + this.quantity);
            double total = this.price * this.quantity;
            double discountedPrice = total - (total * discount / 100);
            System.out.println("Total after " + discount + "% discount: ₹" + discountedPrice);
        } else {
            System.out.println("Not a valid Product object.");
        }
    }
}
public class Q4 {
    public static void main(String[] args) {
        Product p1 = new Product(101, "Laptop", 50000, 1);
        Product p2 = new Product(102, "Headphones", 2000, 2);

        p1.displayDetails();
        System.out.println();
        p2.displayDetails();

        System.out.println("\n--- Updating Discount ---");
        Product.updateDiscount(15.0);

        System.out.println();
        p1.displayDetails();
        System.out.println();
        p2.displayDetails();
    }
}

package OOPs.InstanceVsClassVariables_Methods;

public class Q1 {
    static class Product {
        String productName;
        double price;
        static int totalProducts = 0; 

        Product(String productName, double price) {
            this.productName = productName;
            this.price = price;
            totalProducts++; 
        }

        void displayProductDetails() {
            System.out.println("Product Name: " + productName + ", Price: " + price);
        }
        static void displayTotalProducts() {
            System.out.println("Total Products: " + totalProducts);
        }
    }

    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 50000);
        Product p2 = new Product("Phone", 25000);

        p1.displayProductDetails();
        p2.displayProductDetails();
        Product.displayTotalProducts();
    }
}

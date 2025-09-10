package Java_Class_And_Objects.Level2;

import java.util.ArrayList;

public class Q10 {

    static class CartItem {
        String itemName;
        double price;
        int quantity;

        CartItem(String itemName, double price, int quantity) {
            this.itemName = itemName;
            this.price = price;
            this.quantity = quantity;
        }

        double getCost() {
            return price * quantity;
        }

        void display() {
            System.out.println("Item Name : " + itemName);
            System.out.println("Price     : " + price);
            System.out.println("Quantity  : " + quantity);
            System.out.println();
        }
    }

    private static ArrayList<CartItem> cart = new ArrayList<>();

    public static void addItem(String name, double price, int qty) {
        cart.add(new CartItem(name, price, qty));
        System.out.println(name + " added to cart.\n");
    }

    public static void removeItem(String name) {
        for (int i = 0; i < cart.size(); i++) {
            if (cart.get(i).itemName.equalsIgnoreCase(name)) {
                cart.remove(i);
                System.out.println(name + " removed from cart.\n");
                return;
            }
        }
        System.out.println(name + " not found in cart.\n");
    }

    public static void displayCart() {
        if (cart.isEmpty()) {
            System.out.println("\nCart is empty.\n");
            return;
        }
        double total = 0;
        System.out.println();
        for (CartItem item : cart) {
            item.display();
            total += item.getCost();
        }
        System.out.println("TOTAL COST: " + total);
        System.out.println();
    }

    public static void main(String[] args) {
        addItem("Apple", 30, 2);
        addItem("Banana", 10, 5);
        addItem("Milk", 50, 1);

        displayCart();
        removeItem("Banana");
        displayCart();
    }
}
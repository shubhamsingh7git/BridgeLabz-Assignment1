package Java_Class_And_Objects.Level1;

public class Q4 {

	public static class Item {
        String itemCode;
        String itemName;
        double price;

        Item(String itemCode, String itemName, double price) {
            this.itemCode = itemCode;
            this.itemName = itemName;
            this.price = price;
        }

        double total(int quantity) {
            return price * quantity;
        }

        void show(int quantity) {
            System.out.println("Item Code : " + itemCode);
            System.out.println("Item Name : " + itemName);
            System.out.println("Price     : ₹" + price);
            System.out.println("Quantity  : " + quantity);
            System.out.println("Total Cost: ₹" + total(quantity));
            System.out.println();
        }
    }

    public static void main(String... args) {
        Item item1 = new Item("A101", "Laptop", 45000);
        Item item2 = new Item("B202", "Smartphone", 15000);

        item1.show(2);  
        item2.show(5); 
    }
}
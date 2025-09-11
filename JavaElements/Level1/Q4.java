package JavaElements.Level1;
public class Q4 {
    public static void main(String[] args) {
        int costPrice = 129;
        int sellingPrice = 191;

        int profit = sellingPrice - costPrice;
        double profitPercentage = (profit / (double) costPrice) * 100;

       
        System.out.println(
            "Cost Price       : INR " + costPrice + "\n" +
            "Selling Price    : INR " + sellingPrice + "\n" +
            "Profit           : INR " + profit + "\n" +
            "Profit Percentage: " + String.format("%.2f", profitPercentage) + "%"
        );
    }
}

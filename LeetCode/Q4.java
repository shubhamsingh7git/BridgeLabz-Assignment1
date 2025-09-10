package LeetCode;

import java.util.Arrays;

public class Q4 {

    static class Solution {
        public int maxProfit(int[] arr) {
            int n = arr.length;
            int max = Integer.MIN_VALUE;
            int min = arr[0];
            for (int i = 0; i < n; i++) {
                if (arr[i] < min) {
                    min = arr[i];
                }
                int d = arr[i] - min;
                max = Math.max(max, d);
            }
            return max;
        }
    }

    public static void main(String... args) {
        Solution sol = new Solution();

        int[] prices = {7, 1, 5, 3, 6, 4};

        System.out.println("Stock prices: " + Arrays.toString(prices));

        int profit = sol.maxProfit(prices);
        System.out.println("Maximum Profit: " + profit);

        // Try another test
        int[] prices2 = {7, 6, 4, 3, 1};
        System.out.println("\nStock prices: " + Arrays.toString(prices2));
        System.out.println("Maximum Profit: " + sol.maxProfit(prices2));
    }
}
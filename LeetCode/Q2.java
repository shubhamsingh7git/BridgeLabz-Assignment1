package LeetCode;

import java.util.Arrays;

class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        if (nums.length == 0) return 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}

public class Q2 {
    public static void main(String... args) {
        Solution sol = new Solution();

        int[] nums = {3, 2, 2, 3, 4, 3, 5};
        int val = 3;

        System.out.println("Original array: " + Arrays.toString(nums));

        int k = sol.removeElement(nums, val);

        System.out.println("Length after removing " + val + ": " + k);
        System.out.print("Modified array: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
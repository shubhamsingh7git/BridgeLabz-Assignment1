package LeetCode;

import java.util.Arrays;

public class Q1 {
    public int removeDuplicates(int[] nums) {
        int k = 1;
        if (nums.length == 0) {
            return 0;
        }
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        Q1 sol = new Q1();

        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println("Original array: " + Arrays.toString(nums));

        int k = sol.removeDuplicates(nums);

        System.out.println("Length after removing duplicates: " + k);
        System.out.print("Modified array: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
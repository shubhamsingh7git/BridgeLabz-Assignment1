package LeetCode;

import java.util.Arrays;

public class Q3 {

    static class Solution {
        public int searchInsert(int[] nums, int target) {
            int n = nums.length;
            int lo = 0;
            int hi = n - 1;
            while (lo <= hi) {
                int mid = lo + (hi - lo) / 2;
                if (nums[mid] == target) return mid;
                else if (nums[mid] > target) hi = mid - 1;
                else lo = mid + 1;
            }
            return lo;
        }
    }

    public static void main(String... args) {
        Solution sol = new Solution();

        int[] nums = {1, 3, 5, 6};
        int target = 5;

        System.out.println("Array: " + Arrays.toString(nums));
        System.out.println("Target: " + target);

        int index = sol.searchInsert(nums, target);
        System.out.println("Insert position: " + index);
    }
}
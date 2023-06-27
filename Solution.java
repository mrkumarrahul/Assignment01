//mock test 1
import java.util.Arrays;

public class Solution {
    public static void moveZeroes(int[] nums) {
        int curr = 0; // Pointer for iterating the array
        int nonzero = 0; // Pointer for placing non-zero elements

        // Iterate through the array
        while (curr < nums.length) {
            // If the current element is non-zero, swap it with the element at the nonzero pointer
            if (nums[curr] != 0) {
                int temp = nums[curr];
                nums[curr] = nums[nonzero];
                nums[nonzero] = temp;
                nonzero++;
            }

            curr++;
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {0, 1, 0, 3, 12};
        moveZeroes(nums1);
        System.out.println(Arrays.toString(nums1)); // Output: [1, 3, 12, 0, 0]

        int[] nums2 = {0};
        moveZeroes(nums2);
        System.out.println(Arrays.toString(nums2)); // Output: [0]
    }
}

import java.util.Arrays;

public class ArrayPairSum {
    public static int arrayPairSum(int[] nums) {
        Arrays.sort(nums);  // Sort the array in ascending order
        int pairSum = 0;
        for (int i = 0; i < nums.length; i += 2) {
            pairSum += nums[i];  // Add the minimum value in each pair
        }
        return pairSum;
    }

    public static void main(String[] args) {
        int[] nums = {1, 4, 3, 2};
        int maxSum = arrayPairSum(nums);
        System.out.println(maxSum);  // Output: 4
    }
}

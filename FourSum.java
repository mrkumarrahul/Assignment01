import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;
        
        if (nums == null || n < 4) {
            return result;
        }
        
        Arrays.sort(nums);
        
        for (int i = 0; i < n - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue; // Skip duplicates
            }
            
            for (int j = i + 1; j < n - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue; // Skip duplicates
                }
                
                int left = j + 1;
                int right = n - 1;
                
                while (left < right) {
                    int currentSum = nums[i] + nums[j] + nums[left] + nums[right];
                    
                    if (currentSum == target) {
                        result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        left++;
                        right--;
                        
                        while (left < right && nums[left] == nums[left - 1]) {
                            left++; // Skip duplicates
                        }
                        
                        while (left < right && nums[right] == nums[right + 1]) {
                            right--; // Skip duplicates
                        }
                    } else if (currentSum < target) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 0, -1, 0, -2, 2};
        int target = 0;

        FourSum solution = new FourSum();
        List<List<Integer>> result = solution.fourSum(nums, target);

        // Print the result
        for (List<Integer> quadruplet : result) {
            System.out.println(quadruplet);
        }
    }
}

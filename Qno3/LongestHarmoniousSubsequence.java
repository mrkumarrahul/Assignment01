import java.util.HashMap;
import java.util.Map;

public class LongestHarmoniousSubsequence {
    public static int findLHS(int[] nums) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        
        // Count the frequencies of each number
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        
        int maxLen = 0;
        
        // Iterate through the frequency map
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            int currentNum = entry.getKey();
            int currentFreq = entry.getValue();
            
            // Check if there is a potential harmonious pair
            if (frequencyMap.containsKey(currentNum + 1)) {
                int nextFreq = frequencyMap.get(currentNum + 1);
                int currentLen = currentFreq + nextFreq;
                
                // Update maxLen if necessary
                maxLen = Math.max(maxLen, currentLen);
            }
        }
        
        return maxLen;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 2, 2, 5, 2, 3, 7};
        int longestSubsequence = findLHS(nums);
        System.out.println(longestSubsequence);  // Output: 5
    }
}

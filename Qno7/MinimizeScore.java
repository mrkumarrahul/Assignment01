public class MinimizeScore {
    public static int minimizeScore(int[] nums, int k) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        int initialScore = max - min;
        if (initialScore == 0) {
            return 0;
        }

        int potentialMin = Integer.MAX_VALUE;
        int potentialMax = Integer.MIN_VALUE;

        for (int num : nums) {
            int potential1 = Math.max(min, num - k);
            int potential2 = Math.min(max, num + k);
            potentialMin = Math.min(potentialMin, potential1);
            potentialMax = Math.max(potentialMax, potential2);
        }

        int potentialScore = potentialMax - potentialMin;

        return Math.min(initialScore, potentialScore);
    }

    public static void main(String[] args) {
        int[] nums = {1};
        int k = 0;
        int minScore = minimizeScore(nums, k);
        System.out.println(minScore);  // Output: 0
    }
}

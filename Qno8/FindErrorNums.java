public class FindErrorNums {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int xor = 0;
        for (int i = 0; i < n; i++) {
            xor ^= nums[i] ^ (i + 1);
        }

        int rightmostSetBit = xor & ~(xor - 1);

        int duplicate = 0;
        int missing = 0;
        for (int num : nums) {
            if ((num & rightmostSetBit) != 0) {
                duplicate ^= num;
            } else {
                missing ^= num;
            }
        }

        for (int i = 1; i <= n; i++) {
            if ((i & rightmostSetBit) != 0) {
                duplicate ^= i;
            } else {
                missing ^= i;
            }
        }

        for (int num : nums) {
            if (num == duplicate) {
                return new int[]{duplicate, missing};
            }
        }

        return new int[]{missing, duplicate};
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 4};

        FindErrorNums solution = new FindErrorNums();
        int[] result = solution.findErrorNums(nums);

        System.out.println("Duplicate: " + result[0] + ", Missing: " + result[1]);
    }
}

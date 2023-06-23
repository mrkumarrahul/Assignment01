public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int left = 0;  // Pointer for the leftmost available position

        // Move non-zero elements to the left
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[left] = nums[i];
                left++;
            }
        }

        // Fill the remaining positions with zeros
        for (int i = left; i < nums.length; i++) {
            nums[i] = 0;
        }
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};

        MoveZeroes solution = new MoveZeroes();
        solution.moveZeroes(nums);

        System.out.print("Modified Array: [");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
            if (i < nums.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}

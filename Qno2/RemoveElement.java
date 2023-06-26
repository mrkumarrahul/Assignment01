public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int k = 0;  // Count of elements not equal to val

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];  // Move the non-val element to the front of the array
                k++;  // Increment the count
            }
        }

        return k;
    }

    public static void main(String[] args) {
        int[] nums = { 3, 2, 2, 3 };
        int val = 3;

        RemoveElement solution = new RemoveElement();
        int k = solution.removeElement(nums, val);

        System.out.println("k = " + k);
        System.out.print("nums = [");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i]);
            if (i < k - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}

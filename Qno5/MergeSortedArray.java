public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;  // Pointer for nums1
        int j = n - 1;  // Pointer for nums2
        int k = m + n - 1;  // Pointer for the merged array
        
        while (i >= 0 && j >= 0) {
            if (nums1[i] >= nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }
        
        // If there are remaining elements in nums2, copy them to nums1
        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;
        
        MergeSortedArray solution = new MergeSortedArray();
        solution.merge(nums1, m, nums2, n);
        
        System.out.print("Merged Array: [");
        for (int i = 0; i < m + n; i++) {
            System.out.print(nums1[i]);
            if (i < m + n - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}

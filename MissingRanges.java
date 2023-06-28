import java.util.ArrayList;
import java.util.List;

public class MissingRanges {
    public List<String> findMissingRanges(int[] nums, int lower, int upper) {
        List<String> result = new ArrayList<>();
        int n = nums.length;
        long start = lower;

        for (int i = 0; i < n; i++) {
            if (nums[i] > start) {
                result.add(getRange(start, nums[i] - 1));
            }
            start = (long) nums[i] + 1;
        }

        if (start <= upper) {
            result.add(getRange(start, upper));
        }

        return result;
    }

    private String getRange(long start, long end) {
        if (start == end) {
            return String.valueOf(start);
        } else {
            return start + "->" + end;
        }
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 3, 50, 75};
        int lower = 0;
        int upper = 99;
        MissingRanges solution = new MissingRanges();
        List<String> ranges = solution.findMissingRanges(nums, lower, upper);
        System.out.println(ranges); // Output: [2, 4->49, 51->74, 76->99]
    }
}

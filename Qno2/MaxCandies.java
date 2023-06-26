import java.util.HashSet;
import java.util.Set;

public class MaxCandies {
    public static int maxCandies(int[] candyType) {
        int n = candyType.length;
        int maxCandyTypes = n / 2;

        Set<Integer> uniqueCandyTypes = new HashSet<>();
        for (int candy : candyType) {
            uniqueCandyTypes.add(candy);
        }

        return Math.min(uniqueCandyTypes.size(), maxCandyTypes);
    }

    public static void main(String[] args) {
        int[] candyType = {1, 1, 2, 2, 3, 3};
        int maxCandies = maxCandies(candyType);
        System.out.println(maxCandies);  // Output: 3
    }
}

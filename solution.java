//mock test of ppt
import java.util.HashMap;

public class solution {
    public static int firstUniqChar(String s) {
        // Create a hashmap to store the frequency of each character
        HashMap<Character, Integer> frequencyMap = new HashMap<>();

        // Iterate through the string to populate the frequency map
        for (char ch : s.toCharArray()) {
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
        }

        // Iterate through the string to find the first non-repeating character
        for (int i = 0; i < s.length(); i++) {
            if (frequencyMap.get(s.charAt(i)) == 1) {
                return i; // Return the index of the first non-repeating character
            }
        }

        return -1; // Return -1 if no non-repeating character is found
    }

    public static void main(String[] args) {
        String s1 = "leetcode";
        System.out.println(firstUniqChar(s1)); // Output: 0

        String s2 = "loveleetcode";
        System.out.println(firstUniqChar(s2)); // Output: 2

        String s3 = "aabb";
        System.out.println(firstUniqChar(s3)); // Output: -1
    }
}

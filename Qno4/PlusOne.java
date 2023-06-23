public class PlusOne {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        
        // Increment the least significant digit by 1
        digits[n - 1] += 1;
        
        // Check if there is a carry
        int carry = digits[n - 1] / 10;
        digits[n - 1] %= 10;
        
        // Process the remaining digits
        for (int i = n - 2; i >= 0; i--) {
            if (carry == 0) {
                break;
            }
            
            digits[i] += carry;
            carry = digits[i] / 10;
            digits[i] %= 10;
        }
        
        // If there is a carry after processing all digits, create a new array with an additional digit
        if (carry > 0) {
            int[] result = new int[n + 1];
            result[0] = carry;
            System.arraycopy(digits, 0, result, 1, n);
            return result;
        }
        
        return digits;
    }

    public static void main(String[] args) {
        int[] digits = {1, 2, 3};
        
        PlusOne solution = new PlusOne();
        int[] result = solution.plusOne(digits);
        
        System.out.print("Result: [");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i < result.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}

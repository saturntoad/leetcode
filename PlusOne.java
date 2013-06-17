public class Solution {
    public int[] plusOne(int[] digits) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if (digits == null || digits.length == 0)
            return digits;
        int carry = 0;
        if (digits[digits.length - 1] + 1 > 9)
            carry = 1;
        digits[digits.length - 1] = (digits[digits.length - 1] + 1) % 10;
        int temp = 0;
        for (int i = digits.length - 2 ; i >= 0 ; --i) {
            temp = digits[i] + carry;
            if (temp > 9)
                carry = 1;
            else
                carry = 0;
            digits[i] = temp % 10;
        }
        if (carry == 0)
            return digits;
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        for (int i = 1 ; i < result.length ; ++i) {
            result[i] = digits[i - 1];
        } 
        return result;
    }
}
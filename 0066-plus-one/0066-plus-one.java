class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;

        // Traverse from the least significant digit (right to left)
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits; // No carry forward needed, return result
            }
            digits[i] = 0; // Carry over, set current to 0
        }

        // If all digits were 9, we need an extra digit at the front (e.g., 999 -> 1000)
        int[] result = new int[n + 1];
        result[0] = 1; 
        return result;
    }
}
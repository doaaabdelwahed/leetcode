class Solution {
    public int[] sumZero(int n) {
        int[] result = new int[n];
        for (int i = 0; i < n / 2; i++) {
            result[i] = i + 1;      // Positive numbers
            result[n - 1 - i] = -(i + 1); // Corresponding negative numbers
        }
        if (n % 2 == 1) {
            result[n / 2] = 0; // Add zero for odd n
        }
        return result;    
    }
}
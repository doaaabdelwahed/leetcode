class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[nums.length];
        int index = 0;

        // Interleave the first half and the second half
        for (int i = 0; i < n; i++) {
            result[index++] = nums[i];      // Pick from the first half
            result[index++] = nums[i + n];  // Pick from the second half
        }

        return result;
    }
}
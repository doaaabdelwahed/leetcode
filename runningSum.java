class Solution {
    public int[] runningSum(int[] nums) {
       int[] result = new int[nums.length];
        result[0] = nums[0];  // Initialize the first element
        
        for (int i = 1; i < nums.length; i++) {
            result[i] = result[i - 1] + nums[i];  // Add current element to the cumulative sum
        }
        
        return result;  
    }
}
class Solution {
    public int maxProduct(int[] nums) {
               int max1 = 0, max2 = 0;
        
        // Iterate over the array to find the two largest numbers
        for (int num : nums) {
            if (num > max1) {
                max2 = max1; // Second largest becomes the previous largest
                max1 = num;  // Update the largest
            } else if (num > max2) {
                max2 = num;  // Update the second largest
            }
        }
        
        // Return the result of (max1 - 1) * (max2 - 1)
        return (max1 - 1) * (max2 - 1);
    }
}
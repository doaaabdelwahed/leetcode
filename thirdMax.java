class Solution {
    public int thirdMax(int[] nums) {
        Integer first = null, second = null, third = null;
        
        // Iterate over the array
        for (int num : nums) {
            // Skip duplicates (numbers that are already considered as first, second, or third)
            if (num == (first != null ? first : Integer.MIN_VALUE) || 
                num == (second != null ? second : Integer.MIN_VALUE) || 
                num == (third != null ? third : Integer.MIN_VALUE)) {
                continue;
            }
            
            // Update first, second, and third maximums
            if (first == null || num > first) {
                third = second;
                second = first;
                first = num;
            } else if (second == null || num > second) {
                third = second;
                second = num;
            } else if (third == null || num > third) {
                third = num;
            }
        }
        
        // If third maximum exists, return it; otherwise, return the first maximum
        return (third == null) ? first : third;
    }
}
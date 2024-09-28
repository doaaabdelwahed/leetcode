class Solution {
    public int[] decompressRLElist(int[] nums) {
         List<Integer> result = new ArrayList<>();

        // Iterate through nums in steps of 2, treating each pair as [freq, val]
        for (int i = 0; i < nums.length; i += 2) {
            int freq = nums[i];   // Frequency
            int val = nums[i + 1]; // Value
            
            // Add 'val' to the result 'freq' times
            for (int j = 0; j < freq; j++) {
                result.add(val);
            }
        }

        // Convert the list to an array
        return result.stream().mapToInt(i -> i).toArray();
    }
}
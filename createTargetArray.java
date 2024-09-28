class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
           List<Integer> target = new ArrayList<>(nums.length);

        // Insert elements based on the index array
        for (int i = 0; i < nums.length; i++) {
            target.add(index[i], nums[i]);
        }

        // Convert List to int[] using a built-in method
        return target.stream().mapToInt(i -> i).toArray();
    }
}
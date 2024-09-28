class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxSum=0;
        for (int[] account : accounts) {
            int sum = 0;
            for (int num : account) {
                sum += num;  // Sum of the current sub-array
            }
            maxSum = Math.max(maxSum, sum);  // Keep track of the maximum sum
        }
        return maxSum;
    }
}
class Solution {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
          int count = 0;
        
        // Iterate through each student's startTime and endTime
        for (int i = 0; i < startTime.length; i++) {
            // Check if queryTime is between startTime[i] and endTime[i] (inclusive)
            if (startTime[i] <= queryTime && queryTime <= endTime[i]) {
                count++;
            }
        }
        
        return count;
    }
}
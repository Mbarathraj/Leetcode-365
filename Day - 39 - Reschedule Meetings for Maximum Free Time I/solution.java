class Solution {
    public int maxFreeTime(int eventTime, int k, int[] startTime, int[] endTime) {
        int n = startTime.length;
        int[] freeTimes = new int[n + 1];
        
        int t = 0;
        for (int i = 0; i < n; i++) {
            freeTimes[i] = startTime[i] - t;
            t = endTime[i];
        }
        freeTimes[n] = eventTime - t;

        int sum = 0, maxSum = 0;
        for (int i = 0; i < freeTimes.length; i++) {
            sum += freeTimes[i];
            if (i > k) {
                sum -= freeTimes[i - (k + 1)];
            }
            if (i >= k) {
                maxSum = Math.max(maxSum, sum);
            }
        }
        return maxSum;
    }
}

class Solution {
    public int maximumLength(int[] nums, int k) {
        int max=0;
        int [][]dp=new int[k][k];
        for(int num:nums){
            int curMod=num%k;
            for(int prev=0;prev<k;prev++){
                dp[prev][curMod]=dp[curMod][prev]+1;
                max=Math.max(max,dp[prev][curMod]);
            }
        }
        return max;
    }
}

class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int max=Integer.MIN_VALUE;
        int n=nums.length;
        for(int i=0;i<n-1;i++){
            max=Math.max(max,Math.abs(nums[i]-nums[i+1]));
        }
        max=Math.max(max,Math.abs(nums[n-1]-nums[0]));
        return max;
    }
}

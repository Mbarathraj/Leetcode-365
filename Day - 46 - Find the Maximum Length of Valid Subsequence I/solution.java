class Solution {
    public int maximumLength(int[] nums) {
        int odd=0,even=0,alt=1;
        if(nums[0]%2==0) even++;
        else odd++;
        int prev=nums[0];
        for(int i=1;i<nums.length;i++){
            if(prev%2!=nums[i]%2) alt++;
            if(nums[i]%2==0) even++;
            else odd++;
            prev=nums[i];
        }
        int max=Math.max(alt,even);
        max=Math.max(max,odd);
        return max;
    }
}

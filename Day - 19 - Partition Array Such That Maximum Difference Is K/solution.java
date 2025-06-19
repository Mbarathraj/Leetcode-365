class Solution {
    public int partitionArray(int[] nums, int k) {
        Arrays.sort(nums);
        int i=1;
        int min=nums[0];
        int c=0;
        while(i<nums.length){
            if(nums[i]-min>k){
                c++;
                min=nums[i];
            }
            i++;
        }
        c++;
        return c;
    }
}

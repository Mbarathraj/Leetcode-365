class Solution {
    public long minimumDifference(int[] nums) {
        int n=nums.length/3;
        int len=nums.length;
        long []leftSum=new long[2*n+1];
        PriorityQueue<Integer> maxHeap=new PriorityQueue<>(Collections.reverseOrder());
        long sumLeft=0;
        for(int i=0;i<2*n;i++){
            maxHeap.add(nums[i]);
            sumLeft+=nums[i];
            if(maxHeap.size()>n){
                sumLeft-=maxHeap.poll();
            }
            if(maxHeap.size()==n){
                leftSum[i]=sumLeft;
            }
        }
        long []rightSum=new long[len];
        PriorityQueue<Integer> minHeap=new PriorityQueue<>();
        long sumRight=0;
        for(int i=len-1;i>=n;i--){
            minHeap.add(nums[i]);
            sumRight+=nums[i];
            if(minHeap.size()>n){
                sumRight-=minHeap.poll();
            }
            if(minHeap.size()==n){
                rightSum[i]=sumRight;
            }
        }
        long res=Long.MAX_VALUE;
        for(int i=n-1;i<2*n;i++){
            res=Math.min(res,leftSum[i]-rightSum[i+1]);
        }
        return res;
    }
}

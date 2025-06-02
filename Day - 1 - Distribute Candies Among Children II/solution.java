class Solution {
    public long distributeCandies(int n, int limit) {
        long ans=0;
        for(int i=Math.max(0,n-2*limit);i<=Math.min(n,limit);i++){
            int low=Math.max(0,n-limit-i);
            int high=Math.min(limit,n-i);
            ans+=high-low+1;
        }
        return ans;
    }
}

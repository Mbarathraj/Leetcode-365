class Solution {
    public int maxDistance(String s, int k) {
        int N=0,S=0,W=0,E=0;
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='N') N++;
            else if(c=='S') S++;
            else if(c=='E') E++;
            else W++;
            ans=Math.max(ans,Math.min(Math.abs(N-S)+Math.abs(E-W)+2*k,i+1));
        }
        return ans;
    }
}

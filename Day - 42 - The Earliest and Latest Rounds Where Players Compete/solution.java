class Solution {
    int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE,fp,sp,N;

    public void dfs(int mask,int round,int left,int right){
        if(left>=right){
            dfs(mask,round+1,0,N);
        }
        else if((mask & (1<<left)) == 0){
            dfs(mask,round,left+1,right);
        }
        else if((mask&(1<<right)) == 0){
            dfs(mask,round,left,right-1);
        }
        else if(left==fp && right==sp){
            max=Math.max(max,round);
            min=Math.min(min,round);
        }
        else if(left==fp || left==sp){
            dfs(mask^(1<<right),round,left+1,right-1);
        }
        else if(right==fp || right==sp){
            dfs(mask^(1<<left),round,left+1,right-1);
        }
        else{
            dfs(mask^(1<<left),round,left+1,right-1);
            dfs(mask^(1<<right),round,left+1,right-1); 
        }
    }
    public int[] earliestAndLatest(int n, int firstPlayer, int secondPlayer) {
        N=n-1;
        fp=firstPlayer-1;sp=secondPlayer-1;
        dfs((1<<n)-1,1,0,N);
        return new int[]{min,max};
    }
}

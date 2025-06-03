class Solution {
    public int maxCandies(int[] status, int[] candies, int[][] keys, int[][] containedBoxes, int[] initialBoxes) {
       Queue<Integer> q=new LinkedList<>();
       int tot=0;
       boolean vis[]=new boolean[status.length];
       for(int i:initialBoxes){
                q.add(i);
        }
       while(!q.isEmpty()){
            int cur=q.poll();
            if(status[cur]==1 && !vis[cur]){
                tot+=candies[cur];
                vis[cur]=true;
                for(int j:containedBoxes[cur]){
                    q.add(j);
                }
                for(int j:keys[cur]){
                    status[j]=1;
                }
            }
            else {
               if(!q.isEmpty()) q.add(cur);
            }
       }
       return tot;
    }
}

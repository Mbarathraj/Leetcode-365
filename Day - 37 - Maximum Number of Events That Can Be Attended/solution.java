class Solution {
    public int maxEvents(int[][] events) {
       Arrays.sort(events, (a, b) -> a[0] - b[0]);
       PriorityQueue<Integer> q=new PriorityQueue<>();
       int max=Integer.MIN_VALUE;
       for(int event[]:events){
        max=Math.max(max,event[1]);
       }
       int day=1,ind=0,res=0,n=events.length;
       while(day<=max){
        while(ind < n && day==events[ind][0]){
            q.add(events[ind][1]);
            ind++;
        }
        while(!q.isEmpty() && q.peek()<day){
            q.poll();
        }
        if(!q.isEmpty()){
            q.poll();
            res++;
        }
        day++;
       }
       return res;
    }
}

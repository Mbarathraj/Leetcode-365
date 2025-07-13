class Solution {
    public int mostBooked(int n, int[][] meetings) {
        PriorityQueue<Long []> occupiedRooms=new PriorityQueue<>(Comparator.comparingLong(a -> a[1]));
        PriorityQueue<Long> freeRooms=new PriorityQueue<>();
        Arrays.sort(meetings,(a, b) -> a[0]-b[0]);
        int a[]=new int[n];
        for(long i=0;i<n;i++){
            freeRooms.add(i);
        }
        long curTime=0;
        for(int i=0;i<meetings.length;i++){
            curTime=(long)Math.max(curTime,meetings[i][0]);
            if(freeRooms.isEmpty()){
                curTime=(long)Math.max(curTime,occupiedRooms.peek()[1]);
            }
            while(!occupiedRooms.isEmpty() && occupiedRooms.peek()[1]<=curTime){
                freeRooms.add((long)occupiedRooms.peek()[2]);
                occupiedRooms.poll();
            }
            long roomId=freeRooms.poll();
            a[(int)roomId]+=1;
            occupiedRooms.add(new Long[]{curTime,curTime+(long)(meetings[i][1]-meetings[i][0]),roomId});
        }
       int max=a[0],maxIndex=0;
       for(int i=0;i<n;i++){
        if(max<a[i]){
            max=a[i];
            maxIndex=i;
        }
       }
       return maxIndex;
        
    }
}

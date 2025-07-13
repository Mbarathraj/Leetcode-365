class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);
        int left=0,right=0,c=0;
        int pl=players.length,tl=trainers.length;
          while(left<pl && right<tl){
            if(players[left]<=trainers[right]){
                left++;c++;
            }
            right++;
        }
        return c;
    }
}

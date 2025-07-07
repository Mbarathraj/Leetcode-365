class Solution {
    public char kthCharacter(long k, int[] ope) {
        long length=1; 
        int lastUsefulIndex=0;
        for(int i=0;i<ope.length;i++){
            length *= 2;
            if(length >= k){
                lastUsefulIndex=i;
                break;
            }
        }  

        int shiftCount=0;
        for (int i = lastUsefulIndex; i >= 0; i--) {
            length /= 2;

            if (k > length) {
                k -= length;
                if (ope[i] == 1) {
                    shiftCount++;
                }
            }
        }
      
        return (char) ('a' + (shiftCount % 26));
    }
}

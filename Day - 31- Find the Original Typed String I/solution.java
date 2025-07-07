class Solution {
    public int possibleStringCount(String word) {
       int res=0;
       char prev=word.charAt(0);
       for(int i=1;i<word.length();i++){
            char curr=word.charAt(i);
            if(prev==curr) res++;
            prev=curr;
       }
       return res+1;
    }
}

class Solution {
    public int maxDifference(String s) {
       int a[]=new int[26];
       for(char c:s.toCharArray()){
        a[c-'a']++;
       }
       int o=Integer.MIN_VALUE,e=Integer.MAX_VALUE;
     
       for(int i:a){
          if(i%2!=0) o=Math.max(o,i);
          else  e=i!=0 ? Math.min(e,i):e;
       }
       return o-e;
    }
}

class Solution {
    public int longestSubsequence(String s, int k) {
        if(s.length()==1 || s.length()==0) return 1;
        StringBuilder str=new StringBuilder();
        int max=Integer.MIN_VALUE;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            str.append(c);
            int val=StringBinaryToDecimal(str.toString());
                if(val>k){
                    str.deleteCharAt(str.indexOf("1"));
                }
            max=Math.max(max,str.length());
        }
        return max;
    }
    public static int StringBinaryToDecimal(String s)
    {
        int ans = 0, i, p = 0;

        // length of String
        int len = s.length();

        // Traversing the String
        for (i = len - 1; i >= 0; i--) {

            if (s.charAt(i) == '1') {
                // Calculating Decimal Number
                ans += Math.pow(2, p);
            }
            // incrementing value of p
            p++;
        }
        return ans;
    }
}

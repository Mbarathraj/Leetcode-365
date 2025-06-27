class Solution {
    public String[] divideString(String s, int k, char fill) {
        int t=s.length();
        StringBuilder temp=new StringBuilder();
        while(t%k!=0) {
            t++;
            temp.append(fill);
        }
        String a[]=new String[t/k];
        int c=0;
        for(int i=0;i<s.length();i+=k){
            a[c++]=s.substring(i,i+k <s.length() ?i+k : s.length());
        }
        if(!temp.equals("")) a[t/k-1]+=temp.toString();
        return a;
        
    }
}

class Solution {
    public String makeFancyString(String s) {
        StringBuilder str=new StringBuilder();
        str.append(""+s.charAt(0));
        char prev=s.charAt(0);
        int count=1;
        int len=s.length();
        for(int i=1;i<len;i++){
            char c=s.charAt(i);
            if(prev==c){
                count++;
                if(count<3) str.append(c);
            }
            else{
                str.append(c);
                count=1;
            }
            prev=c;
        }
        return str.toString();
    }
}

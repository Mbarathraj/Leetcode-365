class Solution {
    public int maxDiff(int num) {
        String str=Integer.toString(num);
        char first_non_nine='9';
        char first_non_one='1';
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if( first_non_one!='1' && first_non_nine!='9') break;
            if(first_non_nine=='9' && c!='9') first_non_nine=c;
            if(first_non_one=='1' && c!='1'&& c!='0')  first_non_one=c;
        }
        StringBuilder s1=new StringBuilder();
        StringBuilder s2=new StringBuilder();
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(c==first_non_nine){
                s1.append("9");
            }
            else s1.append(c);
            if(c==first_non_one) s2.append(str.charAt(0)=='1' && first_non_one!='1'? "0":"1");
            else s2.append(c);
        }
        return Integer.parseInt(s1.toString())-Integer.parseInt(s2.toString());
    }
}

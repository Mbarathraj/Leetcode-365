class Solution {
    public int minMaxDifference(int num) {
        String str=Integer.toString(num);
        StringBuilder st=new StringBuilder();
        StringBuilder st1=new StringBuilder();
        char first_non_nine='9';
        char first_non_zero='0';
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(first_non_nine!='9' && first_non_zero!='0') break;
            if(first_non_nine=='9' && c!='9') first_non_nine=c;
            if(first_non_zero=='0' && c!='0') first_non_zero=c;
        }
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(c==first_non_nine) st.append("9");
            else st.append(c);
            if(c==first_non_zero) st1.append("0");
            else st1.append(c);
        }
        return Integer.parseInt(st.toString())-Integer.parseInt(st1.toString());
    }
}

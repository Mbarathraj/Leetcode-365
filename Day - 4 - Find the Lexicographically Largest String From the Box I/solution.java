class Solution {
    public String answerString(String word, int numFriends) {
        int len=word.length()-numFriends+1;
        String res="";
        if(numFriends==1) return word;
        for(int i=0;i<=word.length();i++){
            String temp="";
            if(i+len>word.length()) temp=word.substring(i);
            else temp=word.substring(i,i+len);
            if(temp.compareTo(res) > 0){
                res=temp;
            }
        }
       return res;
    }
}

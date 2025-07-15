class Solution {
    public boolean isValid(String word) {
        boolean v=false,cons=false;
        String vow="aeiouAEIOU";
        if(word.length()<3) return false;
        for(char c:word.toCharArray()){
            if(!Character.isLetterOrDigit(c)) return false;
            else{
                if(!Character.isDigit(c)){
                    if(vow.contains(""+c)) v=true;
                    else cons=true;
                }
            }
        }
        return v && cons;
    }
}

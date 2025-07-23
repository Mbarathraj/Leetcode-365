class Solution {
    public int maximumGain(String s, int x, int y) {
        int maxVal=0;
        int minVal=0;
        char maxChar='0';
        char minChar='0';
        if(x>y){
            maxVal=x;
            minVal=y;
            maxChar='a';
            minChar='b';
        }
        else{
            maxVal=y;
            minVal=x;
            maxChar='b';
            minChar='a';
        }
        
        int minCharCount=0;
        int maxCharCount=0;
        int tot=0;
        int len=s.length();
        for(int i=0;i<len;i++){
            char c=s.charAt(i);
            if(c!=minChar && c!=maxChar){
                 tot+= Math.min(maxCharCount,minCharCount)*minVal;
                minCharCount=0;
                maxCharCount=0;
            }
            else if(c==minChar && maxCharCount > 0){
                tot+= maxVal;
                maxCharCount--;
            }
            else if(c==minChar) minCharCount++;
            else maxCharCount++;
        }
        tot+= Math.min(maxCharCount,minCharCount)*minVal;
        return tot;
    }
}

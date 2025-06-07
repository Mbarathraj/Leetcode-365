class Solution {
    public String clearStars(String s) {
        HashMap<Character,List<Integer>> map=new HashMap<>();
        char []c=s.toCharArray();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='*'){
                for(char j='a';j<='z';j++){
                    if(map.containsKey(j) && map.get(j).size()!=0){
                        c[map.get(j).get(map.get(j).size()-1)]='*';
                        map.get(j).removeLast();
                        break;
                    }
                }
        }
        else map.computeIfAbsent(s.charAt(i),k->new ArrayList<>()).add(i);
        }
        StringBuilder str=new StringBuilder();
        for(char c1:c){
            if(c1!='*') str.append(c1);
        }
        return str.toString();
    }
}

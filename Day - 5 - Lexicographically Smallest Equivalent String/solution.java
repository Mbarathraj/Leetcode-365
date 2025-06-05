class Solution {
    public String smallestEquivalentString(String s1, String s2, String baseStr) {
        HashMap<Character,HashSet<Character>> map=new HashMap<>();
        for(int i=0;i<s1.length();i++){
           map.computeIfAbsent(s1.charAt(i), k -> new HashSet<>()).add(s2.charAt(i));
           map.computeIfAbsent(s2.charAt(i), k -> new HashSet<>()).add(s1.charAt(i));
        }
        StringBuilder str=new StringBuilder();
        for(int i=0;i<baseStr.length();i++){
            char c=baseStr.charAt(i);
            Queue<Character> q=new LinkedList<>();
            q.add(c);
            TreeSet<Character> set=new TreeSet<>();
            while(!q.isEmpty()){
                char t=q.poll();
                if(set.add(t) && map.containsKey(t)){  
                for(char c1:map.get(t)){
                    q.add(c1);
                 }
                }
            }
            str.append(set.iterator().next());
        }
        return str.toString();
    }
}

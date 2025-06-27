class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        ArrayList<Integer> li=new ArrayList<>();
        ArrayList<Integer> res=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==key) li.add(i);
        }
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<li.size();j++){
                if(Math.abs(i-li.get(j))<=k){
                    res.add(i);
                    break;
                } 
            }
        }
        return res;
    }
}

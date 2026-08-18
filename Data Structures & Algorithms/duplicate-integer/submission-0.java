class Solution {
    public boolean hasDuplicate(int[] nums) {
        int n=nums.length;
        Set<Integer> set=new HashSet<>();
        for(int x:nums){
            set.add(x);
        }
        int y=set.size();
        if(n==y){
            return false;
        }
        return true;
    }
}
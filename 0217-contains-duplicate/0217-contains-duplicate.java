class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> n = new HashSet<>();
        for(int i =0;i<nums.length;i++){
            if(!n.add(nums[i])){
                return true;
            }
        }
        return false;
        
    }
}
class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap <Integer,Integer> a = new HashMap<>();

        for(int i =0;i<nums.length;i++){
            int num =target - nums[i];
            if(a.containsKey(num)){
                return new int[]{a.get(num),i};
            }
            a.put(nums[i],i);
        }        

        return new int[]{};
    }
}
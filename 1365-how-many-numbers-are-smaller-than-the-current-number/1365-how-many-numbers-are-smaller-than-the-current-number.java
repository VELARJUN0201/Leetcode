class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] arr = new int[nums.length];
        for(int i =0; i<nums.length;i++){
            int sm=0;
            for(int j: nums){
                if(j<nums[i]){
                    sm++;
                }
            }
            arr[i]=sm;
        }
        return  arr;    
    }
}
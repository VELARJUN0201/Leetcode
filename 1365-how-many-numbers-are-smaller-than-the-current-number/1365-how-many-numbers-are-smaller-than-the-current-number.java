class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        ArrayList<Integer> num = new ArrayList<>();
        int sm ;
        for(int i : nums){
            sm=0;
            for(int j: nums){
                if(j<i){
                    sm++;
                }
            }
            num.add(sm);
        }
        int[] arr = new int[num.size()];
        for(int i = 0;i<arr.length;i++){
            arr[i]=num.get(i);
        }
        return  arr;
        
    }
}
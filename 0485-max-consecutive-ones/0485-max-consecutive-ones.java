class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int con=0,temp=0;
        for(int i : nums){
            if ( i==0){
                con=0;
                continue;
            }
            else{
                con++;
                if (con>temp){
                    temp = con;
                }

            }
        }
        return temp;
    }
}
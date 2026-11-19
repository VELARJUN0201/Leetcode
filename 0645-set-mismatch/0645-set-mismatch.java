class Solution {
    public int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);
    int n = -1;
    int m = 1;

    for (int i = 0; i < nums.length; i++) {
        if (i > 0 && nums[i] == nums[i - 1]) {
            n = nums[i];
        } else if (nums[i] == m) {
            m++;
        }
    }

    return new int[] { n,m };
        
    }
}
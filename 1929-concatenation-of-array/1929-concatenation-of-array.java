class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] num2 = Arrays.copyOf(nums,nums.length);
        int[] ans =IntStream.concat(Arrays.stream(nums), Arrays.stream(num2))
                        .toArray();
        return ans;
        
        
    }
}
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
       List<Integer> miss = new ArrayList<>();
        Arrays.sort(nums);

        int missing = 1;
        for (int n : nums) {
            if (n < missing || n > nums.length) {
                continue;
            }
            while (missing < n) {
                miss.add(missing++);
            }
            if (n == missing) {
                missing++;
            }
        }

        while (missing <= nums.length) {
            miss.add(missing++);
        }

        return miss;
    }
}
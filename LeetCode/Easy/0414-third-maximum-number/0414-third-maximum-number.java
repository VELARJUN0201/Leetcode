class Solution {
    public int thirdMax(int[] nums) {

        TreeSet<Integer> tree = new TreeSet<>();
        for(int i : nums){
            tree.add(i);
        }
        ArrayList<Integer> arr = new ArrayList<>(tree);
        int len = arr.size();
        if(len<3){
            return arr.get(len-1);
        }
        
        return arr.get(len-3);
    }
}
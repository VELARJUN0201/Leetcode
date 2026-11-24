class Solution {
    public int[] twoSum(int[] numbers, int target) {
         HashMap <Integer,Integer> a = new HashMap<>();

        for(int i =0;i<numbers.length;i++){
            int num =target - numbers[i];
            if(a.containsKey(num)){
                return new int[]{a.get(num)+1,i+1};
            }
            a.put(numbers[i],i);
        }        

        return new int[]{};
        
    }
}
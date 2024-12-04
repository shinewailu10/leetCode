class Solution {
    public int[] twoSum(int[] nums, int target) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++){
            for(int j = i+1; j< nums.length; j++){
                if (nums[i] + nums[j] == target){
                    result.add(i);
                    result.add(j);
                }
            }
        }
        return result.stream().mapToInt(Integer::intValue).toArray(); 
    }
}
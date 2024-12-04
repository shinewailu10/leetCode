class Solution {
    public int[] twoSum(int[] nums, int target) {
        List<Integer> result = new ArrayList<>();
        int start = 0;
        int end = nums.length -1;

        while(start < end){
                if (nums[start] + nums[end] == target){
                    result.add(start+1);
                    result.add(end+1);
                }if (nums[start] + nums[end] > target){
                    end--;
                }else{
                    start++;
                }
            }
        
        return result.stream().mapToInt(Integer::intValue).toArray(); 
    }
}
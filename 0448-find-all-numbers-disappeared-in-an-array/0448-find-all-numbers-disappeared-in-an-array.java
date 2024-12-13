class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
       boolean[] array1=new boolean[nums.length+1];

        for(int num:nums){
            array1[num]=true;
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= nums.length; i++) {
            if (!array1[i]) {
                list.add(i);
            }
        }
        return list;
    }
}
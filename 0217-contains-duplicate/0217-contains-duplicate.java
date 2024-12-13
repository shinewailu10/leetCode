class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> duplicate = new HashSet<>();
        for (int num : nums) {
            if (duplicate.contains(num))
                return true;
            duplicate.add(num);
        }
        return false;
    }
}
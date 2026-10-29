class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> s = new HashSet<>();

        for (int i = 0; i < nums.length; i++) 
        {
            int element = nums[i];
            if (s.contains(element)) {
                return true;
            }
            s.add(element);
        }

        return false;
    }
}
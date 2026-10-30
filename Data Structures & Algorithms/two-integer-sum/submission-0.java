class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Create a set from the numbers
        // for every number, deduct from target
        // check if exists in set,
        // return indices,
        // if not, continue;

        int[] pair = new int[2];
        HashSet<Integer> s = new HashSet<>();

        for (Integer i : nums) {
            s.add(i);
        } 

        for (int i = 0; i < nums.length; i++) {
            int look_for = target - nums[i];

            if (s.contains(look_for)) 
            {
                // found:
                pair[0] = i;

                for (int j = i; j < nums.length; j++) 
                {
                    int num = nums[j];
                    if (num == look_for) {
                        pair[1] = j;

                        return pair;
                    }
                }
            
            }
        }

        return null;
    }
}

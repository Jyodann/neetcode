class Solution {
    public int longestConsecutive(int[] nums) {
        // avoid extra work by checking if n -1 is part of set (means it is in the middle
        // of a list)

        Set<Integer> s = new HashSet<>();

        for (int num : nums) {
            s.add(num);
        }

        int longest = 0;

        for (Integer n : s) {
            if (s.contains(n - 1)) continue;
            int curr = 0;
            while (s.contains(n)) {
                curr++;
                n++;
            }

            longest = Math.max(longest, curr);
        }


        return longest;
    }
}

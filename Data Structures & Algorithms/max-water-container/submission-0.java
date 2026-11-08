class Solution {
    public int maxArea(int[] heights) {
        int idx_first = 0;
        int idx_second = heights.length - 1;

        int cur_max = Integer.MIN_VALUE;

        
        while (idx_first < idx_second) {
            int first_val = heights[idx_first];
            int second_val = heights[idx_second];
            int vol = (idx_second - idx_first) * Math.min(first_val, second_val);

            if (first_val > second_val) {
                idx_second--;
            } else {
                idx_first++;
            }
            cur_max = Math.max(cur_max, vol);
            System.out.println(cur_max);
        }
        return cur_max;
    }
}

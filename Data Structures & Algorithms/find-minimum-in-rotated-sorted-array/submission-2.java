class Solution {
    public int findMin(int[] nums) {
        // Set two pointers,
        // One at the first element,
        // one at the last element
        

        // while left element is larger than right element
        // we take r - l / 2, 
        // compare again until we get the lowest number
        int l = 0; 
        int r = nums.length - 1;

        while (l < r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] < nums[r]) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }

        return nums[l];
    }
}

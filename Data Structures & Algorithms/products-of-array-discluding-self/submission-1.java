class Solution {
    public int[] productExceptSelf(int[] nums) {
        // Set up sliding windows
        
        // do first expensive calculation, calculate product from i = 1 to end 
        // that will be the first value in the result
        int[] res = new int[nums.length];
        int cumulative = nums[0];
        int num_zeros = 0;
        if (cumulative == 0) {
            num_zeros++;
            cumulative = 1;
        }
        
        for (int i = 1; i < nums.length; i++) {
            int curr = nums[i];
            if (curr == 0) {
                curr = 1;
                num_zeros++;
            }
            cumulative *= curr;
        }

        if (num_zeros > 1) {
            res[0] = 0;
        } else if (num_zeros == 1) {
            if (nums[0] == 0) {
                res[0] = cumulative;
            } else {
                res[0] = 0;
            }
        } else {
            cumulative /= nums[0];
            res[0] = cumulative;
        }

        for (int i = 1; i < nums.length; i++) {
            if (num_zeros > 1) {
                res[i] = 0;
                continue;
            }

            if (num_zeros == 1) {
                if (nums[i] == 0) {
                    res[i] = cumulative;
                } else {
                    res[i] = 0;
                }
                
                continue;
            }
            cumulative = cumulative * (nums[i - 1]) / nums[i];
            res[i] = cumulative; 
        }


        // loop through from i = 1 to lengh of nums
        // for every number, divide the value by current index, and multiply
        // by index - 1

        return res;

    }
}  

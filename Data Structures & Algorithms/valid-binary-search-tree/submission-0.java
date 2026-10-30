/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public boolean isValidBST(TreeNode root) {
        // recursively explore left,
        // then right

        if (root == null) {
            // Base case: Reached foot of tree
            return true;
        }
        int curr = root.val;

        TreeNode left   = root.left;
        TreeNode right  = root.right;

        if (!isValidLeft(left, curr) || !isValidRight(right, curr)) {
            return false;
        }
        return true;
    }

    public boolean isValidRight(TreeNode root, int limit) {
        if (root == null) {
            return true;
        }

        int val = root.val;
        if (val < limit) {
            return false;
        }
        

        return isValidLeft(root.left, val) && isValidRight(root.right, val);
    }
    public boolean isValidLeft(TreeNode root, int limit) {
        if (root == null) {
            return true;
        }
        int val = root.val;
        if (val > limit) {
            return false;
        }

        return isValidLeft(root.left, val) && isValidRight(root.right, val);
    }
}

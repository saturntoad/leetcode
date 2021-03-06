/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public int maxDepth(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if (root == null)
            return 0;
        if (root.left == null && root.right == null)
            return 1;
        if (root.left == null)
            return maxDepth(root.right) + 1;
        if (root.right == null)
            return maxDepth(root.left) + 1;
        int leftPathDepth = maxDepth(root.left) + 1;
        int rightPathDepth = maxDepth(root.right) + 1;
        return leftPathDepth > rightPathDepth ? leftPathDepth : rightPathDepth;
    }
}
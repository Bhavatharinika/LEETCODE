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
     int ms = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root){
        maxsum(root);
        return ms;
    }
    public int maxsum(TreeNode root) {
        if(root == null) return 0;

        int left = Math.max(0, maxsum(root.left));
        int right = Math.max(0, maxsum(root.right));

        int cs = root.val + left + right;

        ms = Math.max(cs,ms);

        return root.val + Math.max(left,right);
    }
}
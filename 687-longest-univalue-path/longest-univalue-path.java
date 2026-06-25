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
    int max = 0;
    public int longestUnivaluePath(TreeNode root) {
        helper(root);
        return max;
    }

    public int helper(TreeNode root){
        if(root == null) return 0;

        int left = helper(root.left);
        int right = helper(root.right);

        int lp = 0;
        int rp = 0;

        if(root.left!=null && root.left.val==root.val){
            lp=left+1;
        }

        if(root.right!=null && root.right.val==root.val){
            rp=right+1;
        }
        max = Math.max(max,lp+rp);

        return Math.max(lp,rp);
    }
}
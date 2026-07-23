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
    int[]Height = new int[100001];
    int[]ans = new int[100001];
    public int height(TreeNode root){
        if(root == null) return -1;
        int left = height(root.left);
        int right = height(root.right);

        Height[root.val] = 1+Math.max(left,right);
        return Height[root.val];
    }

    public void dfs(TreeNode root,int depth,int max){
        if(root==null) return;
        ans[root.val]=max;

        if(root.left!=null){
            int righth = (root.right==null)?-1:Height[root.right.val];
            dfs(root.left,depth+1,Math.max(max,depth+1+righth));
        }

        if(root.right!=null){
            int lefth = (root.left==null) ? -1:Height[root.left.val];
            dfs(root.right,depth+1,Math.max(max,depth+1+lefth));
        }
    }
    public int[] treeQueries(TreeNode root, int[] queries) {
        height(root);
        dfs(root,0,0);
        int[]res = new int[queries.length];
        for(int i = 0;i<queries.length;i++){
            res[i]=ans[queries[i]];
        }
        return res;
    }
}
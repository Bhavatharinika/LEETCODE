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
    public int maxLevelSum(TreeNode root) {
        
        if(root == null) return 0;
        Queue<TreeNode>q = new LinkedList<>();
        q.add(root);
        int prev = Integer.MIN_VALUE;
        int maxlevel =0;
        int level =1;
        while(!q.isEmpty()){
            int size = q.size();
            int sum =0;
            for(int i = 0;i<size;i++){
                TreeNode cur = q.poll();
                sum+=cur.val;
               
                if(cur.left!=null) q.add(cur.left);
                if(cur.right!=null) q.add(cur.right);
            }

            if(prev < sum){
                prev = sum;
                maxlevel = level;
            }
            level++;
        }
        return maxlevel;
    }
}
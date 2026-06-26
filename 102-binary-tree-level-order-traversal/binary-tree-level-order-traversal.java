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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>>list = new ArrayList<>();
        level(root,list);
        return list;
    }

    public void level(TreeNode root,List<List<Integer>>list){

        if(root == null) return;
        Queue<TreeNode>q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            List<Integer>arr = new LinkedList<>();
            int size = q.size();

            for(int i = 0;i<size;i++){
                TreeNode cur = q.poll();

                arr.add(cur.val);

                if(cur.left!=null) q.add(cur.left);
                if(cur.right!=null) q.add(cur.right);
            }
         list.add(arr);
        }
    }
}
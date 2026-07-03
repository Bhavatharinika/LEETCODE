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
    List<Integer>list =new ArrayList<>();
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        if(root1 == null){
            helper(root2);
            return list;
        }
        if(root2==null){
            helper(root1);
            return list;
        }

        Queue<TreeNode>q = new LinkedList<>();
        Queue<TreeNode>q1 = new LinkedList<>();
        q.add(root1);
        q1.add(root2);

        while(!q.isEmpty()){
            TreeNode cur = q.poll();
            list.add(cur.val);

            if(cur.left!=null) q.add(cur.left);
            if(cur.right!=null) q.add(cur.right);
        }
          while(!q1.isEmpty()){
            TreeNode cur1 = q1.poll();
            list.add(cur1.val);

            if(cur1.left!=null) q1.add(cur1.left);
            if(cur1.right!=null) q1.add(cur1.right);
        }
        Collections.sort(list);
        return list;
    }

    public void helper(TreeNode root){
        if(root == null) return;
        list.add(root.val);
        helper(root.left);
        helper(root.right);
        Collections.sort(list);
    }
}
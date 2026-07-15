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
    HashMap<Integer,TreeNode>map = new HashMap<>();
    public TreeNode canMerge(List<TreeNode> trees) {
        for(TreeNode root : trees){
            map.put(root.val,root);
        }

        HashSet<Integer>set = new HashSet<>();
        for(TreeNode root : trees){
            if(root.left!=null) set.add(root.left.val);
            if(root.right!=null) set.add(root.right.val);
        }

        TreeNode start = null;
        for(TreeNode root:trees){
            if(!set.contains(root.val)){
                start = root;
                break;
            }
        }
        if(start==null) return null;
        map.remove(start.val);

        if(!dfs(start,Long.MIN_VALUE,Long.MAX_VALUE)) return null;
        if(!map.isEmpty()) return null;
        return start;
        }
        boolean dfs(TreeNode root,long min,long max){
            if(root==null) return true;
            if(root.val<=min || root.val>=max) return false;
            if(root.left == null && root.right == null && map.containsKey(root.val)){
            TreeNode merge = map.remove(root.val);
            root.left = merge.left;
            root.right = merge.right;
            } 

            return dfs(root.left,min,root.val) && dfs(root.right,root.val,max);
    }
}
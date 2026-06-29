/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    public TreeNode sortedListToBST(ListNode head) {
        if(head==null) return null;
        List<Integer>list = new ArrayList<>();
        while(head!=null){
        list.add(head.val);
        head = head.next;
        }
        return SortedArray(list);
    }

    public TreeNode SortedArray(List<Integer>nums){
        return build(nums,0,nums.size()-1);
    }

    public TreeNode build(List<Integer>nums,int low,int high){
        if(low<=high){
            int mid = (low+high)/2;
            TreeNode root = new TreeNode(nums.get(mid));
            root.left = build(nums,low,mid-1);
            root.right = build(nums,mid+1,high);

            return root;
        }
        return null;
    }
}
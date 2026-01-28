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
class Solution {
    public int pairSum(ListNode head) {
        
        ListNode fast = head;
        ListNode slow = head;

        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }

        ListNode prev = null;
        ListNode next = null;

        while(slow!=null){
            next=slow.next;
            slow.next=prev;
            prev=slow;
            slow=next;
        }

        int max =0;
        while(head!=null && prev!=null){
            max = Math.max(head.val+prev.val,max);
            prev=prev.next;
            head=head.next;
        }
        return max;
    }
}
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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }

        ListNode prev = null;
        ListNode temp = head;

        while(temp!=null && temp.next!=null)
        {
            if(temp.val==temp.next.val)
            {
                while(temp!=null && temp.next!=null && temp.val == temp.next.val)
                {
                    temp = temp.next;
                }
                if(prev == null){
                    head=temp.next;
                }
                else{
                    prev.next = temp.next;
                    temp = prev;
                }
            } else {
                if(prev==null){
                    prev = head;
                }
                else{
                prev = prev.next;
                }
            }
            temp = temp.next;
        }
        return head;
    }
}
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
    public ListNode deleteMiddle(ListNode head) {
        ListNode slow = head;
        ListNode pred = slow;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            pred=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        pred.link = slow.link;
        return head;
    }
}
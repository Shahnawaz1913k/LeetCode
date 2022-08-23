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
    public boolean isPalindrome(ListNode head) {
        if(head == null)
            return true;
        
        ListNode mid = middle(head);
        ListNode last = reverse(mid);
        ListNode curr = head;
        while(last!=null)
        {
            if(last.val != curr.val)
                return false;
            last = last.next;
            curr = curr.next;
        }
        return true;
    }
    ListNode middle(ListNode head)
    {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
    ListNode reverse(ListNode head)
    {
        if(head == null || head.next==null)
            return head;
        ListNode newhead = reverse(head.next);
        ListNode headNext = head.next;
        headNext.next = head;
        head.next = null;
        return newhead;
    }
}
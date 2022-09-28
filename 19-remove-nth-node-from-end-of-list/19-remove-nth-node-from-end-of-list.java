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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null || head.next==null){
            return null;
        }
        
        
        ListNode fast=head;
        ListNode slow =head;
        //ListNode temp=head;
        
       int count =0;
        while(fast!=null){
            count++;
            fast=fast.next;
            
        }
        int l=count-n;
        int i=1;
        if(n==count){
            return head.next;
        }
        
        while(i<l){
            slow=slow.next;
            i++;
        }
        
        
        slow.next=slow.next.next;
        return head;
    }
}
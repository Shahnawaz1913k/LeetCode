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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
      return list2;
    } else if (list2 == null) {
      return list1;
    }


    ListNode mergedHead = null;
    if (list1.val <= list2.val) {
      mergedHead = list1;
      list1 = list1.next;
    } else {
      mergedHead = list2;
      list2 = list2.next;
    }

    ListNode mergedTail = mergedHead;
  
    while (list1 != null && list2 != null) {
      ListNode temp = null;
      if (list1.val <= list2.val) {
        temp = list1;
        list1 = list1.next;
      } else {
        temp = list2;
        list2 = list2.next;
      }

      mergedTail.next = temp;
      mergedTail = temp;
    }

    if (list1 != null) {
      mergedTail.next = list1;
    } else if (list2 != null) {
      mergedTail.next = list2;
    }

    return mergedHead; 
    }
}
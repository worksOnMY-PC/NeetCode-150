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
    public void printList(ListNode head){
        if(head == null){
            return ;
        }
        while(head != null){
            System.out.println(head.val+" ");
            head = head.next;
        }
    }
    public ListNode reverseList(ListNode head){
        ListNode curr = head, prev = null, next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;

            prev = curr;
            curr = next;
        }
        return prev;
    }
    public void reorderList(ListNode head) {
         ListNode slow = head;
         ListNode fast = head;
         while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
         }
         ListNode firstHalf = head;
         ListNode secondHalf = slow.next;
         slow.next = null;

         secondHalf = reverseList(secondHalf);

        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
         while(firstHalf != null || secondHalf != null){
            if(firstHalf != null){
                curr.next = firstHalf;
                curr = curr.next;
                firstHalf = firstHalf.next;
            }
            if(secondHalf != null){
                curr.next = secondHalf;
                curr = curr.next;
                secondHalf = secondHalf.next;
            }
         }
    }
}
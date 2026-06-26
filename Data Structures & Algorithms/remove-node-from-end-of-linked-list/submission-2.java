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
 // 1, 2, 4, 5, 3 ,0
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        if(head.next == null){
            return null;
        }
        ListNode temp2 = head;
        ListNode temp1 = head;
        int i =1;
        while(temp1.next != null){
            temp1 = temp1.next;
            if(i > n){
                temp2= temp2.next;
            }
            i++;
        }
        if(n==i){
            return head.next;
        }

        ListNode next = temp2.next.next;
        temp2.next = null;
        temp2.next = next;
         return head;


    }
}

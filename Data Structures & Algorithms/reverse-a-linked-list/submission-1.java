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
//Output: [3,2,1,0]
// 2  3-null 
public class Solution {
    public ListNode reverseList(ListNode head) {
         

         if(head == null){
            return null;
         }
        ListNode currHead = head;
        if(head.next != null){
           currHead   = reverseList(head.next);
           head.next.next = head;
        }
        head.next = null;
        return currHead;
    }
}

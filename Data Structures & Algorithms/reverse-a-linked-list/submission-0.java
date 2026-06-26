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
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null){
          // curr =2 , prev3
          // curr = 2
          ListNode temp = curr.next;
          curr.next = prev;
          prev = curr;
          curr = temp;
        }
        return prev;
    }
}

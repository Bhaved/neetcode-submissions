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
        ListNode head1 = list1;
        ListNode head2 = list2;
        ListNode newList = null;
        ListNode temp = null;
        while(head1 != null || head2 != null ){
             ListNode newNode = null;
            if(head1 != null && head2 != null){
                if(head1.val >= head2.val){
                    newNode = head2;
                    head2= head2.next;
                }else{
                    newNode = head1; 
                    head1= head1.next;
                }
            }else{
                if(head1 != null){
                        newNode = head1;
                        head1= head1.next;  
                }
                else{
                        newNode = head2;
                        head2= head2.next;  
                }
            }
            if(newList == null){
                newList = newNode;
                temp = newNode;
            }else{
               temp.next = newNode;
               temp = temp.next; 
            }
        }
        return newList;
    }
}
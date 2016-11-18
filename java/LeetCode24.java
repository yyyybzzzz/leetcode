/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head==null){
            return head;
        }
        ListNode n1=head;
        ListNode n2=head.next;
        while(n2!=null){
            n1.val=n1.val^n2.val;
            n2.val=n1.val^n2.val;
            n1.val=n1.val^n2.val;
            n1=n2.next;
            if(n1==null){
                break;
            }
            n2=n1.next;
        }
        return head;
    }
}
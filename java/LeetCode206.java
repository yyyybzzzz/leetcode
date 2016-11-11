/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null){
            return head;
        }
        ListNode node=head;
        ListNode preNode=head;
        while(head.next!=null){
            node=head.next;
            head.next=node.next;
            node.next=preNode;
            preNode=node;
        }
        head.next=null;
        return preNode;
    }
}
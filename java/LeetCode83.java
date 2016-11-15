/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode node=head.next;
        ListNode pre=head;
        while(node!=null){
            if(node.val==pre.val){
                pre.next=node.next;
            }else{
                pre=pre.next;
            }
            node=node.next;
        }
        return head;
    }
}




/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null){
            return head;
        }
        ListNode node=head;
        while(node.next!=null){
            if(node.val==node.next.val){
                node.next=node.next.next;
            }else{
                node=node.next;
            }
        }
        return head;
    }
}
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode l=new ListNode(0);
        ListNode ll=l;
        while(l1!=null&&l2!=null){
            if(l1.val<l2.val){
                ll.next=l1;
                l1=l1.next;
            }else{
                ll.next=l2;
                l2=l2.next;
            }
            ll=ll.next;
        }
        ll.next=(l1!=null)?l1:l2;
        return l.next;
    }
}
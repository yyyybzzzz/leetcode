/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head==null||head.next==null){
            return false;
        }
        ListNode faster=head ,slower=head; 
        while(slower.next!=null&&faster!=null&&faster.next!=null){
            slower=slower.next;
           faster=faster.next.next;
           if(slower==faster){
               return true;
           }
        }
        return false;
    }
}
/**
 * @author : Anmol Agrawal
 */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode ans = new ListNode(0);
        ListNode head = ans;
        while(true){
            if(l1 == null && l2 == null){
                break;
            }
            if(l1 == null){
                ans.next = l2;
                break;
            }
            if(l2 == null){
                ans.next = l1;
                break;
            }
            if(l1.val < l2.val){
                ans.next = new ListNode(l1.val);
                l1 = l1.next;
            }
            else{
                ans.next = new ListNode(l2.val);
                l2 = l2.next;
            }
            ans = ans.next;
        }
        return head.next;
    }
}
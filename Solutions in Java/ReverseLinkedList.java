/**
 * @author : Anmol Agrawal
 */
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
    public ListNode reverseList(ListNode head) {
        if(head == null){
            return head;
        }
        ListNode curr = head;
        while(curr.next != null){
            ListNode temp = curr.next;
            curr.next = temp.next;
            temp.next = head;
            head = temp;
        }
        return head;
    }
}
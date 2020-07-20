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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = new ListNode(0);
        temp.next = head;
        ListNode temp2 = new ListNode(0);
        temp2.next = head;
        head = temp2;
        int count = -1;
        while(temp != null)
        {
            count++;
            temp = temp.next;
            if(count > n){
                temp2 = temp2.next;
            }
        }
        temp2.next = temp2.next.next;
        return head.next;
    }
}
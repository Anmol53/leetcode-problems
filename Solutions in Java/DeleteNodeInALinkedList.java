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
    public void deleteNode(ListNode node) {
        ListNode backup = new ListNode(0);
        while(node.next != null){
            node.val = node.next.val;
            backup = node;
            node = node.next;
        }
        backup.next = null;
    }
}
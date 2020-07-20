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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans = new ListNode(0);
        ListNode answer = ans;
        int carry = 0;
        while(true){
            int sum = l1.val + l2.val + carry;
            ans.next = new ListNode(sum % 10);
            carry = sum / 10;
            ans = ans.next;
            if(l1.next == null && l2.next == null){
                break;
            }
            if(l1.next != null){
                l1 = l1.next;
            }
            else{
                l1.val = 0;
            }
            if(l2.next != null){
                l2= l2.next;
            }
            else{
                l2.val = 0;
            }
        }
        if(carry != 0){
            ans.next = new ListNode(carry);
        }
        return answer.next;
    }
}

/**
 * @author : Anmol Agrawal
 */
/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} head
 * @param {number} n
 * @return {ListNode}
 */
var removeNthFromEnd = function(head, n) {
    let temp = new ListNode(0, head);
    let temp2 = new ListNode(0, head);
    head = temp2;
    let count = -1;
    while(temp != null){
        count++;
        temp = temp.next;
        if(count > n){
            temp2 = temp2.next;
        }
    }
    temp2.next = temp2.next.next;
    return head.next;
};
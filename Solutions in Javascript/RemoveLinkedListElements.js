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
 * @param {number} val
 * @return {ListNode}
 */
var removeElements = function(head, val) {
    while(head != null && head.val == val){
        head = head.next;
    }
    let node = head;
    while(node != null){
        if(node.next != null && node.next.val === val){
            node.next = node.next.next;
        }
        else{
            node = node.next;
        }
    }
    return head;
};
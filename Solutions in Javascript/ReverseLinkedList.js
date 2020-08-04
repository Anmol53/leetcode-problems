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
 * @return {ListNode}
 */
var reverseList = function(head) {
    if(head === null){
        return head;
    }
    let curr = head;
    while(curr.next != null){
        let temp = curr.next;
        curr.next = temp.next;
        temp.next = head;
        head = temp;
    }
    return head;
};
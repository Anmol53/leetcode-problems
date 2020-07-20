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
 * @param {ListNode} l1
 * @param {ListNode} l2
 * @return {ListNode}
 */
var mergeTwoLists = function(l1, l2) {
    let ans = new ListNode(0);
    let head = ans;
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
};
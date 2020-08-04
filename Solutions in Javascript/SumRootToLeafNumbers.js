/**
 * @author : Anmol Agrawal
 */
/**
 * Definition for a binary tree node.
 * function TreeNode(val, left, right) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.left = (left===undefined ? null : left)
 *     this.right = (right===undefined ? null : right)
 * }
 */
/**
 * @param {TreeNode} root
 * @return {number}
 */
let ans;
var sum = function(node, val){
    if(node === null){
        return;
    }
    val *= 10;
    val += node.val;
    if(node.left == null && node.right == null){
        ans += val;
    }
    sum(node.left, val);
    sum(node.right, val);
}
var sumNumbers = function(root) {
    ans = 0;
    sum(root, 0);
    return ans;
};
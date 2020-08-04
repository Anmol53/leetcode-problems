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
 * @param {number} k
 * @return {number}
 */
let ith;
let ans;
let isFind;
var inorder = function(node, k){
    if(isFind){
        return;
    }
    if(node === null){
        return;
    }
    inorder(node.left, k);
    ith++;
    if(ith === k){
        ans = node.val;
        isFind = true;
        return;
    }
    inorder(node.right, k);
}
var kthSmallest = function(root, k) {
    ith = 0;
    ans = 0;
    isFind = false;
    inorder(root, k);
    return ans;
};

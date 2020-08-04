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
 * @param {number[]} inorder
 * @param {number[]} postorder
 * @return {TreeNode}
 */
let hm = new Map();
let set = new Set();
var util = function(inorder, postorder, l, r, n){
    if(n < 0){
        return null;
    }
    let value = postorder[n];
    if(set.has(value)){
        return null;
    }
    set.add(value);
    return new TreeNode(value, util(inorder, postorder, l, hm.get(value) - 1, n - (r - hm.get(value)) - 1), util(inorder, postorder, hm.get(value) + 1, r, n - 1));
}
var buildTree = function(inorder, postorder) {
    hm.clear();
    set.clear();
    let n = inorder.length;
    for(let i = 0; i < n; i++){
        hm.set(inorder[i], i);
    }
    return util(inorder, postorder, 0, n - 1, n - 1);
};

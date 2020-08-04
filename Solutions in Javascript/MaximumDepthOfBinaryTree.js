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
let depth = 0;
var calculateDepth = function(node, level){
    if (node === null)
        return;
    if(level > depth){
        depth = level;
    }
    calculateDepth(node.left, level + 1);
    calculateDepth(node.right, level + 1);
}
var maxDepth = function(root) {
    depth = 0;
    calculateDepth(root, 1);
    return depth;
};
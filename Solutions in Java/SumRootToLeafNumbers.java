/**
 * @author : Anmol Agrawal
 */
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int ans;
    void sum(TreeNode node, int val){
        if(node == null){
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
    public int sumNumbers(TreeNode root) {
        ans = 0;
        sum(root, 0);
        return ans;
    }
}
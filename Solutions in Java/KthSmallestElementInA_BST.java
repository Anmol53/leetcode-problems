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
    int ith;
    int ans;
    boolean isFind;
    void inorder(TreeNode node, int k){
        if(isFind){
            return;
        }
        if(node == null){
            return;
        }
        inorder(node.left, k);
        ith++;
        if(ith == k){
            ans = node.val;
            isFind = true;
            return;
        }
        inorder(node.right, k);
    }
    public int kthSmallest(TreeNode root, int k) {
        ith = 0;
        ans = 0;
        inorder(root, k);
        return ans;
    }
}
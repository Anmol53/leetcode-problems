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
    int depth = 0;
	void calculateDepth(TreeNode node, int level){
		if (node == null)
			return;
        if(level > depth){
            depth = level;
        }
		calculateDepth(node.left, level + 1);
		calculateDepth(node.right, level + 1);
	}
    public int maxDepth(TreeNode root) {
        calculateDepth(root, 1);
        return depth;
    }
}
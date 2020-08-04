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
    Map<Integer, Integer> hm;
    Set<Integer> set;
    public TreeNode util(int[] inorder, int[] postorder, int l, int r, int n){
        if(n < 0){
            return null;
        }
        int value = postorder[n];
        if(set.contains(value)){
            return null;
        }
        set.add(value);
        TreeNode head = new TreeNode(value);
        head.left = util(inorder, postorder, l, hm.get(value) - 1, n - (r - hm.get(value)) - 1);
        head.right = util(inorder, postorder, hm.get(value) + 1, r, n - 1);
        return head;
    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        hm = new HashMap<>();
        set = new HashSet<>();
        int n = inorder.length;
        for(int i = 0; i < n; i++){
            hm.put(inorder[i], i);
        }
        return util(inorder, postorder, 0, n - 1, n - 1);
    }
}
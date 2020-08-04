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
    List<List<Integer>> al;
    public void add(TreeNode node, int level){
        if(node == null){
            return;
        }
        if(al.size() > level){
            List<Integer> ml = al.get(level);
            ml.add(node.val);
            al.set(level, ml);
        }
        else{
            List<Integer> ml = new ArrayList<Integer>();
            ml.add(node.val);
            al.add(ml);
        }
        add(node.left, level + 1);
        add(node.right, level + 1);
    }
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        al = new ArrayList<List<Integer>>();
        add(root, 0);
        for(int i = 0, j = al.size() - 1; i < j; i++, j--){
            List<Integer> temp = al.get(i);
            al.set(i, al.get(j));
            al.set(j, temp);
        }
        return al;
    }
}
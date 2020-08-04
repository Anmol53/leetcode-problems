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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null){
            return ans;
        }
        Stack<TreeNode> st = new Stack<>();
        st.push(root);
        int i = 0;
        while(!st.empty()){
            Stack<TreeNode> st1 = new Stack<>();
            List<Integer> le = new ArrayList<>();
            if(i == 0){
                while(!st.empty()){
                    TreeNode temp = st.pop();
                    le.add(temp.val);
                    if(temp.left != null){
                        st1.add(temp.left);
                    }
                    if(temp.right != null){
                        st1.add(temp.right);
                    }
                }
                i = 1;
            }
            else{
                while(!st.empty()){
                    TreeNode temp = st.pop();
                    le.add(temp.val);
                    if(temp.right != null){
                        st1.add(temp.right);
                    }
                    if(temp.left != null){
                        st1.add(temp.left);
                    }
                }
                i = 0;
            }
            ans.add(le);
            st.clear();
            st.addAll(st1);
        }
        return ans;
    }
}
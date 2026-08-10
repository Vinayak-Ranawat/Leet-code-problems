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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        levelorder(root, 0, ans);
        return ans;
    }
    public void levelorder(TreeNode node, int level, List<List<Integer>>ans){
        if(node == null) return;
        if (level == ans.size()) {
            ans.add(new ArrayList<>()); // sub list - first time visiting this level
        }
        ans.get(level).add(node.val);
        levelorder(node.left, level+1, ans);
        levelorder(node.right, level+1, ans);
    }
}
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
    List<Integer> num=new ArrayList<Integer>();
    public List<Integer> postorderTraversal(TreeNode root) {
        if(root==null){
            return num;
        }
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        num.add(root.val);
        return num;
        
    }
}
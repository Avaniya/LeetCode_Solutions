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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> arr=new ArrayList<>();
        Traversal(root,arr);
        return arr;
    }
    public List<Integer> Traversal(TreeNode root,List<Integer> arr){
        if(root==null){
            return null;
        }
        Traversal(root.left,arr);
        arr.add(root.val);
        Traversal(root.right,arr);
        return arr;

    }
}
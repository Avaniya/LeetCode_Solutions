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
    int count=0,val=0;

    public int kthSmallest(TreeNode root, int k) {
       val=find(root,k);
       return val;
    }
    private int find(TreeNode curr, int k){
        if(curr==null){
            return 0;
        }
        find(curr.left,k);
        count+=1;
        if(count==k){
            val=curr.val;
        }
        find(curr.right,k);
        return val;
    }
}
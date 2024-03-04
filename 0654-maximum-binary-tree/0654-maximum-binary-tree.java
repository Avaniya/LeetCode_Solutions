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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return generate(nums,0,nums.length-1);
    }
    private TreeNode generate(int[] nums,int l,int r){
        if(l>r){
            return null;
        }
        int curr=0;
        int max=Integer.MIN_VALUE;
        for(int i=l;i<=r;i++){
            if(nums[i]>max){
                max=nums[i];
                curr=i;
            }
        }
        TreeNode node=new TreeNode(nums[curr]);
        node.left=generate(nums,l,curr-1);
        node.right=generate(nums,curr+1,r);
        return node;

    }
}
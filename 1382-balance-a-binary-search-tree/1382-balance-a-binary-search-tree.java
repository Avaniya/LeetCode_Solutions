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
    int[] arr=new int[10000];
    int count=0;
    public TreeNode balanceBST(TreeNode root) {
        inorder(root);
        return balance(arr,0,count-1);
    }
    public TreeNode inorder(TreeNode curr){
        if(curr==null){
            return null;
        }
        inorder(curr.left);
        arr[count++]=curr.val;
        inorder(curr.right);
        return curr;
    }
    public TreeNode balance(int[] arr,int low,int high){
        if(low>high){
            return null;
        }
        int mid=(low+high)/2;
        TreeNode node=new TreeNode();
        node.val=arr[mid];
        node.left=balance(arr,low,mid-1);
        node.right=balance(arr,mid+1,high);
        return node;
        
    }

}
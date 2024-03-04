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
    public List<TreeNode> generateTrees(int n) {
        return generate(1,n);
    }
    private List<TreeNode> generate(int l,int r){
        List<TreeNode> res=new ArrayList<TreeNode>();
        if(l>r){
            res.add(null);
            return res;
        }
        for(int i=l;i<=r;i++){
            List<TreeNode> leftSubtree=generate(l,i-1);
            List<TreeNode> rightSubtree=generate(i+1,r);
            for(TreeNode left:leftSubtree){
                for(TreeNode right:rightSubtree){
                    TreeNode node=new TreeNode(i);
                    node.left=left;
                    node.right=right;
                    res.add(node);
                }
            }

        }
        return res;
    }

}
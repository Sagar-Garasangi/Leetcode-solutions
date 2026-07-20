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
     int dm=0;
    int maxdepth(TreeNode root){
        if(root==null)
        return 0;

        int left=maxdepth(root.left);
        int right=maxdepth(root.right);
        dm=Math.max(dm,left+right);

        return 1+Math.max(left,right);
    }
    public int diameterOfBinaryTree(TreeNode root) {
       
        maxdepth(root);
        return dm;

        
    }
}

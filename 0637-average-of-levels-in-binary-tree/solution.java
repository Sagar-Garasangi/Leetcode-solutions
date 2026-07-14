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
    public List<Double> averageOfLevels(TreeNode root) {

        List<Double> ans = new ArrayList<>();

        if (root == null)
            return ans;

        Queue<TreeNode> q = new ArrayDeque<>();

        q.offer(root);

        while (!q.isEmpty()) {

            int levelSize = q.size();
            double avg=0;
            double sum=0;

            for (int i = 0; i < levelSize; i++) {

                TreeNode node = q.poll();
                sum=sum+node.val;

                if (node.left != null)
                    q.offer(node.left);

                if (node.right != null)
                    q.offer(node.right);
            }

            ans.add(sum/levelSize);
        }

        return ans;
    }
}
        

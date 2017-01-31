/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root!=null)
        return sum(root,sum);
        return false;
    }
    public boolean sum(TreeNode n,int sum){
        if(n==null){
            return false;
        }else if(sum-n.val==0&&n.right==null&&n.left==null){
            return true;
        }
        return sum(n.left,sum-n.val)||sum(n.right,sum-n.val);
    }
}
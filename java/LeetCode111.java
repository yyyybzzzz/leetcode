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
    public int minDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        return depth(root,1);
    }
    public int depth(TreeNode root,int depth){
        if(root==null){
            return Integer.MAX_VALUE;
        }else if(root.left==null&&root.right==null){
            return depth;
        }
        return Math.min(depth(root.left,depth+1),depth(root.right,depth+1));
    }
}




public class Solution {
    public int minDepth(TreeNode root) {
        if(root==null)return 0;
        int left=minDepth(root.left);
        int right=minDepth(root.right);
        return (left==0||right==0)?left+right+1:Math.min(left,right)+1;
    }
}
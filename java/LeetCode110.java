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
    public boolean isBalanced(TreeNode root) {
        if(root==null){
            return true;
        }else{
            int l=getDepth(root.left,0);
            int r=getDepth(root.right,0);
            if(Math.abs(l-r)<=1){
                return isBalanced(root.left)&&isBalanced(root.right);
            }else{
                return false;
            }
        }
    }
    public int getDepth(TreeNode root,int d){
        if(root==null){
            return d;
        }
        int l=getDepth(root.left,d+1);
        int r=getDepth(root.right,d+1);
        return l>r?l:r;
    }
    
}
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
    public boolean isSymmetric(TreeNode root) {
        if(root==null) return true;
        return check(root.left,root.right);
    }
    public boolean check(TreeNode t1,TreeNode t2){
        if(t1==null&&t2==null){
            return true;
        }else if(t1==null||t2==null){
            return false;
        }
        if(t1.val!=t2.val){
            return false;
        }else{
            return check(t1.right,t2.left)&&check(t2.right,t1.left);
        }
    }
}
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
    int sum=0;
    public int sumOfLeftLeaves(TreeNode root) {
        if(root!=null){
            sum(root,0);
        }
        return sum;
    }
    public void sum(TreeNode root,int sign){
       if(root.left==null&&root.right==null){
           if(sign==1){
               sum+=root.val;
           }
       }
       if(root.left!=null){
        sum(root.left,1);
       }
       if(root.right!=null){
        sum(root.right,2);
       }
       
    }
}
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
    public boolean isSameTree(TreeNode p, TreeNode q) {
         return compare(p,q);
    }
    public boolean compare(TreeNode p, TreeNode q){
        if(p!=null&&q!=null){
            if(p.val==q.val){
                return true&&compare(p.left,q.left)&&compare(p.right,q.right);
            }else{
                return false;
            }
        }else if(p==null&&q==null){
            return true;
        }else{
            return false;
        }
        
    }
}
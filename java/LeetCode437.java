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
    int res=0;
    public int pathSum(TreeNode root, int sum) {
        if(root==null){
            return 0; //判断是否到叶子节点，如果到达叶子节点 则开始计算
        }
        pathSum(root.left,-1);
        pathSum(root.right,-1);
        helper(root,sum);//遍历树的所有节点 计算每条路径的和
        return res;
    }
    public void helper(TreeNode root, int sum){//以root为根  计算每一条路径的和 有两种选择 左转或右转
        if(root==null){
            return;
        }
        if(sum-root.val==0){
            res++; 
        }
        helper(root.left,sum-root.val);
        helper(root.right,sum-root.val);
    }
}
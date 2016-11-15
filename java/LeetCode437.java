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
            return 0; //�ж��Ƿ�Ҷ�ӽڵ㣬�������Ҷ�ӽڵ� ��ʼ����
        }
        pathSum(root.left,-1);
        pathSum(root.right,-1);
        helper(root,sum);//�����������нڵ� ����ÿ��·���ĺ�
        return res;
    }
    public void helper(TreeNode root, int sum){//��rootΪ��  ����ÿһ��·���ĺ� ������ѡ�� ��ת����ת
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
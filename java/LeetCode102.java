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
    private List<List<Integer>> list=new ArrayList<List<Integer>>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        test(root,0);
        return list;
    }
    public void test(TreeNode root,int depth){
        if(root==null){
            return;
        }
        if(depth>=list.size()){
           list.add(new ArrayList<Integer>()); 
        }
        list.get(depth).add(root.val);
        test(root.left,depth+1);
        test(root.right,depth+1);
    }
}
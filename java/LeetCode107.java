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
    List<List<Integer>>list=new ArrayList<List<Integer>>();
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        add(root,0);
        Collections.reverse(list);
        return list;
    }
    public void add(TreeNode root,int level){
        if(root==null){
            return;
        }
        if(level>=list.size()){
            List<Integer>l=new ArrayList<Integer>();
            l.add(root.val);
            list.add(l);
        }else{
            list.get(level).add(root.val);
        }
        level++;
        add(root.left,level);
        add(root.right,level);
        
    }
}
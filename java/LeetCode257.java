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
    private List<String> list=new ArrayList<String>();
    public List<String> binaryTreePaths(TreeNode root) {
        find(root,"");
        return list;
    }
    public void find(TreeNode root,String path){
        if(root==null){
            return;
        }
        path+=(root.val+"->");
        find(root.left,path);
        find(root.right,path);
        if(root.left==null&&root.right==null){
            list.add(path.substring(0,path.length()-2));
        }
        
    }
}
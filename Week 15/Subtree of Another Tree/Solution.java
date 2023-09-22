/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

 class Solution {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        return isSubtreeR(root, subRoot);
    }
     public static boolean isIdentical(TreeNode root,TreeNode subRoot){
        if(root==null && subRoot==null){
            return true;
        }
        else if(root==null || subRoot==null || root.val!=subRoot.val){
            return false;
        }
        if(!isIdentical(root.left, subRoot.left)){
            return false;
        }
        if(!isIdentical(root.right, subRoot.right)){
            return false;
        }
        return true;
    }
    public static boolean isSubtreeR(TreeNode root,TreeNode subRoot){
        if(root==null){
            return false;
        }
        if(root.val==subRoot.val){
            if(isIdentical(root,subRoot)){
                return true;
            }
        }
        boolean left=isSubtreeR(root.left, subRoot);
        boolean right=isSubtreeR(root.right, subRoot);
        return left||right;//if subtree doesn't exsits in root then we neet to check in left and right subtree recursively so || is used because if subTree exsits in left / right we need to return  true
    }
}
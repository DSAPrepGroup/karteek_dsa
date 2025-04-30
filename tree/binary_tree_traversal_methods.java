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
    public List<Integer> postorderTraversal(TreeNode root) {

        List<Integer> result = new ArrayList<>();
        postorder_helper_function(root, result);
        return result;
        
    }

    private void postorder_helper_function(TreeNode input, List<Integer> list){

        if(input == null){
            return;
        }

        postorder_helper_function(input.left, list);
        postorder_helper_function(input.right, list);
        list.add(input.val);

    }

    private void preorder_helper_function(TreeNode input, List<Integer> list){

        if(input == null){
            return;
        }

        list.add(input.val);
        preorder_helper_function(input.left, list);
        preorder_helper_function(input.right, list);

    }

    private void inorder_helper_function(TreeNode input, List<Integer> list){

        if(input == null){
            return;
        }

        inorder_helper_function(input.left, list);
        list.add(input.val);
        inorder_helper_function(input.right, list);

    }
}
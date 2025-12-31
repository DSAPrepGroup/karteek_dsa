class Solution {
    private int[] postOrder(TreeNode root, int[] result) {
        if (root == null) return new int[]{0, 0};

        int[] left = postOrder(root.left, result);
        int[] right = postOrder(root.right, result);

        int nodeSum = left[0] + right[0] + root.val;
        int nodeCount = left[1] + right[1] + 1;

        if (root.val == nodeSum / nodeCount) {
            result[0]++;
        }
        return new int[]{nodeSum, nodeCount};
    }

    public int averageOfSubtree(TreeNode root) {
        int[] result = new int[1];
        postOrder(root, result);
        return result[0];
    }
}
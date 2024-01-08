class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        // Check if the root is null
        if (root == null) {
            return false;
        }

        Stack<TreeNode> path = new Stack<>();
        Stack<Integer> sumpath = new Stack<>();

        path.push(root);
        sumpath.push(root.val);

        while (!path.isEmpty()) {
            TreeNode temp = path.pop();
            int tempval = sumpath.pop();

            // Check if the current node is a leaf and if the sum matches the target
            if (temp.left == null && temp.right == null && tempval == targetSum) {
                return true;
            }

            // If the left child is not null, push it onto the stacks
            if (temp.left != null) {
                path.push(temp.left);
                sumpath.push(temp.left.val + tempval);
            }

            // If the right child is not null, push it onto the stacks
            if (temp.right != null) {
                path.push(temp.right);
                sumpath.push(temp.right.val + tempval);
            }
        }
        // If no path with the given sum is found
        return false;
    }
}

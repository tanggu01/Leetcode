class Solution {
    int res = 0;
    public int goodNodes(TreeNode root) {
        dfs(root, root.val);
        return res;
    }

    public void dfs(TreeNode node, int currMax) {
        if (node != null) {
            if (currMax <= node.val) {
               currMax = node.val;
               res++;
            }
            dfs(node.left, currMax); 
            dfs(node.right, currMax);
        }
    }
}


class Solution {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> leaf1 = new ArrayList<>();
        ArrayList<Integer> leaf2 = new ArrayList<>();
        addLeaf(root1, leaf1);
        addLeaf(root2, leaf2);
        return Arrays.equals(leaf1.toArray(), leaf2.toArray());
    }

    public void addLeaf(TreeNode node, ArrayList<Integer> leaf) {
        if (node == null) { 
            return;
        }
        if (node.left == null && node.right == null) { 
            leaf.add(node.val);
            return;
        }
        addLeaf(node.left, leaf); 
        addLeaf(node.right, leaf); 
    }
}
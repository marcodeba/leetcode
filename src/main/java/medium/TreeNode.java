package medium;

public class TreeNode {
    int value;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        this.value = x;
    }

    public static TreeNode initTreeNode() {
        TreeNode root = new TreeNode(3);
        TreeNode n1 = new TreeNode(9);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(1);
        TreeNode n4 = new TreeNode(7);

        n1.left = n3;
        n2.right = n4;
        root.left = n1;
        root.right = n2;

        return root;
    }
}

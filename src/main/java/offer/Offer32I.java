package offer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Offer32I {

    public static void main(String[] args) {
        Offer32I test = new Offer32I();
        TreeNode root = TreeNode.initTreeNode();
        List<Integer> result = test.levelOrder(root);
        result.forEach(System.out::print);
    }

    public List<Integer> levelOrder(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;
        result.add(root.value);

        Queue<TreeNode> queue = new LinkedList<>();
        if (root.left != null) queue.add(root.left);
        if (root.right != null) queue.add(root.right);

        while (!queue.isEmpty()) {
            TreeNode tempNode = queue.poll();
            result.add(tempNode.value);
            if (tempNode.left != null) queue.add(tempNode.left);
            if (tempNode.right != null) queue.add(tempNode.right);
        }

        return result;
    }
}


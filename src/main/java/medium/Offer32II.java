package medium;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Offer32II {

    public static void main(String[] args) throws IOException {
        TreeNode root = TreeNode.initTreeNode();
        Offer32II test = new Offer32II();
        List<List<Integer>> levelOrder = test.levelOrder(root);
        System.in.read();
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();

        if (root != null) queue.add(root);
        while (!queue.isEmpty()) {
            // 用于存储当前层打印结果
            List<Integer> tempList = new ArrayList<>();
            // 当前层循环，循环次数为当前层节点数
            for (int i = queue.size(); i > 0; i--) {
                TreeNode node = queue.poll();
                tempList.add(node.value);
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }
            result.add(tempList);
        }
        return result;
    }
}

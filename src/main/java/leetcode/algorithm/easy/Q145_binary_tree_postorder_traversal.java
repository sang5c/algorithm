package leetcode.algorithm.easy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * https://leetcode.com/problems/binary-tree-postorder-traversal/
 * Date: 2022-03-30
 */
public class Q145_binary_tree_postorder_traversal {
    public List<Integer> postorderTraversal(TreeNode root) {
        // 후위 순회로 문제를 해결한다.
        // 후위 순회
        //  1. 왼쪽 노드 값 확인, 있으면 내려간다.
        //  2. 오른쪽 노드 값 확인, 있으면 내려간다. (다시 1번으로)
        //  3. 마지막 노드면 값을 찍고 이전 노드로 돌아간다.
        List<Integer> result = new ArrayList<>();
        recursive(root, result);
        return result;
    }

    private void recursive(TreeNode node, List<Integer> result) {
        if (node == null) {
            return;
        }
        recursive(node.left, result);
        recursive(node.right, result);
        result.add(node.val);
    }

    @DisplayName("test")
    @Test
    void test() {
        TreeNode node3 = new TreeNode(3, null, null);
        TreeNode node2 = new TreeNode(2, node3, null);
        TreeNode node1 = new TreeNode(1, null, node2);
        assertThat(postorderTraversal(node1)).isEqualTo(List.of(3, 2, 1));
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {}

        TreeNode(int val) {this.val = val;}

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}

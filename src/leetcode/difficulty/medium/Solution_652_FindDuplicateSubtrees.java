package leetcode.difficulty.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * <b>Problem Name:</b> Find Duplicate Subtrees <br/>
 *
 * <b>Problem Link:</b> <a href="https://leetcode.com/problems/find-duplicate-subtrees/">Find Duplicate Subtrees</a><br/>
 *
 * <b>Difficulty:</b> Medium<br/>
 *
 * <b>Tags:</b>     Hash Table,
 *                  Tree,
 *                  Depth-First Search,
 *                  Binary Tree.
 * </p>
 */
public class Solution_652_FindDuplicateSubtrees {

    /**
     * <p>
     * Given the root of a binary tree, return all duplicate subtrees.
     * <br/>
     * For each kind of duplicate subtrees, you only need to return the root node of any one of them.
     * <br/>
     * Two trees are duplicate if they have the same structure with the same node values.
     * </p>
     **/
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        if (root == null) return null;
        List<TreeNode> result = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        traverse(root, map, result);
        return result;
    }

    private String traverse(TreeNode root, Map<String, Integer> map, List<TreeNode> result) {
        if (root == null) {
            return null;
        }

        String left = traverse(root.left, map, result);
        String right = traverse(root.right, map, result);

        String subtree = root.val + "," + left + "," + right;

        int count = map.getOrDefault(subtree, 0);
        if (count == 1) {
            result.add(root);
        }
        map.put(subtree, count + 1);

        return subtree;
    }
    // Definition for a binary tree node.
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}

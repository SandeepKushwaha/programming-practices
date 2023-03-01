package leetcode.difficulty.medium;

/**
 * <p>
 * <b>Problem Name:</b> Construct Quad Tree <br/>
 *
 * <b>Problem Link:</b> <a href="https://leetcode.com/problems/construct-quad-tree/">Construct Quad Tree</a><br/>
 *
 * <b>Difficulty:</b> Medium<br/>
 *
 * <b>Tags:</b>     Array,
 * Divide and Conquer,
 * Tree,
 * Matrix,
 * </p>
 */
public class Solution_427_ConstructQuadTree {
    public static void main(String[] args) {
        Solution_427_ConstructQuadTree solve = new Solution_427_ConstructQuadTree();

        int[][] input1 = {{0, 1}, {1, 0}};
        Node test_case1 = solve.construct(input1);
        System.out.println(test_case1); // print test_case1 with print method.

        int[][] input2 = {
                {1, 1, 1, 1, 0, 0, 0, 0},
                {1, 1, 1, 1, 0, 0, 0, 0},
                {1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 0, 0, 0, 0},
                {1, 1, 1, 1, 0, 0, 0, 0},
                {1, 1, 1, 1, 0, 0, 0, 0},
                {1, 1, 1, 1, 0, 0, 0, 0}};
        Node test_case2 = solve.construct(input2);
        System.out.println(test_case2); // print test_case2 with print method.
    }

    /**
     * <p>
     * Given a n * n matrix grid of 0's and 1's only. We want to represent the grid with a Quad-Tree.
     * <br/>
     * Return the root of the Quad-Tree representing the grid.
     * <br/>
     * Notice that you can assign the value of a node to True or False when isLeaf is False, and both are accepted in the answer.
     * <br/>
     * A Quad-Tree is a tree data structure in which each internal node has exactly four children. Besides, each node has two attributes:
     * <br/>
     * <b>val:</b> True if the node represents a grid of 1's or False if the node represents a grid of 0's.<br/>
     * <b>isLeaf:</b> True if the node is leaf node on the tree or False if the node has the four children.<br/><br/>
     * <b>NOTE:</b> For more details see the problem page link.
     * </p>
     **/
    public Node construct(int[][] grid) {
        if (grid == null) return null;
        return construct(grid, 0, 0, grid.length - 1, grid.length - 1);
    }

    private Node construct(int[][] arr, int row1, int col1, int row2, int col2) {
        if (row1 > row2 || col1 > col2) return null;

        boolean isLeaf = true;
        int value = arr[row1][col1];

        for (int i = row1; i <= row2; i++) {
            for (int j = col1; j <= col2; j++)
                if (arr[i][j] != value) {
                    isLeaf = false;
                    break;
                }

            if (!isLeaf)
                break;
        }

        if (isLeaf)
            return new Node(value == 1, true, null, null, null, null);
        else {
            int rowMid = row1 + (row2 - row1) / 2;
            int colMid = col1 + (col2 - col1) / 2;

            Node topLeft = construct(arr, row1, col1, rowMid, colMid);
            Node topRight = construct(arr, row1, colMid + 1, rowMid, col2);
            Node bottomLeft = construct(arr, rowMid + 1, col1, row2, colMid);
            Node bottomRight = construct(arr, rowMid + 1, colMid + 1, row2, col2);

            return new Node(false, false, topLeft, topRight, bottomLeft, bottomRight);
        }
    }

    private static class Node {
        public boolean val;
        public boolean isLeaf;
        public Node topLeft;
        public Node topRight;
        public Node bottomLeft;
        public Node bottomRight;


        public Node() {
            this.val = false;
            this.isLeaf = false;
            this.topLeft = null;
            this.topRight = null;
            this.bottomLeft = null;
            this.bottomRight = null;
        }

        public Node(boolean val, boolean isLeaf) {
            this.val = val;
            this.isLeaf = isLeaf;
            this.topLeft = null;
            this.topRight = null;
            this.bottomLeft = null;
            this.bottomRight = null;
        }

        public Node(boolean val, boolean isLeaf, Node topLeft, Node topRight, Node bottomLeft, Node bottomRight) {
            this.val = val;
            this.isLeaf = isLeaf;
            this.topLeft = topLeft;
            this.topRight = topRight;
            this.bottomLeft = bottomLeft;
            this.bottomRight = bottomRight;
        }

        public static void print(Node root) {
            // TODO complete the print method in Node class print the Node in format of array style.
            if (root == null) return;
        }
    };
}

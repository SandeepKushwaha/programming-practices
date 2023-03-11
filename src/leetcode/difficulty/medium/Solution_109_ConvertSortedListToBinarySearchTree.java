package leetcode.difficulty.medium;

/**
 * <p>
 * <b>Problem Name:</b> Convert Sorted List to Binary Search Tree<br/>
 * <b>Problem Link:</b> <a href="https://leetcode.com/problems/convert-sorted-list-to-binary-search-tree/">Convert Sorted List to Binary Search Tree</a><br/>
 * <b>Difficulty:</b> Medium<br/>
 * <b>Tags:</b>     Linked List,
 *                  Divide and Conquer,
 *                  Tree,
 *                  Binary Search Tree,
 *                  Binary Tree. <br/>
 * </p>
 *
 * <p>
 * Given the head of a singly linked list where elements are sorted in ascending order, convert it to a
 * <b>height-balanced</b> binary search tree.<br/>
 * <b>Height-Balanced:</b> A height-balanced binary tree is a binary tree in which the depth of the two
 * subtrees of every node never differs by more than one.
 * <br/><br/>
 *
 * <b>Problem Statement:</b> <br/>
 * Given the `head` of a singly linked list where elements are sorted in ascending order, convert it to a
 * height-balanced binary search tree.
 * <br/>
 * <br/><br/>
 *
 * <b>Solution:</b> <br/>
 * To solve this problem, The `sortedListToBST` method takes in the head of the singly linked list
 * and returns the root of the height-balanced binary search tree.
 * <br/>
 * The approach used here is to recursively split the linked list into halves,
 * and create a new node for the midpoint of each half to be the root of the corresponding subtree.
 * The midpoint is found using the slow and fast pointer technique commonly used to find the middle
 * element of a linked list.
 * <br/>
 * The base case of the recursion is when the list is empty or has only one node. In that case,
 * a new tree node is created with the value of the single element.
 * <br/><br/>
 * The <b>time complexity</b> of the algorithm is `O(nlogn)` because the algorithm recursively splits
 * the linked list into two halves logn times, and each split requires a linear scan of n elements.
 * <br/><br/>
 *
 * <b>Example 1:</b> <br/>
 * ((-10))-->((-3))-->((0))-->((5))-->((9)) <br/>
 * <pre>
 *           0
 *         /  \
 *       -3    9
 *      /    /
 *    -10   5
 * </pre>
 * <b>Input:</b><br/> head = [-10,-3,0,5,9]<br/>
 * <b>Output:</b> <br/> [0,-3,9,-10,null,5]<br/><br/>
 * <b>Explanation:</b><br/> One possible answer is [0,-3,9,-10,null,5],
 * which represents the shown height balanced BST.<br/>
 * <br/>
 *
 * <b>Example 2:</b>
 * <br/>
 * <b>Input:</b> head = [] <br/>
 * <b>Output:</b> []<br/>
 * <br/>
 *
 * <b>Constraints:</b> <br/>
 *
 * - The number of nodes in `head` is in the range `[0, 2 * 10^4]`. <br/>
 * - `10^5 <= Node.val <= 10^5` <br/><br/>
 *
 * </p>
 */
public class Solution_109_ConvertSortedListToBinarySearchTree {
    /**
     * The main method creates a linked list with values -10, -3, 0, 5, and 9,
     * and converts it to a binary search tree using the Solution class's sortedListToBST method.
     * Then it prints the values of the nodes in the tree using the printInorder method.
     *
     * @param args the command-line arguments, which are not used
     */
    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode head = new ListNode(-10);
        head.next = new ListNode(-3);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(5);
        head.next.next.next.next = new ListNode(9);
        TreeNode root = solution.sortedListToBST(head);
        // Print the inorder traversal of the resulting binary search tree
        printInorder(root);
    }

    /**
     * Traverse the tree in inorder traversal and print the values of the nodes.
     * Inorder traversal visits the left subtree, then the current node, then the right subtree.
     *
     * @param node the root node of the tree to traverse
     */
    private static void printInorder(TreeNode node) {
        if (node == null) return;
        printInorder(node.left);
        System.out.print(node.val + " ");
        printInorder(node.right);
    }

    /**
     * Definition for singly-linked list.
     * A ListNode class represents a node in a singly linked list.
     * Each ListNode object contains an integer value and a reference to the next ListNode object.
     */
    private static class ListNode {
        /**
         * The integer value of the ListNode object.
         * */
        int val;
        /**
         * A reference to the next ListNode object.
         * */
        ListNode next;

        /**
         * Constructs a ListNode object with the specified integer value and null reference to next.
         * @param val the integer value of the ListNode object
         * */
        public ListNode(int val) {
            this.val = val;
        }

        /**
         * Constructs a ListNode object with the specified integer value and reference to the next ListNode object.
         * @param val the integer value of the ListNode object
         * @param next a reference to the next ListNode object
         */
        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    /**
     * Definition for a binary tree node.
     * A TreeNode class represents a node in a binary search tree.
     * Each TreeNode object contains an integer value and references to the left and right child TreeNode objects.
     */
    private static class TreeNode {
        /**
         * The integer value of the TreeNode object.
         */
        int val;
        /**
         * A reference to the left child TreeNode object.
         */
        TreeNode left;
        /**
         * A reference to the right child TreeNode object.
         */
        TreeNode right;

        /**
         * Constructs a TreeNode object with the specified integer value and null references to left and right children.
         * @param val the integer value of the TreeNode object
         */
        public TreeNode(int val) {
            this.val = val;
        }

        /**
         *
         * Constructs a TreeNode object with the specified integer value and references to the left and right child TreeNode objects.
         * @param val the integer value of the TreeNode object
         * @param left a reference to the left child TreeNode object
         * @param right a reference to the right child TreeNode object
         */
        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    /**
     * The Solution class contains a static method for converting a singly linked list
     * to a binary search tree.
     */
    private static class Solution {
        /**
         * Given the head of a singly linked list where elements are sorted in ascending order,
         * converts it to a height-balanced binary search tree.
         * @param head the head of the linked list
         * @return the root node of the binary search tree
         */
        public TreeNode sortedListToBST(ListNode head) {
            if (head == null) return null;
            if (head.next == null) return new TreeNode(head.val);

            ListNode slow = head;
            ListNode fast = head;
            ListNode prev = null;

            while (fast != null && fast.next != null) {
                prev = slow;
                slow = slow.next;
                fast = fast.next.next;
            }

            prev.next = null;

            TreeNode root = new TreeNode(slow.val);
            root.left = sortedListToBST(head);
            root.right = sortedListToBST(slow.next);

            return root;

        }
    }
}

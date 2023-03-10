package leetcode.difficulty.medium;

import java.util.Arrays;

/**
 * <p>
 * <b>Problem Name:</b> Linked List Random Node<br/>
 * <b>Problem Link:</b> <a href="https://leetcode.com/problems/linked-list-random-node/">Linked List Random Node</a><br/>
 * <b>Difficulty:</b> Medium<br/>
 * <b>Tags:</b>     Math,
 *                  Linked List,
 *                  Reservoir Sampling,
 *                  Randomized, <br/>
 * </p>
 *
 * <p>
 * Given a singly linked list, return a random node's value from the linked list. Each node must
 * have the same probability of being chosen.
 * <br/><br/>
 *
 * <b>Problem Statement:</b> <br/>
 * Given a singly linked list, return a random node's value from the linked list.
 * Each node must have the <b>same probability</b> of being chosen.
 * <br/>
 * Implement the `Solution` class:
 * <br/>
 * - `Solution(ListNode head)` Initializes the object with the head of the singly-linked list `head`.<br/>
 * - `int getRandom()` Chooses a node randomly from the list and returns its value. All the nodes of the
 * list should be equally likely to be chosen.
 * <br/><br/>
 *
 * <b>Solution:</b> <br/>
 * To solve this problem, we use Reservoir Sampling, which is a technique used to randomly select
 * k samples from a set of n items, where n is either a very large or unknown number.
 * <br/>
 * We can't afford to loop through the entire list twice: once to get its length and again to pick a random
 * node, so we use a one-pass solution that only stores the length and the randomly-selected node's
 * value.
 * <br/>
 * We use a loop to traverse the linked list and a count variable to keep track of the
 * current node's index. For each node, we generate a random integer between 0 and the current
 * index count. If this integer is 0, we update the result variable to the current node's value,
 * which has a 1/count probability of being selected.
 * <br/>
 * After the loop, we return the result. <br/><br/>
 * <b>Time Complexity:</b> `O(n)`, where n is the number of nodes in the linked list. <br/>
 * <b>Space Complexity:</b> `O(1)`, as we are only storing the length of the linked list and the result.
 * <br/> <br/>
 *
 * <b>Example 1:</b> <br/>
 * ((1))-->((2))-->((3)) <br/>
 * <b>Input:</b><br/> ["Solution", "getRandom", "getRandom", "getRandom", "getRandom", "getRandom"]<br/>
 * [[[1, 2, 3]], [], [], [], [], []]<br/>
 * <b>Output:</b> <br/> [null, 1, 3, 2, 2, 3]<br/><br/>
 * <b>Explanation:</b><br/> Solution solution = new Solution([1, 2, 3]); <br/>
 * solution.getRandom(); // return 1 <br/>
 * solution.getRandom(); // return 3 <br/>
 * solution.getRandom(); // return 2 <br/>
 * solution.getRandom(); // return 2 <br/>
 * solution.getRandom(); // return 3 <br/>
 * // getRandom() should return either 1, 2, or 3 randomly. Each element should have equal probability of returning. <br/>
 * <br/>
 *
 * <b>Constraints:</b> <br/>
 *
 * - The number of nodes in the linked list will be in the range `[1, 10^4]`. <br/>
 * - `-10^4 <= Node.val <= 10^4` <br/>
 * - At most `10^4` calls will be made to `getRandom`. <br/><br/>
 *
 * <b>Follow up:</b><br/>
 * - What if the linked list is extremely large and its length is unknown to you? <br/>
 * - Could you solve this efficiently without using extra space?<br/>
 * </p>
 */
public class Solution_382_LinkedListRandomNode {

    // Main method here.
    public static void main(String[] args) {
        // Input: [1,2,3]
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3)));

        Solution solution = new Solution(head);

        int[] output = new int[5];

        // Calls getRandom() 5 times and saves the results in the output array
        for (int i = 0; i < 5; i++) {
            output[i] = solution.getRandom();
        }

        System.out.println("Output: " + Arrays.toString(output));
        // Expected output: [null,3,3,1,2,1]
    }

    /**
     * <p>ListNode represents a node in a singly-linked list. Each node contains an integer value
     * <br/>
     * and a reference to the next node in the list.</p>
     * */
    private static class ListNode {
        /**
         * <p>The integer value stored in this node.</p>
         * */
        int val;
        /**
         * <p>The integer value stored in this node.</p>
         * */
        ListNode next;
        /**
         * <p>
         * Constructs a new ListNode with the given value and a null reference to the next node.
         * @param val the integer value to be stored in this node
         * </p>
         * */
        ListNode(int val) {
            this.val = val;
        }
        /**
         * <p>
         * Constructs a new ListNode with the given value and a reference to the next node.
         * @param val the integer value to be stored in this node
         * @param next a reference to the next node in the list
         * </p>
         * */
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }


    /**
     * <p>
     * This class implements a solution to the problem of generating a random node from a singly-linked list.<br/>
     * The class contains a constructor that takes a ListNode object representing the head of the linked list. <br/>
     * It also contains a method called getRandom() that returns a random node from the linked list with equal probability. <br/>
     * The getRandom() method uses reservoir sampling algorithm to randomly choose a node from the linked list. <br/>
     * The algorithm works by iterating through the linked list and keeping track of the total number of nodes seen so far. <br/>
     * At each node, the algorithm chooses the node with probability 1/count, where count is the number of nodes seen so far. <br/>
     * By the end of the iteration, the algorithm guarantees that each node has an equal probability of being chosen as the result. <br/>
     * <br/>
     * Example usage:<br/>
     * ListNode head = new ListNode(1, new ListNode(2, new ListNode(3)));<br/>
     * Solution solution = new Solution(head); <br/>
     * int randomNode = solution.getRandom(); // returns a random node from the linked list with equal probability <br/>
     * </p>
     * */
    private static class Solution {

        /**
         * <p>Class representing a solution for the LeetCode problem #382 "Linked List Random Node".</p>
         * */
        private ListNode head;

        /**
         * <p>
         * Creates a new instance of the Solution class with the given ListNode as the head of the linked list. <br/>
         * @param head the ListNode that will be the head of the linked list <br/>
         * </p>
         * */
        public Solution(ListNode head) {
            this.head = head;
        }

        /**
         * <p>
         * Returns a random node's value from the linked list.<br/>
         * Each node must have the same probability of being chosen. <br/>
         *
         * @return the value of the randomly chosen node.
         *
         * </p>
         * */
        public int getRandom() {
            int count = 0;
            int result = 0;
            ListNode current = head;

            while (current != null) {
                count++;
                // Randomly choose a node to be the result with probability 1/count
                if ((int) (Math.random() * count) == 0)
                    result = current.val;
                current = current.next;
            }

            return result;
        }
    }
}

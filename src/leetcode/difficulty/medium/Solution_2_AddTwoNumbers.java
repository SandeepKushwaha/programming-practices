package leetcode.difficulty.medium;

/**
 * <p>
 * <b>Problem Name:</b> Add Two Numbers<br/>
 * <b>Problem Link:</b> <a href="https://leetcode.com/problems/add-two-numbers/">Add Two Numbers</a><br/>
 * <b>Difficulty:</b> Medium<br/>
 * <b>Tags:</b>     Linked List,
 *                  Math,
 *                  Recursion. <br/>
 * </p>
 *
 * <p>
 * You are given two <b>non-empty</b> linked lists representing two non-negative integers.
 * The digits are stored in <b>reverse order</b>, and each of their nodes contains a single digit.
 * Add the two numbers and return the sum as a linked list.
 * <br/><br/>
 *
 * <b>Problem Statement:</b> <br/>
 * ou are given two <b>non-empty</b> linked lists representing two non-negative integers.
 * The digits are stored in <b>reverse order</b>, and each of their nodes contains a single digit.
 * Add the two numbers and return the sum as a linked list.
 * <br/>
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 * <br/>
 * <br/><br/>
 *
 * <b>Solution:</b> <br/>
 * To solve this problem using recursion, we can add the values of the nodes in the current position
 * and pass the carry-over value to the next recursion. We can continue this process until
 * we reach the end of both linked lists and there is no carry-over value.
 * <br/>
 * In this solution, the `addTwoNumbers` method takes three arguments: `l1`, `l2`, and `carry`.
 * The `carry` parameter is used to pass the carry-over value to the next recursion.
 * The method checks if both `l1` and `l2` are null and if there is no carry-over value.
 * If that's the case, it returns null because there's no need to add any further nodes.
 * <br/>
 * Otherwise, the method adds the values of the current nodes and the carry-over value, and
 * creates a new node with the sum mod 10. The sum mod 10 is used to get the rightmost digit of the sum.
 * The carry-over value for the next recursion is the sum divided by 10. If either `l1` or `l2` is null,
 * the method just adds 0 to the sum.
 * <br/>
 * Finally, the method sets the next node to the result of the recursive call, passing `l1`, `l2`, and
 * the carry-over value as arguments. The method returns the current node.
 * <br/><br/>
 * This solution has a <b>time complexity</b> of `O(max(m,n))`, where m and n are the lengths of `l1` and `l2`,
 * respectively, because we need to iterate over both linked lists.
 * It has a <b>space complexity</b> of `O(max(m,n))` as well, because the recursive call
 * stack can have at most max(m,n) frames.
 * <br/><br/>
 *
 * <b>Example 1:</b> <br/>
 * ((2))-->((4))-->((3))  <br/>
 * ((5))-->((6))-->((4))  <br/><br/>
 * ((7))-->((0))-->((8))  <br/>
 * <b>Input:</b><br/> l1 = [2,4,3], l2 = [5,6,4]<br/>
 * <b>Output:</b> <br/> [7,0,8]<br/><br/>
 * <b>Explanation:</b><br/> 342 + 465 = 807.<br/>
 * <br/>
 *
 * <b>Example 2:</b>
 * <br/>
 * <b>Input:</b> l1 = [0], l2 = [0] <br/>
 * <b>Output:</b> [0]<br/>
 * <br/>
 *
 * <b>Example 3:</b>
 * <br/>
 * <b>Input:</b> l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9] <br/>
 * <b>Output:</b> [8,9,9,9,0,0,0,1]<br/>
 * <br/>
 *
 * <b>Constraints:</b> <br/>
 *
 * - The number of nodes in each linked list is in the range `[1, 100]`. <br/>
 * - `0 <= Node.val <= 9`. <br/>
 * - It is guaranteed that the list represents a number that does not have leading zeros. <br/><br/>
 *
 * </p>
 */
public class Solution_2_AddTwoNumbers {
    // RUNNER METHOD
    public static void main(String[] args) {
        Solution solve = new Solution();

        // create two input lists
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));

        // add the two lists
        ListNode result = solve.addTwoNumbers(l1, l2);

        // print the result
        printList(result);
    }

    // helper method to print the values of a linked list
    private static void printList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    /**
     * Definition for singly-linked list.
     **/
    private static class ListNode {
        int val;
        ListNode next;
        /*ListNode() {}*/
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    private static class Solution {

        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            return addTwoNumbers(l1, l2, 0);
        }

        private ListNode addTwoNumbers(ListNode l1, ListNode l2, int carry) {
            if (l1 == null && l2 == null && carry == 0) {
                return null;
            }

            int sum = carry;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            ListNode node = new ListNode(sum % 10);
            node.next = addTwoNumbers(l1, l2, sum / 10);

            return node;
        }

        /* Failure logics
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode dummy = new ListNode(0); // create a dummy node to start the result list
            ListNode curr = dummy; // initialize a pointer to the dummy node

            int carry = 0; // initialize the carry to 0

            while (l1 != null || l2 != null || carry != 0) {
                int sum = carry; // initialize the sum to the carry

                if (l1 != null) {
                    sum += l1.val;
                    l1 = l1.next;
                }

                if (l2 != null) {
                    sum += l2.val;
                    l2 = l2.next;
                }

                carry = sum / 10; // calculate the carry
                sum = sum % 10; // calculate the sum

                curr.next = new ListNode(sum); // create a new node with the sum
                curr = curr.next; // move the pointer to the next node
            }

            return dummy.next; // return the result list (excluding the dummy node)
        }
        */
    }
}

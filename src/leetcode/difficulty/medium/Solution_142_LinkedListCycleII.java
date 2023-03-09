package leetcode.difficulty.medium;

/**
 * <p>
 * <b>Problem Name:</b> Linked List Cycle II<br/>
 * <b>Problem Link:</b> <a href="https://leetcode.com/problems/linked-list-cycle-ii/">linked-list-cycle-ii</a><br/>
 * <b>Difficulty:</b> Medium<br/>
 * <b>Tags:</b>     Hash Table,
 *                  Linked List,
 *                  Two Pointers, <br/>
 * </p>
 *
 * <p>
 * This class contains a method to detect the start of a cycle (if any) in a linked list. If there is no cycle,
 * it returns null.
 * <br/><br/>
 *
 * Problem Statement: <br/>
 * Given the `head` of a linked list, return the node where the cycle begins. If there is no cycle, return `null`.
 * <br/>
 * There is a cycle in a linked list if there is some node in the list that can be reached again by continuously
 * following the `next` pointer. Internally, `pos` is used to denote the index of the node that tail's `next`
 * pointer is connected to (0-indexed). It is `-1` if there is no cycle. Note that `pos` is not passed as a parameter.
 * <br/>
 * Do not modify the linked list.
 * <br/><br/>
 *
 * Solution: <br/>
 * The solution uses the two pointer approach to detect if a given linked list has a cycle or not.
 * In this approach, two pointers, slow and fast, are initialized to the head of the linked list.
 * The slow pointer moves one node at a time while the fast pointer moves two nodes at a time.
 * If there is a cycle in the linked list, the two pointers will eventually meet at some point.
 * <br/>
 * Once the two pointers meet, we know that there is a cycle in the linked list.
 * To find the node where the cycle begins, we initialize a new pointer to the head of the linked list
 * and another pointer to the node where the slow and fast pointers meet.
 * We then move both pointers one node at a time until they meet at the start of the cycle.
 * <br/>
 * If there is no cycle in the linked list, the fast pointer will reach the end of the linked list
 * before the slow pointer, and we will return null.
 * <br/>
 * Overall, the time complexity of this approach is O(n), where n is the number of nodes in the linked list.
 * The space complexity is O(1), as we are only using constant space for the two pointers.
 * <br/> <br/>
 *
 * <b>Example 1:</b> <br/>
 *
 * <b>Input:</b> head = [3,2,0,-4], pos = 1<br/>
 * <b>Output:</b> tail connects to node index 1 <br/><br/>
 * <b>Explanation:</b> There is a cycle in the linked list, where tail connects to the second node. <br/>
 * <b>Example 2:</b> <br/>
 *
 * <b>Input:</b> head = [1,2], pos = 0<br/>
 * <b>Output:</b> head = [1,2], pos = 0 <br/><br/>
 * <b>Explanation:</b> There is a cycle in the linked list, where tail connects to the first node. <br/>
 * <b>Example 3:</b> <br/>
 *
 * <b>Input:</b> There is a cycle in the linked list, where tail connects to the first node. <br/>
 * <b>Output:</b> no cycle <br/>
 * <b>Explanation:</b> There is no cycle in the linked list. <br/>
 * <br/><br/>
 *
 * <b>Constraints:</b> <br/>
 *
 * The number of the nodes in the list is in the range [0, 10^4]. <br/>
 * `-10^05 <= Node.val <= 10^5` <br/>
 * `pos` is `-1` or a valid index in the linked-list. <br/><br/>
 *
 * <b>Follow up:</b> Can you solve it using O(1) (i.e. constant) memory?
 * </p>
 */
public class Solution_142_LinkedListCycleII {
    /**
     * This function detects the start of a cycle (if any) in the given linked list.
     * If there is no cycle, it returns null.
     *
     * @param head The head of the linked list
     * @return The node where the cycle begins or null if there is no cycle
     */
    public ListNode detectCycle(ListNode head) {

        // Initialize two pointers slow and fast to the head of the linked list
        ListNode slow = head, fast = head;

        // Loop until either the end of the linked list is reached or there is a cycle
        while (fast != null && fast.next != null) {

            // Move the slow pointer one step ahead
            slow = slow.next;

            // Move the fast pointer two steps ahead
            fast = fast.next.next;

            // If the slow and fast pointers meet, there is a cycle in the linked list
            if (slow == fast) {

                // Initialize a new pointer to the head of the linked list
                ListNode ptr1 = head;

                // Initialize another pointer to the node where the slow and fast pointers meet
                ListNode ptr2 = slow;

                // Loop until the two pointers meet at the start of the cycle
                while (ptr1 != ptr2) {

                    // Move both pointers one step ahead
                    ptr1 = ptr1.next;
                    ptr2 = ptr2.next;
                }

                // Return the node where the cycle begins
                return ptr1;
            }
        }

        // If the end of the linked list is reached, there is no cycle
        return null;
    }

    /**
     * <p>
     * This class represents a node in a <b>linked list.</b>
     * </p>
     * */
    private static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }
}

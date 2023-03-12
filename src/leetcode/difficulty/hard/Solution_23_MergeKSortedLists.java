package leetcode.difficulty.hard;

import java.util.Comparator;

/**
 * <p>
 * <b>Problem Name:</b> Merge k Sorted Lists<br/>
 * <b>Problem Link:</b> <a href="https://leetcode.com/problems/merge-k-sorted-lists/">Merge k Sorted Lists</a><br/>
 * <b>Difficulty:</b> hard<br/>
 * <b>Tags:</b>     Linked List,
 *                  Divide and Conquer,
 *                  Heap (Priority Queue),
 *                  Merge Sort, <br/>
 * </p>
 *
 * <p>
 * Problem Statement: <br/>
 * You are given an array of `k` linked-lists `lists`, each linked-list is sorted in ascending order.
 * <br/>
 * Merge all the linked-lists into one sorted linked-list and return it.
 * <br/><br/>
 *
 * Solution: <br/>
 * TTo merge k sorted linked lists, we can use a min heap. First,
 * we add the first node of each linked list to the min heap.
 * <br/>
 * We then pop the minimum node from the heap and add its next node to the heap.
 * We repeat this process until the heap is empty.
 * The nodes that we pop from the heap form the merged linked list.
 * <br/>
 * Time Complexity: O(Nlogk), where N is the total number of nodes in all k linked lists.
 * We can add each node to the heap only once, and the heap has at most k nodes, so the time complexity is O(Nlogk).
 * <br/>
 * Space Complexity: O(k), where k is the number of linked lists. We need to keep a heap of at most k nodes.
 * <br/> <br/>
 *
 * <b>Example 1:</b> <br/>
 *
 * <b>Input:</b> lists = [[1,4,5],[1,3,4],[2,6]]<br/>
 * <b>Output:</b> [1,1,2,3,4,4,5,6]<br/>
 * <b>Explanation:</b> The linked-lists are: <br/>
 * <pre>
 * [
 *   1->4->5,
 *   1->3->4,
 *   2->6
 * ]
 * merging them into one sorted list:
 *   1->1->2->3->4->4->5->6
 * </pre>
 * <br/><br/>
 * <b>Example 2:</b> <br/>
 *
 * <b>Input:</b>  lists = [] <br/>
 * <b>Output:</b> []<br/><br/>
 * <b>Example 3:</b> <br/>
 *
 * <b>Input:</b> lists = [[]] <br/>
 * <b>Output:</b> [] <br/>
 * <br/><br/>
 *
 * <b>Constraints:</b> <br/>
 *
 * `k == lists.length` <br/>
 * `0 <= k <= 10^4` <br/>
 * `0 <= lists[i].length <= 500` <br/>
 * `-10^4 <= lists[i][j] <= 10^4` <br/>
 * `lists[i]` is sorted in ascending order. <br/>
 * The sum of `lists[i].length` will not exceed `10^4`. <br/><br/>
 *
 *
 * </p>
 */
public class Solution_23_MergeKSortedLists {
    /**
     * The main method of the program.
     * Reads the input lists from the command line arguments, calls the mergeKLists method to merge them,
     * and prints the merged list to the console.
     * Each list should be provided as a comma-separated string of integers enclosed in square brackets, e.g. [1,2,3].
     * If no lists are provided, an empty list is used.
     * If any list is empty or null, it is skipped.
     * @param args the command line arguments containing the input lists
     */
    public static void main(String[] args) {
        ListNode list1 = new ListNode(1, new ListNode(4, new ListNode(5)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode list3 = new ListNode(2, new ListNode(6));
        ListNode[] lists = {list1, list2, list3};
        Solution solution = new Solution();
        ListNode mergedList = solution.mergeKLists(lists);
        System.out.println("Merged List: " + printList(mergedList));
    }

    /**
     * Prints the elements of a singly-linked list to the console.
     * The list is represented by a reference to its head node.
     * The elements are printed in order, separated by spaces.
     * If the list is empty or null, nothing is printed.
     * @param head a reference to the head node of the list to be printed
     */
    private static String printList(ListNode head) {
        StringBuilder sb = new StringBuilder();
        while (head != null) {
            sb.append(head.val).append(" ");
            head = head.next;
        }
        return sb.toString();
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
     * A solution to the problem of merging k sorted linked lists.
     * The solution uses a priority queue to merge the lists.
     * */
    private static class Solution {
        /**
         * This method takes an array of k linked-lists, where each linked-list is sorted in ascending order,
         * merges all the linked-lists into one sorted linked-list and returns it.
         * The method uses a min-heap priority queue to keep track of the next smallest node from each list,
         * and adds nodes to the merged list in ascending order.
         * @param lists an array of k linked-lists
         * @return the merged linked-list in ascending order
         * */
        public ListNode mergeKLists(ListNode[] lists) {
            if (lists == null || lists.length == 0)
                return null;

            java.util.PriorityQueue<ListNode> minHeapQueue
                    // = new java.util.PriorityQueue<>(lists.length, (a, b) -> a.val - b.val);
                    = new java.util.PriorityQueue<>(lists.length, Comparator.comparingInt(a -> a.val));

            for (ListNode list : lists)
                if (list != null)
                    minHeapQueue.offer(list);

            ListNode dummy = new ListNode(0);
            ListNode tail = dummy;

            while (!minHeapQueue.isEmpty()) {
                ListNode node = minHeapQueue.poll();
                tail.next = node;
                tail = tail.next;

                if (node.next != null)
                    minHeapQueue.offer(node.next);
            }

            return dummy.next;
        }
    }
}

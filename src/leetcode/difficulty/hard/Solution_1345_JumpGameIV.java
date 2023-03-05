package leetcode.difficulty.hard;

import java.util.*;

/**
 * <p>
 * <b>Problem Name:</b> Jump Game IV <br/>
 *
 * <b>Problem Link:</b> <a href="https://leetcode.com/problems/jump-game-iv/">Jump Game IV</a><br/>
 *
 * <b>Difficulty:</b> Hard<br/>
 *
 * <b>Tags:</b>     Array,
 *                  Hash Table,
 *                  Breadth-First Search, <br/>
 *
 * <b>Deep Dive Study Links:</b>      <a href="https://www.youtube.com/watch?v=oDqjPvD54Ss">Breadth First Search grid shortest path | Graph Theory</a>
 *
 * </p>
 */
public class Solution_1345_JumpGameIV {
    /**
     * <p>
     *     Main method is the starter point for the running the problem Jump Game IV
     * </p>
     * <p>
     * The program is solving a problem where you are given an array of integers and you need to find the minimum number of steps required to reach the last index of the array.
     * <br/> <br/>
     * In one step, you can jump from an index i to another index j such that:
     * <br/>
     * i + 1, where i + 1 < arr.length (i.e., you can jump to the next index) <br/>
     * i - 1, where i - 1 >= 0 (i.e., you can jump to the previous index) <br/>
     * j, where arr[i] == arr[j] and i != j (i.e., you can jump to any other index in the array that has the same value as the current index) <br/><br/>
     * To solve this problem, the program starts from the first index of the array and keeps track of the minimum number of steps required to reach each index. It uses a queue to perform a breadth-first search of the array, exploring all possible jumps from the current index.
     * <br/><br/>
     * The program keeps track of the number of steps required to reach each index by storing it in an array called steps. The initial value of steps[0] is 0, because you are already at the first index. For all other indices, the initial value of steps[i] is set to a very large number, representing an infinite number of steps.
     * <br/><br/>
     * The program then starts a loop where it dequeues the first index from the queue and explores all possible jumps from that index. For each jump, it checks if the new index is within the bounds of the array, and if it is, it checks if the number of steps required to reach the new index is less than the current value of steps[j]. If it is, it updates steps[j] to the new value and enqueues the new index.
     * <br/><br/>
     * Once the program has explored all possible jumps from the current index, it moves on to the next index in the queue and repeats the process until it reaches the last index of the array. Finally, the program returns the value of steps[arr.length - 1], which represents the minimum number of steps required to reach the last index.
     * </p>
     *
     **/
    public static void main(String[] args) {
        Solution_1345_JumpGameIV solve = new Solution_1345_JumpGameIV();

        int[] inputTestCase1 = {100, -23, -23, 404, 100, 23, 23, 23, 3, 404};
        int[] inputTestCase2 = {7, 6, 9, 6, 9, 6, 9, 7};

        System.out.println(solve.minJumps(inputTestCase1));
        System.out.println(solve.minJumps(inputTestCase2));
        System.out.println();
        System.out.println(solve.minJumpsOptimized(inputTestCase1));
        System.out.println(solve.minJumpsOptimized(inputTestCase2));
    }

    /**
     * <p>
     * Given an array of integers `arr`, you are initially positioned at the first index of the array. <br/>
     * <p>
     * In one step you can jump from index i to index: <br/>
     *
     * <ul>
     *      <li>`i + 1` where: `i + 1 < arr.length`. <br/></li>
     *      <li>`i - 1` where: `i - 1 >= 0`. <br/></li>
     *      <li>`j where: `arr[i] == arr[j]` and `i != j`. <br/></li>
     * </ul>
     * Return the <i>minimum </i>number of steps to reach the<i> last index</i> of the array. <br/>
     * <p>
     * Notice that you can not jump outside of the array at any time. <br/>
     * <br/>
     *
     * <b>Example 1:</b> <br/>
     *
     * <b>Input:</b> arr = [100,-23,-23,404,100,23,23,23,3,404] <br/>
     * <b>Output:</b> 3 <br/>
     * <b>Explanation:</b> You need three jumps from index 0 --> 4 --> 3 --> 9. Note that index 9 is the last index of the array. <br/>
     * <br/>
     * <b>Example 2:</b> <br/>
     *
     * <b>Input: </b>arr = [7] <br/>
     * <b>Output:</b> 0 <br/>
     * <b>Explanation:</b> Start index is the last index. You do not need to jump.<br/>
     * <br/>
     * <b>Example 3:</b> <br/>
     *
     * <b>Input:</b> arr = [7,6,9,6,9,6,9,7] <br/>
     * <b>Output:</b> 1 <br/>
     * <b>Explanation:</b> You can jump directly from index 0 to index 7 which is last index of the array. <br/>
     * <br/> <br/>
     *
     * <b>Constraints:</b>
     * <br/>
     * 1 <= arr.length <= 5 * 10^4 <br/>
     * -10^8 <= arr[i] <= 10^8 <br/>
     * </p> <br/> <br/>
     *
     * @param arr an integer array.
     * @return the minimum number of steps to reach the last index of the array
     */

    public int minJumps(int[] arr) {
        int n = arr.length;
        Map<Integer, List<Integer>> map = new HashMap<>(); // value to index mapping
        for (int i = 0; i < n; i++) {
            map.computeIfAbsent(arr[i], key -> new ArrayList<>()).add(i);
        }

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(0);
        boolean[] visited = new boolean[n];
        visited[0] = true;
        int steps = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                //noinspection DataFlowIssue
                int curr = queue.poll();
                if (curr == n - 1) {
                    return steps;
                }
                // jump to adjacent indices
                if (curr + 1 < n && !visited[curr + 1]) {
                    visited[curr + 1] = true;
                    queue.offer(curr + 1);
                }
                if (curr - 1 >= 0 && !visited[curr - 1]) {
                    visited[curr - 1] = true;
                    queue.offer(curr - 1);
                }
                // jump to indices with the same value
                for (int j : map.get(arr[curr])) {
                    if (j != curr && !visited[j]) {
                        visited[j] = true;
                        queue.offer(j);
                    }
                }
                // clear the value to avoid duplicate visits
                map.get(arr[curr]).clear();
            }
            steps++;
        }

        return -1; // no solution
    }

    // Optimized Solution for the Problem.
    public int minJumpsOptimized(int[] arr) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        int len = arr.length;

        for(int i = 0;i < len;i++){
            List<Integer> list = map.getOrDefault(arr[i], null);

            if(list == null){
                list = new ArrayList<>();
                map.put(arr[i], list);
            }
            list.add(i);
        }

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(0);
        boolean[] visited = new boolean[len];
        visited[0] = true;

        int steps = 0;

        while(!queue.isEmpty()){
            int count = queue.size();
            while(0 < count--){
                //noinspection DataFlowIssue
                int index = queue.poll();

                if(index == (len - 1)) return steps;



                List<Integer> list = map.get(arr[index]);

                if(list.size() > 1) {

                    for(int newIndex : list){
                        if(newIndex == index || visited[newIndex]) continue;
                        queue.offer(newIndex);
                        visited[newIndex] = true;
                    }

                    list.clear();
                }

                int prev = index - 1;
                int next = index + 1;

                if(prev >= 0 && !visited[prev]){
                    queue.offer(prev);
                    visited[prev] = true;
                }

                if(next < len && !visited[next]){
                    queue.offer(next);
                    visited[next] = true;
                }
            }
            steps++;
        }

        return -1;
    }
}

package leetcode.difficulty.hard;

/**
 * <p>
 * <b>Problem Name:</b> Count Subarrays With Fixed Bounds <br/>
 *
 * <b>Problem Link:</b> <a href="https://leetcode.com/problems/count-subarrays-with-fixed-bounds/">Count Subarrays With Fixed Bounds</a><br/>
 *
 * <b>Difficulty:</b> Hard<br/>
 *
 * <b>Tags:</b>     Array,
 * Queue,
 * Sliding Window,
 * Monotonic Queue,
 * </p>
 */
public class Solution_2444_CountSubArraysWithFixedBounds {

    public static void main(String[] args) {
        Solution_2444_CountSubArraysWithFixedBounds solve = new Solution_2444_CountSubArraysWithFixedBounds();

        int[] numbers1 = {1, 3, 5, 2, 7, 5};
        int[] numbers2 = {1, 1, 1, 1};

        System.out.println(solve.countSubarrays(numbers1, 1, 5));
        System.out.println(solve.countSubarrays(numbers2, 1, 1));
    }

    /**
     * <p>
     * You are given an integer array `numbers` and two integers `minK` and `maxK`.
     * <br/>
     * A fixed-bound subarray of `numbers` is a subarray that satisfies the following conditions:
     * <br/>
     * - The minimum value in the subarray is equal to `minK`.<br/>
     * - The maximum value in the subarray is equal to `maxK`.<br/>
     * - Return the number of fixed-bound subarrays.
     * <br/>
     * A subarray is a contiguous part of an array.
     * <br/> <br/>
     *
     * <b>Example 1:</b> <br/>
     *
     * <b>Input:</b> numbers = [1,3,5,2,7,5], minK = 1, maxK = 5 <br/>
     * <b>Output:</b> 2 <br/>
     * <b>Explanation:</b> The fixed-bound subarrays are [1,3,5] and [1,3,5,2]. <br/><br/>
     *
     * <b>Example 2:</b> <br/>
     *
     * <b>Input:</b> numbers = [1,1,1,1], minK = 1, maxK = 1 <br/>
     * <b>Output:</b> 10 <br/>
     * <b>Explanation:</b> Every subarray of numbers is a fixed-bound subarray. There are 10 possible subarrays. <br/><br/>
     *
     *
     * <b>Constraints:</b> <br/>
     * <p>
     * 2 <= numbers.length <= 10^5<br/>
     * 1 <= numbers[i], minK, maxK <= 10^6<br/>
     * </p><br/>
     *
     * @param numbers integers array
     * @param minK    minimum value in the subarray is equal to minK
     * @param maxK    minimum value in the subarray is equal to minK
     * @return number of fixed-bound subarrays
     * <br/><br/>
     */
    public long countSubarrays(int[] numbers, int minK, int maxK) {
        long count = 0;
        int lastBadIndex = -1;
        int lastIndexWithMinK = -1;
        int lastIndexWithMaxK = -1;
        int n = numbers.length;
        for (int i = 0; i < n; i++) {
            if (numbers[i] < minK || numbers[i] > maxK) {
                lastBadIndex = i;
            }
            if (numbers[i] == minK) {
                lastIndexWithMinK = i;
            }
            if (numbers[i] == maxK) {
                lastIndexWithMaxK = i;
            }
            count += Math.max(0L, Math.min(lastIndexWithMinK, lastIndexWithMaxK) - lastBadIndex);
        }
        return count;

        /* same but less write code.
        long res = 0, jBad = -1, jMin = -1, jMax = -1, n = numbers.length;
        for (int i = 0; i < n; ++i) {
            if (numbers[i] < minK || numbers[i] > maxK) jBad = i;
            if (numbers[i] == minK) jMin = i;
            if (numbers[i] == maxK) jMax = i;
            res += Math.max(0L, Math.min(jMin, jMax) - jBad);
        }
        return res;
        */
    }
}

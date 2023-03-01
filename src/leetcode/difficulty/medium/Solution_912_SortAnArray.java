package leetcode.difficulty.medium;

import java.util.Arrays;

/**
 * <p>
 * <b>Problem Name:</b> Sort an Array<br/>
 *
 * <b>Problem Link:</b> <a href="https://leetcode.com/problems/sort-an-array/">Sort an Array</a><br/>
 *
 * <b>Difficulty:</b> Medium<br/>
 *
 * <b>Tags:</b>     Array,
 *                  Sorting,
 *                  Divide and Conquer,
 *                  Heap (Priority Queue),
 *                  Merge Sort,
 *                  Bucket Sort,
 *                  Radix Sort,
 *                  Counting Sort,
 * </p>
 */
public class Solution_912_SortAnArray {
    public static void main(String[] args) {
        Solution_912_SortAnArray solve = new Solution_912_SortAnArray();
        int[] case1 = {5, 2, 3, 1};
        int[] case2 = {5, 1, 1, 2, 0, 0};
        int[] case3 = {32, 42, 12, 4, 3, 23, 1};

        System.out.println(Arrays.toString(solve.sortArray(case1)));
        System.out.println(Arrays.toString(solve.sortArray(case2)));
        System.out.println(Arrays.toString(solve.sortArray(case3)));
    }

    /**
     * <p>
     * Given an array of integers numbers, sort the array in ascending order and return it.
     * <br/>
     * You must solve the problem without using any built-in functions in <b><i>O(n log(n))</i></b> time complexity and with
     * the smallest space complexity possible.
     * <br/>
     * </p>
     * <p><b>Example 1:</b>
     * <br/>
     * <b>Input:</b> numbers = [5,2,3,1]<br/>
     * <b>Output:</b> [1,2,3,5] <br/>
     * <b>Explanation:</b> After sorting the array, the positions of some numbers are not changed (for example, 2 and 3),
     * while the positions of other numbers are changed (for example, 1 and 5). <br/>
     * </p>
     *
     * <p><b>Example 2:</b>
     * <br/>
     * <b>Input:</b> numbers = [5,1,1,2,0,0]<br/>
     * <b>Output:</b> [0,0,1,1,2,5] <br/>
     * <b>Explanation:</b> Note that the values of numbers are not necessairly unique.<br/>
     * </p>
     *
     * <p>
     * <b>Constraints:</b>
     * <br/>
     * 1 <= nums.length <= 5 * 10^4<br/>
     * -5 * 104 <= nums[i] <= 5 * 10^4<br/>
     * </p>
     *
     * */
    public int[] sortArray(int[] numbers) {
        // java.util.Arrays.sort(numbers);
        // return numbers;

        if (numbers == null || numbers.length <= 1)
            return numbers;

        mergeSort(numbers, 0, numbers.length - 1);
        return numbers;
    }

    private void mergeSort(int[] nums, int start, int end) {
        if (start >= end)
            return;
        int mid = start + (end - start) / 2;
        mergeSort(nums, start, mid);
        mergeSort(nums, mid + 1, end);
        merge(nums, start, mid, end);
    }

    private void merge(int[] nums, int start, int mid, int end) {
        int[] temp = new int[end - start + 1];
        int i = start, j = mid + 1, k = 0;
        while (i <= mid && j <= end) {
            if (nums[i] <= nums[j])
                temp[k++] = nums[i++];
            else
                temp[k++] = nums[j++];
        }
        while (i <= mid)
            temp[k++] = nums[i++];
        while (j <= end)
            temp[k++] = nums[j++];

        System.arraycopy(temp, 0, nums, start, temp.length);
    }
}

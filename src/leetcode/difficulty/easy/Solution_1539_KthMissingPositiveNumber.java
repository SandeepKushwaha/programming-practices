package leetcode.difficulty.easy;

/**
 * <p>
 * <b>Problem Name:</b> Kth Missing Positive Number
 * <br/>
 * <b>Problem Link:</b> <a href="https://leetcode.com/problems/kth-missing-positive-number/">Kth Missing Positive Number</a>
 * <br/>
 * <b>Difficulty:</b> Easy
 * <br/>
 * <b>Tags:</b>    Array,
 *                 Binary Search.
 * </p>
 *
 * */
public class Solution_1539_KthMissingPositiveNumber {
    public static void main(String[] args) {
        // test cases for findKthPositive
        Solution_1539_KthMissingPositiveNumber solve = new Solution_1539_KthMissingPositiveNumber();

        int[] test_input1 = {2, 3, 4, 7, 11};
        int[] test_input2 = {1, 2, 3, 4};

        System.out.println(solve.findKthPositive(test_input1, 5));
        System.out.println(solve.findKthPositive(test_input2, 2));

    }

    /**
     *
     * <p>
     * Given an array `arr` of positive integers sorted in a strictly increasing order, and an integer `k`.
     * <br/>
     * Return the `kth` positive integer that is missing from this array.
     * <br/><br/>
     *
     *
     * <b>Example 1:</b> <br/>
     *
     * <b>Input:</b> arr = [2,3,4,7,11], k = 5 <br/>
     * <b>Output:</b> 9 <br/>
     * <b>Explanation:</b> The missing positive integers are [1,5,6,8,9,10,12,13,...]. The 5th missing positive integer is 9. <br/> <br/>
     * <b>Example 2:</b> <br/>
     *
     * <b>Input:</b> arr = [1,2,3,4], k = 2 <br/>
     * <b>Output:</b> 6 <br/>
     * <b>Explanation:</b> The missing positive integers are [5,6,7,...]. The 2nd missing positive integer is 6. <br/> <br/>
     *
     *
     * <b>Constraints:</b> <br/>
     *
     * `1 <= arr.length <= 1000` <br/>
     * `1 <= arr[i] <= 1000` <br/>
     * `1 <= k <= 1000` <br/>
     * `arr[i] < arr[j]` for `1 <= i < j <= arr.length` <br/>
     * </p>
     * <p> <br/> <br/>
     * <b>find the Kth Missing Positive Number.</b>
     *
     * @param arr an array of positive integers sorted in a strictly increasing order
     * @param k a positive integer
     * @return the kth positive integer that is missing from this array
     * </p>
     */
    public int findKthPositive(int[] arr, int k) {
        // Binary Search mechanism
        int left = 0, right = arr.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] - mid - 1 < k) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left + k;

        /* Ordinary Array mechanism
        int last = 0, missing = 0;

        for (int i = 0; i < arr.length; i++) {
            missing += arr[i] - last - 1;

            if (missing >= k) {
                return arr[i] - (missing - k + 1);
            }
            last = arr[i];
        }

        return last + k - missing;
        */
    }
}

package leetcode.difficulty.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
 * Problem Name: Two Sum
 *
 * Problem Link: https://leetcode.com/problems/two-sum/
 *
 * Difficulty: Easy
 *
 * Tags:    Array
 *          Hash Table
 *
 * */
public class Solution_1_TwoSum {
    public static void main(String[] args) {
        int[] numbers_case1 = {2, 7, 11, 15};
        int[] numbers_case2 = {3, 2, 4};
        int[] numbers_case3 = {3, 3};

        int target1 = 9;
        int target2 = 6;
        int target3 = 6;

        Solution_1_TwoSum solve = new Solution_1_TwoSum();

        int[] answer1 = solve.twoSum(numbers_case1, target1);
        int[] answer2 = solve.twoSum(numbers_case2, target2);
        int[] answer3 = solve.twoSum(numbers_case3, target3);

        System.out.println(Arrays.toString(answer1));
        System.out.println(Arrays.toString(answer2));
        System.out.println(Arrays.toString(answer3));
    }

    /**
     *
     * method maxProfit take following
     * @param numbers    integer type array,
     * @param target     the target integer
     * and
     * return            integer array with length 2.
     *
     * <p>
     * Case : Two-pass Hash Table method        Time complexity : O(n)
     * Case : brute force method                Time complexity : O(n^2)
     * Case : Using Array method                Time complexity : O(n log n)
     * </p>
     *
     **/
    public int[] twoSum(int[] numbers, int target) {
        // Two-pass Hash Table solution
        // Time complexity : O(n)
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {
            int complement = target - numbers[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(numbers[i], i);
        }

        // In case there is no solution, we'll just return-null
        return null;
        //

        /* brute force solution
        // time complexity : O(n^2)

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] == target - numbers[i]) {
                    return new int[] { i, j };
                }
            }
        }
        // In case there is no solution, we'll just return-null
        return null;
        */


        /* Using sorted Array with less complexity
        // time complexity : O(n log n)

        int[] targets = {0, 0};
        int[] sortedNumbers = Arrays.copyOf(numbers, numbers.length);
        Arrays.sort(sortedNumbers);

        int left = 0;
        int right = sortedNumbers.length - 1;

        while (left < right) {
            int sum = sortedNumbers[left] + sortedNumbers[right];
            if (sum == target) {
                // We have found the pair of numbers that add up to the target
                break;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        // Map the sorted numbers back to their original indices
        int index = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == sortedNumbers[left] || numbers[i] == sortedNumbers[right]) {
                targets[index++] = i;
            }
        }

        return targets;
        */
    }
}

package leetcode.difficulty.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

/**
 * <p>
 * <b>Problem Name:</b> Daily Temperatures<br/>
 *
 * <b>Problem Link:</b> <a href="https://leetcode.com/problems/daily-temperatures/">Daily Temperatures</a><br/>
 *
 * <b>Difficulty:</b> Medium<br/>
 *
 * <b>Tags:</b>     Array,
 *                  Stack,
 *                  Monotonic Stack,
 * </p>
 */
public class Solution_739_DailyTemperatures {
    public static void main(String[] args) {
        Solution_739_DailyTemperatures solve = new Solution_739_DailyTemperatures();
        int[] input_case1 = {73,74,75,71,69,72,76,73};
        int[] input_case2 = {30,40,50,60};
        int[] input_case3 = {30,60,90};

        ArrayList<int[]> testCases = new ArrayList<>();
        testCases.add(input_case1);
        testCases.add(input_case2);
        testCases.add(input_case3);

        for (int[] test : testCases) {
            int[] result = solve.dailyTemperatures(test);
            System.out.println(Arrays.toString(result));
        }
    }
    /**
     * <p>
     * Given an array of integers `temperatures` represents the daily temperatures,
     * return an array `answer` such that `answer[i]` is the number of days you have
     * to wait after the `ith` day to get a warmer temperature.
     * If there is no future day for which this is possible, keep `answer[i] == 0` instead.
     * <br/> <br/>
     *
     * <b>Example 1:</b> <br/>
     *
     * <b>Input:</b> temperatures = [73,74,75,71,69,72,76,73] <br/>
     * <b>Output:</b> [1,1,4,2,1,1,0,0] <br/>
     *
     * <b>Example 2:</b> <br/>
     *
     * <b>Input:</b> temperatures = [30,40,50,60] <br/>
     * <b>Output:</b> [1,1,1,0] <br/>
     *
     * <b>Example 3:</b> <br/>
     *
     * <b>Input:</b> temperatures = [30,60,90] <br/>
     * <b>Output:</b> [1,1,0] <br/> <br/>
     *
     *
     * <b>Constraints:</b> <br/>
     *
     * 1 <= temperatures.length <= 10^5 <br/>
     * 30 <= temperatures[i] <= 100 <br/>
     * </p>
     *
     * */
    public int[] dailyTemperatures(int[] temperatures) {
        int length = temperatures.length;
        int[] resultDailyTemperatures = new int[length];

        Stack<Node> nodes = new Stack<>();

        for (int index = 0; index < length; index++) {
            while (!nodes.isEmpty() && temperatures[index] > nodes.peek().temperature) {
                int previous = nodes.pop().index;
                resultDailyTemperatures[previous] = index - previous;
            }
            nodes.push(new Node(temperatures[index], 0, index));
        }

        return resultDailyTemperatures;
    }
    /**
     * <p>
     * static Node class with following members: <br/>
     *      temperature, <br/>
     *      dailyTemperature, <br/>
     *      index <br/>
     * </p>
     * */

    static class Node {
        int temperature, dailyTemperature, index;

        public Node(int temperature, int dailyTemperature, int index) {
            this.temperature = temperature;
            this.dailyTemperature = dailyTemperature;
            this.index = index;
        }
    }
}

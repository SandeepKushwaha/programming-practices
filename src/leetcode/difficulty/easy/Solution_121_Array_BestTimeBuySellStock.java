package leetcode.difficulty.easy;

/**
 * <p>
 * <b>Problem Name:</b> Best time to buy and sell stock
 * <br/>
 * <b>Problem Link:</b> <a href="https://leetcode.com/problems/best-time-to-buy-and-sell-stock/">Best time to buy and sell stock</a>
 * <br/>
 * <b>Difficulty:</b> Easy
 * <br/>
 * <b>Tags:</b>    Array,
 *              Math
 * </p>
 * */

public class Solution_121_Array_BestTimeBuySellStock {
    public static void main(String[] args) {
        int[] case1 = {7, 1, 5, 3, 6, 4};
        int[] case2 = {7, 6, 4, 3, 1};

        Solution_121_Array_BestTimeBuySellStock solve = new Solution_121_Array_BestTimeBuySellStock();

        System.out.println(solve.maxProfit(case1));
        System.out.println();
        System.out.println(solve.maxProfit(case2));
    }
    /**
     *
     * <p>You are given an array prices where prices[i] is the price of a given stock on the ith day.
     * <br/>
     * You want to maximize your profit by choosing a single day to buy one stock and choosing a
     * different day in the future to sell that stock.
     * <br/>
     * Return the maximum profit you can achieve from this transaction.
     * If you cannot achieve any profit, return 0.</p>
     * </p>
     * <p>
     * method maxProfit take following
     * @param prices:   integer type array
     * and <br/>
     * return:          integer that represent the maximum profit
     * <p/>
     * <p>
     * Time complexity : O(n)
     * Space complexity : O(1)
     * </p>
     *
     **/
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            } else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice;
            }
        }

        return maxProfit;
    }


}

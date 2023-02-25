package leetcode.difficulty.easy;

/*
 * Problem Name: Best time to buy and sell stock
 *
 * Problem Link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 *
 * Difficulty: Easy
 *
 * Tags:    Array
 *          Math
 *
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
     * method maxProfit take following
     * @param prices:   integer type array
     * return:          integer that represent the maximum profit
     *
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

package leetcode.difficulty.medium;

/**
 * <p>
 * <b>Problem Name:</b> Koko Eating Bananas<br/>
 * <b>Problem Link:</b> <a href="https://leetcode.com/problems/koko-eating-bananas/">Koko Eating Bananas</a><br/>
 * <b>Difficulty:</b> Medium<br/>
 * <b>Tags:</b>     Array,
 *                  Binary Search, <br/>
 * </p>
 *
 * <p>
 * The Solution_875_KokoEatingBananas class contains a method to solve the "Koko Eating Bananas" problem.
 * <br/><br/>
 *
 * Problem Statement: <br/>
 * Koko loves to eat bananas. There are `n` piles of bananas, the `ith` pile has `piles[i]` bananas.
 * The guards have gone and will come back in h hours.<br/>
 * Koko can decide her bananas-per-hour eating speed of `k`. Each hour, she chooses some pile of bananas
 * and eats `k` bananas from that pile. If the pile has less than `k` bananas, she eats all of them instead
 * and will not eat any more bananas during this hour.<br/>
 * Koko likes to eat slowly but still wants to finish eating all the bananas before the guards return.<br/>
 * Return the minimum integer `k` such that she can eat all the bananas within `h` hours.<br/>
 * <br/><br/>
 *
 * Solution: <br/>
 * We can use binary search to find the minimum integer k such that Koko can eat all the bananas
 * within h hours. The search space for k is [1, max(piles)], where max(piles) is the maximum number
 * of bananas in any pile. <br/>We start with the middle value of the search space as the initial value
 * of k, and then check if it is possible to eat all the bananas within h hours by simulating the
 * process of Koko eating bananas.<br/> If it is possible, we can try a smaller value of k, and if it
 * is not possible, we can try a larger value of k.<br/> We simulate the process of Koko eating bananas
 * by iterating over all the piles of bananas and calculating the number of hours it would take to
 * eat each pile using the formula (piles[i] + k - 1) / k, which rounds up the result of dividing
 * piles[i] by k to the nearest integer. <br/>We add up all these hours to get the total number of hours
 * it would take Koko to eat all the bananas.
 * <br/> <br/>
 *
 * <b>Example 1:</b> <br/>
 *
 * <b>Input:</b> piles = [3,6,7,11], h = 8 <br/>
 * <b>Output:</b> 4 <br/><br/>
 * <b>Example 2:</b> <br/>
 *
 * <b>Input:</b> piles = [30,11,23,4,20], h = 5 <br/>
 * <b>Output:</b> 30 <br/><br/>
 * <b>Example 3:</b> <br/>
 *
 * <b>Input:</b> piles = [30,11,23,4,20], h = 6 <br/>
 * <b>Output:</b> 23 <br/>
 * <br/><br/>
 *
 * <b>Constraints:</b> <br/>
 *
 * 1 <= piles.length <= 10^4 <br/>
 * piles.length <= h <= 10^9 <br/>
 * 1 <= piles[i] <= 10^9 <br/><br/>
 * </p>
 */
public class Solution_875_KokoEatingBananas {
    public static void main(String[] args) {
        Solution_875_KokoEatingBananas solve = new Solution_875_KokoEatingBananas();

        int[] test_piles1 = {3, 6, 7, 11};
        int[] test_piles2 = {30, 11, 23, 4, 20};
        int[] test_piles3 = {30, 11, 23, 4, 20};

        System.out.println(solve.minEatingSpeed(test_piles1, 8));
        System.out.println(solve.minEatingSpeed(test_piles2, 5));
        System.out.println(solve.minEatingSpeed(test_piles3, 6));
    }
    /**
     * Finds the minimum integer k such that Koko can eat all the bananas within h hours.
     * @param piles an array of integers representing the number of bananas in each pile
     * @param h an integer representing the number of hours Koko has to eat all the bananas
     * @return the minimum integer k such that Koko can eat all the bananas within h hours
     */
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = 0;
        for (int pile : piles) {
            right = Math.max(right, pile);
        }
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (canEatAll(piles, h, mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    /**
     * Checks if it is possible to eat all the bananas within h hours using the given value of k.
     * @param piles an array of integers representing the number of bananas in each pile
     * @param h an integer representing the number of hours Koko has to eat all the bananas
     * @param k an integer representing the number of bananas Koko can eat per hour
     * @return true if it is possible to eat all the bananas within h hours using the given value of k, false otherwise
     */
    private boolean canEatAll(int[] piles, int h, int k) {
        int totalHours = 0;

        for (int pile : piles) {
            totalHours += (pile + k - 1) / k;
            if (totalHours > h)
                return false;
        }

        return true;
    }
}

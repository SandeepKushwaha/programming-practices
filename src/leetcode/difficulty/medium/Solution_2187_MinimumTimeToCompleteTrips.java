package leetcode.difficulty.medium;

/**
 * <p>
 * <b>Problem Name:</b> Minimum Time to Complete Trips<br/>
 *
 * <b>Problem Link:</b> <a href="https://leetcode.com/problems/minimum-time-to-complete-trips/">Minimum Time to Complete Trips</a><br/>
 *
 * <b>Difficulty:</b> Medium<br/>
 *
 * <b>Tags:</b>     Array,
 *                  Binary Search,
 * </p>
 */
public class Solution_2187_MinimumTimeToCompleteTrips {
    public static void main(String[] args) {
        Solution_2187_MinimumTimeToCompleteTrips solve = new Solution_2187_MinimumTimeToCompleteTrips();

        int[] input_test1 = {1, 2, 3};
        int[] input_test2 = {2};

        System.out.println(solve.minimumTime(input_test1, 5));
        System.out.println(solve.minimumTime(input_test2, 1));
    }
    /**
     *
     * <p>
     * You are given an array `time` where `time[i]` denotes the time taken by the `ith` bus to complete <b>one trip.</b>
     * <br/> <br/>
     * Each bus can make multiple trips <b>successively</b>; that is, the next trip can start <b>immediately after</b> completing the current trip. Also, each bus operates <b>independently</b>; that is, the trips of one bus do not influence the trips of any other bus.
     * <br/> <br/>
     * You are also given an integer `totalTrips`, which denotes the number of trips all buses should make in total. Return the minimum time required for all buses to complete <b>at least</b> `totalTrips` trips.
     * <br/><br/>
     *
     *
     * <b>Example 1:</b> <br/>
     *
     * <b>Input:</b> time = [1,2,3], totalTrips = 5 <br/>
     * <b>Output:</b> 3 <br/>
     * <b>Explanation:</b> <br/>
     * - At time t = 1, the number of trips completed by each bus are [1,0,0]. <br/>
     *   The total number of trips completed is 1 + 0 + 0 = 1. <br/>
     * - At time t = 2, the number of trips completed by each bus are [2,1,0]. <br/>
     *   The total number of trips completed is 2 + 1 + 0 = 3. <br/>
     * - At time t = 3, the number of trips completed by each bus are [3,1,1]. <br/>
     *   The total number of trips completed is 3 + 1 + 1 = 5. <br/>
     * So the minimum time needed for all buses to complete at least 5 trips is 3.
     * <br/> <br/>
     * <b>Example 2:</b>
     * <br/>
     * <b>Input:</b> time = [2], totalTrips = 1 <br/>
     * <b>Output:</b> 2 <br/>
     * <b>Explanation:</b>  <br/>
     * There is only one bus, and it will complete its first trip at t = 2. <br/>
     * So the minimum time needed to complete 1 trip is 2. <br/>
     * <br/> <br/>
     *
     * <b>Constraints:</b>
     * <br/>
     * 1 <= time.length <= 10^5 <br/>
     * 1 <= time[i], totalTrips <= 10^7 <br/>
     * </p>
     * <br/><br/>
     * <p>
     * Calculates the minimum time required for all buses to complete at least totalTrips trips.
     * @param time an array of integers representing the time taken by each bus to complete one trip
     * @param totalTrips an integer representing the number of trips all buses should make in total
     * @return the minimum time required for all buses to complete at least totalTrips trips
     * </p>
     *
     */
    public long minimumTime(int[] time, int totalTrips) {
        long left = 0, right = (long) 1e15;

        while (left < right) {
            long mid = (left + right) / 2;

            long trips = 0;
            for (int t : time) {
                trips += mid / t;
                if (trips >= totalTrips)
                    break;
            }

            if (trips >= totalTrips)
                right = mid;
            else
                left = mid + 1;
        }

        return left;
    }
}

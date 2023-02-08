package coding_ninjas.data_structures_in_java.tests.test4;

public class MinimumCount {
    public static int minCount(int n) {
        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */
        int[] dp = new int[n + 1];
        dp[0] = 0;
        for (int i = 1; i <= n; i++) {
            dp[i] = Integer.MAX_VALUE;
            for (int j = 1; j * j <= i; j++) {
                int val = dp[i - j * j] + 1;
                if (val < dp[i]) {
                    dp[i] = val;
                }

            }
        }
        return dp[n];
    }
}

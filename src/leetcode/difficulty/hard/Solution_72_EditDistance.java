package leetcode.difficulty.hard;

/**
 * <p>
 * <b>Problem Name:</b> Edit Distance <br/>
 *
 * <b>Problem Link:</b> <a href="https://leetcode.com/problems/roman-to-integer/">Roman to Integer</a><br/>
 *
 * <b>Difficulty:</b> Hard<br/>
 *
 * <b>Tags:</b>     String,
 *                  Dynamic Programming,
 * </p>
 */
public class Solution_72_EditDistance {
    public static void main(String[] args) {
        Solution_72_EditDistance solve = new Solution_72_EditDistance();

        System.out.println(solve.minDistance("horse", "ros"));
        System.out.println(solve.minDistance("intention", "execution"));
    }

    /**
     * <p>
     * Given two strings <i>word1</i> and <i>word2</i>, return the minimum
     * number of operations required to convert <i>word1</i> to <i>word2</i>.
     * <br/>
     * You have the following three operations permitted on a word:
     * <br/>
     * Insert a character,<br/>
     * Delete a character,<br/>
     * Replace a character.<br/>
     *
     * <p><br/></p>
     *
     * <p>Example 1: <br/>
     * <b>Input:</b> word1 = "horse", word2 = "ros"<br/>
     * <b>Output:</b> 3 <br/>
     * <b>Explanation:</b> <br/>
     * horse -> rorse (replace 'h' with 'r')
     * rorse -> rose (remove 'r')
     * rose -> ros (remove 'e')
     * </p>
     *
     * <p><br/></p>
     *
     * <p>Example 2: <br/>
     * <b>Input:</b> word1 = "intention", word2 = "execution"<br/>
     * <b>Output:</b> 5<br/>
     * <b>Explanation:</b> <br/>
     * intention -> inention (remove 't')
     * inention -> enention (replace 'i' with 'e')
     * enention -> exention (replace 'n' with 'x')
     * exention -> exection (replace 'n' with 'c')
     * exection -> execution (insert 'u')
     * </p>
     *
     * <p><b>Constraints:</b>
     * <br/>
     * 0 <= word1.length, word2.length <= 500 <br/>
     * word1 and word2 consist of lowercase English letters. <br/>
     * </p>
     *
     * <p><br/></p>
     *
     * <br/>
     * method minDistance takes
     * @param word1 first String
     * @param word2 second String
     * return integer for distance.
     * </p>
     *
     **/
    public int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        int[][] dp = new int[m+1][n+1];

        for (int i = 0; i <= m; i++)
            dp[i][0] = i;

        for (int j = 0; j <= n; j++)
            dp[0][j] = j;

        for (int i = 1; i <= m; i++)
            for (int j = 1; j <= n; j++)
                if (word1.charAt(i - 1) == word2.charAt(j - 1))
                    dp[i][j] = dp[i - 1][j - 1];
                else
                    dp[i][j] = 1 + Math.min(dp[i - 1][j], Math.min(dp[i][j - 1], dp[i - 1][j - 1]));

        return dp[m][n];
    }

    /**
     * Solving using recurrence
     * */
    public int minDistanceUsingRecurrence(String word1, String word2) {
        return minDistanceRecur(word1, word2, word1.length(), word2.length());
    }

    private int minDistanceRecur(String word1, String word2, int word1Index, int word2Index) {
        if (word1Index == 0) {
            return word2Index;
        }
        if (word2Index == 0) {
            return word1Index;
        }
        if (word1.charAt(word1Index - 1) == word2.charAt(word2Index - 1)) {
            return minDistanceRecur(word1, word2, word1Index - 1, word2Index - 1);
        } else {
            int insertOperation = minDistanceRecur(word1, word2, word1Index, word2Index - 1);
            int deleteOperation = minDistanceRecur(word1, word2, word1Index - 1, word2Index);
            int replaceOperation = minDistanceRecur(word1, word2, word1Index - 1, word2Index - 1);
            return Math.min(insertOperation, Math.min(deleteOperation, replaceOperation)) + 1;
        }
    }
}

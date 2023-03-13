package leetcode.difficulty.easy;

/**
 * <p>
 * <b>Problem Name:</b> Check If Two String Arrays are Equivalent<br/>
 * <b>Problem Link:</b> <a href="https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/">Check If Two String Arrays are Equivalent</a><br/>
 * <b>Difficulty:</b> easy<br/>
 * <b>Tags:</b>     Array,
 *                  String, <br/>
 * </p>
 *
 * <p>
 * Problem Statement: <br/>
 * Given two string arrays `word1` and `word2`, return `true` if the two arrays represent the same string, and `false` otherwise.
 * <br/>
 * A string is represented by an array if the array elements concatenated in order forms the string.
 * <br/><br/>
 *
 * Solution: <br/>
 * The problem statement requires us to determine if the concatenation of all the strings in two given
 * string arrays (word1 and word2) produces the same result.
 * <br/>
 * The solution first creates two StringBuilder objects to concatenate all the strings in the input arrays.
 * It then returns whether or not the two concatenated strings are equal.
 * <br/>
 * The time complexity of the solution is O(N), where N is the total number of characters in both word1 and word2.
 * This is because the solution iterates over all the strings in the input arrays once and then creates a
 * new string by invoking the toString() method on each of the two StringBuilder objects.
 * The space complexity of the solution is also O(N), because the two StringBuilder objects are created
 * to concatenate the strings.
 * <br/> <br/>
 *
 * <b>Example 1:</b> <br/>
 *
 * <b>Input:</b> word1 = ["ab", "c"], word2 = ["a", "bc"]<br/>
 * <b>Output:</b> true<br/>
 * <b>Explanation:</b>  <br/>
 * word1 represents string "ab" + "c" -> "abc" <br/>
 * word2 represents string "a" + "bc" -> "abc" <br/>
 * The strings are the same, so return true.
 * <br/><br/>
 *
 * <b>Example 2:</b> <br/>
 *
 * <b>Input:</b> word1 = ["a", "cb"], word2 = ["ab", "c"]<br/>
 * <b>Output:</b> false<br/><br/>
 * <b>Example 3:</b> <br/>
 *
 * <b>Input:</b> word1  = ["abc", "d", "defg"], word2 = ["abcddefg"]<br/>
 * <b>Output:</b> true <br/>
 * <br/><br/>
 *
 * <b>Constraints:</b> <br/>
 *
 * `1 <= word1.length, word2.length <= 10^3` <br/>
 * `1 <= word1[i].length, word2[i].length <= 10^3` <br/>
 * `1 <= sum(word1[i].length), sum(word2[i].length) <= 10^3` <br/>
 * `word1[i] and `word2[i]` consist of lowercase letters.<br/><br/>
 *
 *
 * </p>
 */
public class Solution_1662_CheckIfTwoStringArraysAreEquivalent {

    // main method
    public static void main(String[] args) {
        Solution_1662_CheckIfTwoStringArraysAreEquivalent solve = new Solution_1662_CheckIfTwoStringArraysAreEquivalent();
        String[] input_word1 = {"ab", "c"};
        String[] input_word2 = {"a", "bc"};
        System.out.println(solve.arrayStringsAreEqual(input_word1, input_word2));

        String[] word1 = {"abc", "d", "defg"};
        String[] word2 = {"abcddefg"};
        System.out.println(solve.arrayStringsAreEqual(word1, word2));
    }

    /**
     * Getting two String arrays and finding the string concatenation comparison between word1 and word2
     * @param word1 a String array 1st
     * @param word2 a String array 2nd
     * @return true or false based on string concatenation comparison between word1 and word2
     */
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        var builder1 = new StringBuilder();
        for (String str : word1) {
            builder1.append(str);
        }
        var builder2 = new StringBuilder();
        for (String str: word2) {
            builder2.append(str);
        }

        return builder1.toString().equals(builder2.toString());
    }
}

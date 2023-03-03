package leetcode.difficulty.medium;

/**
 * <p>
 * <b>Problem Name:</b> Find the Index of the First Occurrence in a String<br/>
 *
 * <b>Problem Link:</b> <a href="https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/">Find the Index of the First Occurrence in a String</a><br/>
 *
 * <b>Difficulty:</b> Medium<br/>
 *
 * <b>Tags:</b>     String,
 *                  String Matching,
 *                  Two Pointers,
 * </p>
 */
public class Solution_28_FindIndexFirstOccurrenceString {
    public static void main(String[] args) {
        Solution_28_FindIndexFirstOccurrenceString sol = new Solution_28_FindIndexFirstOccurrenceString();

        System.out.println(sol.strStr("sadbutsad", "sad"));
        System.out.println(sol.strStr("leetcode", "leeto"));
    }
    /**
     * <p>
     * Given two strings `needle` and `haystack`, return the index of the first
     * occurrence of `needle` in `haystack`, or `-1` if needle is not part of haystack.
     * <br/><br/>
     * <b>Example 1:</b>
     * <br/>
     * <b>Input:</b> haystack = "sadbutsad", needle = "sad" <br/>
     * <b>Output:</b> 0 <br/>
     * <b>Explanation:</b> "sad" occurs at index 0 and 6.<br/>
     * The first occurrence is at index 0, so we return 0. <br/><br/>
     * <b>Example 2:</b>
     * <br/>
     * <b>Input:</b> haystack = "leetcode", needle = "leeto"<br/>
     * <b>Output:</b> -1 <br/>
     * <b>Explanation:</b> "leeto" did not occur in "leetcode", so we return -1.
     * <br/>
     * <br/>
     * <b>Constraints:</b>
     * <br/>
     * 1 <= haystack.length, needle.length <= 10^4<br/>
     * haystack and needle consist of only lowercase English characters. <br/>
     * </p>
     *
     * */
    public int strStr(String haystack, String needle) {
        // use the built-in indexOf() method of the String class
        // return haystack.indexOf(needle);

        // without using indexOf() i.e. if indexOf not allowed
        if (needle.isEmpty()) return 0;
        for (int i = 0; i <= (haystack.length() - needle.length()); i++) {
            if (haystack.startsWith(needle, i))
                return i;
        }

        return -1;
    }
}

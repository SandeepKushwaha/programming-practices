package leetcode.difficulty.medium;

import java.util.ArrayList;

/**
 * <p>
 * <b>Problem Name:</b> String Compression<br/>
 *
 * <b>Problem Link:</b> <a href="https://leetcode.com/problems/string-compression/">String Compression</a><br/>
 *
 * <b>Difficulty:</b> Medium<br/>
 *
 * <b>Tags:</b>     Array,
 *                  String,
 *                  Two Pointer,
 * </p>
 */
public class Solution_443_StringCompression {
    public static void main(String[] args) {
        Solution_443_StringCompression solve = new Solution_443_StringCompression();

        char[] input_case1 = {'a','a','b','b','c','c','c'};
        char[] input_case2 = {'a'};
        char[] input_case3 = {'a','b','b','b','b','b','b','b','b','b','b','b','b'};

        ArrayList<char[]> list = new ArrayList<>();
        list.add(input_case1);
        list.add(input_case2);
        list.add(input_case3);

        for (char[] stringArr : list) {
            int lengthArr = solve.compress(stringArr);
            for (int i = 0; i < lengthArr; i++) {
                System.out.print(input_case1[i] + " ");
            }
            System.out.println();
        }

    }

    /**
     * <p>
     * Given an array of characters `chars`, compress it using the following algorithm:
     * <br/>
     * Begin with an empty string `s`. For each group of consecutive repeating characters in `chars`:
     * <br/>
     *  - If the group's length is `1`, append the character to `s`. <br/>
     *  - Otherwise, append the character followed by the group's length. <br/>
     * <br/>
     * The compressed string `s` should not be returned separately, but instead, be stored in the input character array `chars`.
     * Note that group lengths that are `10` or longer will be split into multiple characters in `chars`.
     * <br/>
     * After you are done modifying the input array, return the new length of the array.
     * <br/>
     * You must write an algorithm that uses only constant extra space.
     * </p>
     * <p>
     * <b>Constraints:</b>
     * <br/>
     * 1 <= chars.length <= 2000 <br/>
     * `chars[i]` is a lowercase English letter, uppercase English letter, digit, or symbol. <br/>
     * </p>
     *
     * <p>
     * Example 1:
     * <br/>
     * <b>Input:</b> chars = ["a","a","b","b","c","c","c"]<br/>
     * <b>Output:</b> Return 6, and the first 6 characters of the input array should be: ["a","2","b","2","c","3"]<br/>
     * <b>Explanation:</b> The groups are "aa", "bb", and "ccc". This compresses to "a2b2c3".<br/>
     * <b>Example 2:</b>
     * <br/>
     * <b>Input:</b> chars = ["a"]<br/>
     * <b>Output:</b> Return 1, and the first character of the input array should be: ["a"]<br/>
     * <b>Explanation:</b> The only group is "a", which remains uncompressed since it's a single character.<br/><br/>
     * <b>Example 3:</b>
     * <br/>
     * <b>Input:</b> chars = ["a","b","b","b","b","b","b","b","b","b","b","b","b"]<br/>
     * <b>Output:</b> Return 4, and the first 4 characters of the input array should be: ["a","b","1","2"].<br/>
     * <b>Explanation:</b> The groups are "a" and "bbbbbbbbbbbb". This compresses to "ab12". <br/>
     * </p>
     **/
    public int compress(char[] chars) {
        StringBuilder compress = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {

            int count = 1;
            while (i < chars.length - 1 && (chars[i] == chars[i+1])) {
                count++;
                i++;
            }
            compress.append(chars[i]);
            if (count > 1) compress.append(count);
        }

        for (int i = 0; i < compress.length(); i++) {
            chars[i] = compress.charAt(i);
        }

        return compress.length();
    }
}

package leetcode.difficulty.easy;

/**
 * <p>
 * <b>Problem Name:</b> Palindrome Number
 * <br/>
 * <b>Problem Link:</b> <a href="https://leetcode.com/problems/palindrome-number/">Palindrome Number</a>
 * <br/>
 * <b>Difficulty:</b> Easy
 * <br/>
 * <b>Tags:</b>    Math,
 * </p>
 *
 * */

public class Solution_9_PalindromeNumber {
    public static void main(String[] args) {
        Solution_9_PalindromeNumber solve = new Solution_9_PalindromeNumber();
        System.out.println(solve.isPalindrome(121));
        System.out.println(solve.isPalindrome(-121));
        System.out.println(solve.isPalindrome(10));
    }

    /**
     * <p> Check the Number is <b>Palindrome</b> or not. <br/>
     * Given <br/>@param integer x, <br/>return boolean. <br/>i.e. true if x is a
     * palindrome
     * , and false otherwise.</p>
     *
     * */
    public boolean isPalindrome(int x) {
        // Using String.
        String str = String.valueOf(x);
        for (int i = 0, j = str.length() - 1; i < str.length()/2; i++, j--)
            if (str.charAt(i) != str.charAt(j))
                return false;
        return true;
        /* Using Integer.
        int n = x, reverse = 0;
        while (n != 0) {
            reverse = (reverse * 10) + (n % 10);
            n /= 10;
        }
        return x == reverse;
        */
    }
}

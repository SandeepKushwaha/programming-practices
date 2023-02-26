package leetcode.difficulty.easy;

/*
 * Problem Name: Palindrome Number
 *
 * Problem Link: https://leetcode.com/problems/palindrome-number/
 *
 * Difficulty: Easy
 *
 * Tags:    Math
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
        int n = x, reverse = 0;
        while (n != 0) {
            reverse = (reverse * 10) + (n % 10);
            n /= 10;
        }
        return x == reverse;
    }
}

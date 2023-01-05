package gfg.school;

/*
 *
 * problem : https://practice.geeksforgeeks.org/problems/sum-palindrome3857/1
 *
 * */

//{ Driver Code Starts
//Initial Template for Java

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number_SumPalindrome {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            long n = Integer.parseInt(read.readLine());
            SumPalindromeSolution ob = new SumPalindromeSolution();

            System.out.println(ob.isSumPalindrome(n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class SumPalindromeSolution {
    static long getReverse(long n) {
        long reverse = 0;
        while (n > 0) {
            reverse = (reverse * 10) + n % 10;
            n /= 10;
        }
        return reverse;
    }

    static boolean isPalindrome(long n) {
        long reverse = getReverse(n);
        return n == reverse;
    }

    /*static*/ long isSumPalindrome(long n) {
        // code here

        if (n > 0 && n <= 1_000_000L) {
            long number = n;
            for (int i = 1; i <= 5; i++) {
                if (isPalindrome(number)) {
                    return number;
                }
                number += getReverse(number);
                if (isPalindrome(number)) {
                    return number;
                }
            }

        }

        return -1;
    }
}



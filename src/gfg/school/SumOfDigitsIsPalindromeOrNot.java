package gfg.school;

//{ Driver Code Starts
// Initial Template for Java


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class SumOfDigitsIsPalindromeOrNot {
    public static void main(String[] args) throws IOException {
        BufferedReader read =
                new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            SumOfDigitsIsPalindromeOrNotSolution ob = new SumOfDigitsIsPalindromeOrNotSolution();
            System.out.println(ob.isDigitSumPalindrome(N));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class SumOfDigitsIsPalindromeOrNotSolution {
    int isDigitSumPalindrome(int N) {
        if (N >= 1 && N <= 1_000_000_000) {
            int temp = N;
            int digitSum = 0;
            int reverse = 0;
            while(temp > 0) {
                digitSum += temp%10;
                temp /= 10;
            }

            temp = digitSum;
            while (temp > 0) {
                reverse = (reverse * 10) + temp%10;
                temp /= 10;
            }

            return reverse == digitSum ? 1 : 0;
        }

        return 0;
    }
}


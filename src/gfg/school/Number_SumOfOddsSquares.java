package gfg.school;

/*
 *
 * problem : https://practice.geeksforgeeks.org/problems/power-of-pow-odd-numbers1103/1
 *
 * */

//{ Driver Code Starts
//Initial Template for Java

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number_SumOfOddsSquares {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            long n = Long.parseLong(br.readLine().trim());
            SumOfOddsSquaresSolution ob = new SumOfOddsSquaresSolution();
            long ans = ob.sum_of_square_oddNumbers(n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class SumOfOddsSquaresSolution {
    public long sum_of_square_oddNumbers(long n) {
        // Code here
        long sum = 0;

        for (int i = 1; i <= n * 2; i += 2) {
            sum += Math.pow(i, 2);
        }

        return sum;
    }
}

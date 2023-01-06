package gfg.school;

/*
 *
 * problem : https://practice.geeksforgeeks.org/problems/power-of-pow-even-number5440/1
 *
 * */

//{ Driver Code Starts
//Initial Template for Java

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number_SumOfSquareEvenNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            long n = Long.parseLong(br.readLine().trim());
            SumOfSquareEvenNumbersSolution ob = new SumOfSquareEvenNumbersSolution();
            long ans = ob.sum_of_square_evenNumbers(n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class SumOfSquareEvenNumbersSolution {
    public long sum_of_square_evenNumbers(long n) {
        // Code here
        long sum = 0;
        // check the constraints
        if (n > 0 && n <= 10_000) {
            // calc the evenNumber square and add all
            for (int i = 2; i <= n * 2; i += 2) {
                sum += Math.pow(i, 2);
            }
        }

        return sum;
    }
}

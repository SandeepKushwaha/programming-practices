package gfg.school;

/*
 *
 * problem : https://practice.geeksforgeeks.org/problems/find-n-th-term-of-series-1-3-6-10-15-215506/1
 *
 * */

//{ Driver Code Starts
//Initial Template for Java

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumOfNthNaturalNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());

            SumOfNaturalNumbersSolution ob = new SumOfNaturalNumbersSolution();
            System.out.println(ob.findNthTerm(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class SumOfNaturalNumbersSolution {
    /*static*/ int findNthTerm(int N) {
        // Using Formula for calculating Sum of Nth Term of Natural Numbers
        // i.e. Sum of N Natural Numbers = n * (n+1)/2

        return N * (N+1)/2;

        /*int sum = 0;
        // check the constraints
        if (N > 0 && N <= 100_000) {
            // Using Stream function to Iteration and calculating sum
            sum = IntStream.rangeClosed(0, N).sum();
            *//* The Traditional Way to Iteration and calculating sum
            for (int i = 0; i <= N; i++) {
                sum += i;
            }
            *//*
        }
        return sum;*/
    }
}




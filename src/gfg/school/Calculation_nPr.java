package gfg.school;

/*
 *
 * problem :https://practice.geeksforgeeks.org/problems/npr4253/1
 *
 * */

//{ Driver Code Starts
//Initial Template for Java

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculation_nPr {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while (t-- > 0) {
            String[] a = in.readLine().trim().split("\\s+");
            long n = Long.parseLong(a[0]);
            long r = Long.parseLong(a[1]);

            nPrSolution ob = new nPrSolution();
            System.out.println(ob.nPr(n, r));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class nPrSolution {
    static long factorial(long number) {
        if (number <= 0) return 1;

        return number * factorial(number - 1);
    }

    /*static*/ long nPr(long n, long r) {
        return factorial(n) / factorial(n - r);

    }
}

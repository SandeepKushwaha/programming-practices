package gfg.school;

/*
 *
 * problem : https://practice.geeksforgeeks.org/problems/small-factorial0854/1
 *
 * */

//{ Driver Code Starts
//Initial Template for Java

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number_SmallFactorial {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            SmallFactorialSolution ob = new SmallFactorialSolution();
            long ans = ob.find_fact(n);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class SmallFactorialSolution {
    public long find_fact(int n) {
        // Code here
        long fact = 1;
        if (n > 1 && n <= 18) fact = n * find_fact(n - 1);
        return fact;
    }
}



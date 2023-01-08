package gfg.school;

/*
 *
 * problem : https://practice.geeksforgeeks.org/problems/simple-interest3457/1
 *
 * */

//{ Driver Code Starts
// Initial Template for Java

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Calculate_SimpleInterest {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String[] S = read.readLine().split(" ");
            int P = Integer.parseInt(S[0]);
            int R = Integer.parseInt(S[1]);
            int T = Integer.parseInt(S[2]);
            SimpleInterestSolution ob = new SimpleInterestSolution();
            out.println(String.format("%.2f", ob.simpleInterest(P, R, T)));
        }
        out.flush();
    }
}
// } Driver Code Ends


// User function Template for Java

class SimpleInterestSolution {
    double simpleInterest(int P, int R, int T) {
        // formula : Simple Interest = Principal * (Rate/100) * Time.
        return P * R * T / 100.0;
    }
}



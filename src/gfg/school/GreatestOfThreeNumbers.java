package gfg.school;

/*
 *
 * problem : https://practice.geeksforgeeks.org/problems/greatest-of-three-numbers2520/1
 *
 * */

//{ Driver Code Starts
// Initial Template for Java

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GreatestOfThreeNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String[] S = read.readLine().split(" ");
            int A = Integer.parseInt(S[0]);
            int B = Integer.parseInt(S[1]);
            int C = Integer.parseInt(S[2]);
            GreatestOfThreeNumbersSolution ob = new GreatestOfThreeNumbersSolution();
            System.out.println(ob.greatestOfThree(A, B, C));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class GreatestOfThreeNumbersSolution {
    int greatestOfThree(int A, int B, int C) {
        // check the constraints
        if (A >= -1000000000 && B >= -1000000000 && C >= -1000000000 && A <= 1000000000 && B <= 1000000000 && C <= 1000000000) {

            // test the comparison
            return A > B ? (Math.max(A, C)) : (Math.max(B, C));
            // return A > B ? (A > C ? A : C) : (B > C ? B : C);
        }

        throw new RuntimeException("A, B or C out of bound with constraints");
    }
}



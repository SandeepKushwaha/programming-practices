package gfg.school;

/*
 *
 * problem : https://practice.geeksforgeeks.org/problems/gcd-of-two-numbers3459/1
 *
 * */

//{ Driver Code Starts
//Initial Template for Java

import java.util.Scanner;

public class GCD_OfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            GCD_OfTwoNumbersSolution ob = new GCD_OfTwoNumbersSolution();
            System.out.println(ob.gcd(A, B));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class GCD_OfTwoNumbersSolution {
    public int gcd(int A, int B) {
        if (A > -1 && B > -1 && A <= 1_000_000_000 && B <= 1_000_000_000) {
            // return A == 0 ? B : gcd(B%A, A);
            if (A == 0)
                return B;

            return gcd(B % A, A);
        }
        return 0;
    }
}


package gfg.school;

/*
 *
 * problem : https://practice.geeksforgeeks.org/problems/java-loops-set-11726/1
 *
 * */

//{ Driver Code Starts
//Initial Template for Java

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class JavaLoops_Set1 {
    public static void main(String[] args) throws IOException {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-- > 0) {
            int N = scn.nextInt();

            JavaLoops_Set1Solution ob = new JavaLoops_Set1Solution();
            ArrayList<Integer> sum = ob.getSum(N);
            System.out.println(sum.get(0) + " " + sum.get(1));
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class JavaLoops_Set1Solution {
    /*static*/ ArrayList<Integer> getSum(int N) {
        // code here
        ArrayList<Integer> results = new ArrayList<>();
        int even = 0;
        int odd = 0;

        if (N >= 1 && N <= 10_000) {
            for (int i = 1; i <= N; i++) {
                if (i % 2 == 0) even += i;
                else odd += i;
            }
        }

        results.add(even);
        results.add(odd);

        return results;
    }
}



package gfg.school;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 *
 * Problem : https://practice.geeksforgeeks.org/problems/second-largest3735/1
 *
 * */


//{ Driver Code Starts
//Initial Template for Java


public class Array_SecondLargest_Distinct {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new SolutionForSecondHighest().print2largest(arr, n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class SolutionForSecondHighest {
    int print2largest(int[] arr, int n) {
        int highest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {

            if (arr[i] > highest) {
                second = highest;
                highest = arr[i];
            }

            if (arr[i] > second && arr[i] < highest) {
                second = arr[i];
            }
        }

        if (second == Integer.MIN_VALUE) {
            second = -1;
        }

        return second;
    }
}
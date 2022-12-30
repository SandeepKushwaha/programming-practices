package gfg.school;

/*
 *
 * problem : https://practice.geeksforgeeks.org/problems/smaller-and-larger4005/1
 *
 * */

//{ Driver Code Starts
//Initial Template for Java

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Array_SmallerAndLarger {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int x = Integer.parseInt(inputLine[1]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");

            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int[] ans = new Array_SmallerAndLargerSolve().getMoreAndLess(arr, n, x);
            System.out.println(ans[0] + " " + ans[1]);
        }
    }
}


// } Driver Code Ends


//User function Template for Java


class Array_SmallerAndLargerSolve {
    int[] getMoreAndLess(int[] arr, int ignoredN, int x) {
        // code here
        int[] result = {0, 0};
        for (int item : arr) {
            if (item <= x) {
                result[0]++;
            }
            if (item >= x) {
                result[1]++;
            }
        }

        return result;
    }
}


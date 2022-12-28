package gfg.school;

/*
*
* problem : https://practice.geeksforgeeks.org/problems/sum-of-array2326/1
*
* */

//{ Driver Code Starts
// Initial Template for Java


import java.io.BufferedReader;
import java.io.InputStreamReader;

class SumOfArray {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().trim().split(" ");
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(str[i]);
            }

            int ans = new SumOfArraySolution().sum(arr, n);

            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class SumOfArraySolution {
    int sum(int[] arr, int ignoredN) {
        int sum = 0;
        for (int item : arr) {
            sum += item;
        }
        return sum;
    }
}

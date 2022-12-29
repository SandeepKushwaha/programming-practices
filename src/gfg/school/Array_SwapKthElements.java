package gfg.school;

/*
*
* problem : https://practice.geeksforgeeks.org/problems/swap-kth-elements5500/1
*
* */

//{ Driver Code Starts
//Initial Template for Java

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Array_SwapKthElements {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int k = Integer.parseInt(inputLine[1]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            new Array_SwapKthElementsSolution().swapKth(arr, n, k);
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java


class Array_SwapKthElementsSolution {
    void swapKth(int[] arr, int n, int k) {
        int temp = arr[k - 1];
        arr[k-1] = arr[n-k];
        arr[n-k] = temp;
    }

}

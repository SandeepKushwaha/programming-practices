package gfg.school;

/*
 *
 * problem : https://practice.geeksforgeeks.org/problems/find-index4752/1
 *
 * */

//{ Driver Code Starts
//Initial Template for Java

import java.util.Scanner;

public class Array_FindIndexOccurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int key = sc.nextInt();
            Array_FindIndexOccurrencesSolution ob = new Array_FindIndexOccurrencesSolution();
            int[] ar = ob.findIndex(arr, n, key);
            System.out.println(ar[0] + " " + ar[1]);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Array_FindIndexOccurrencesSolution {
    // Function to find starting and end index
    /*static*/ int[] findIndex(int[] a, int N, int key) {

        int[] result = {-1, -1};

        if (N > 0 && N <= 1_000_000) {
            // finds first index
            for (int i = 0; i < N; i++) {
                if (a[i] == key) {
                    result[0] = i;
                    break;
                }
            }

            // finds last index
            for (int i = N - 1; i >= 0; i--) {
                if (a[i] == key) {
                    result[1] = i;
                    break;
                }
            }
        }

        return result;
    }
}


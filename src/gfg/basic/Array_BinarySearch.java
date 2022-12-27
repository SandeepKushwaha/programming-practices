package gfg.basic;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * <a href="https://practice.geeksforgeeks.org/problems/binary-search-1587115620/1">problem page</a>
 */

//{ Driver Code Starts
// Initial Template for Java
public class Array_BinarySearch {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int key = sc.nextInt();
            Solution g = new Solution();
            System.out.println(g.binarysearch(arr, n, key));
            T--;
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    int binarysearch(int[] arr, int n, int key) {

        Arrays.sort(arr); // sorting array if array is unsorted

        // Case 1: by calling library class method.
        // int result = Arrays.binarySearch(arr, key);
        // return result < 0 ? -1 : result;

        // Case 2: by evaluating
        int low = 0;
        int high = n - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1; // zero fill right shift operator
            int midVal = arr[mid];

            if (midVal < key)
                low = mid + 1;
            else if (midVal > key)
                high = mid - 1;
            else
                return mid; // key found
        }
        return -(low + 1);  // key not found.
    }
}

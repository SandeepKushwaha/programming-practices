package gfg.school;

/*
*
* problem : https://practice.geeksforgeeks.org/problems/count-of-smaller-elements5947/1
*
* */

//{ Driver Code Starts
//Initial Template for Java


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Array_CountOfSmallerElements {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
        int t =
                Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {
            long n = Long.parseLong(br.readLine().trim());
            long[] a = new long[(int) (n)];
            // long getAnswer[] = new long[(int)(n)];
            String[] inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            long k = Long.parseLong(br.readLine().trim());

            Array_CountOfSmallerElementsCompute obj = new Array_CountOfSmallerElementsCompute();
            System.out.println(obj.countOfElements(a, n, k));

        }
    }
}


// } Driver Code Ends


//User function Template for Java


class Array_CountOfSmallerElementsCompute {
    public long countOfElements(long[] arr, long ignoredN, long x) {
        long count = 0;
        for (long item : arr) {
            if (item <= x) {
                count++;
            }
        }
        return count;
    }
}


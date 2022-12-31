package gfg.school;

/*
 *
 * problem : https://practice.geeksforgeeks.org/problems/print-the-left-element2009/1
 *
 * */

//{ Driver Code Starts
//Initial Template for Java

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Array_WhichIsLeftElement {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {
            long n = Long.parseLong(br.readLine().trim());
            long[] a = new long[(int) (n)];
            // long getAnswer[] = new long[(int)(n)];
            String[] inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }

            Array_WhichIsLeftElementSolution obj = new Array_WhichIsLeftElementSolution();
            System.out.println(obj.leftElement(a, n));

        }
    }
}


// } Driver Code Ends


//User function Template for Java


class Array_WhichIsLeftElementSolution {

    public long leftElement(long[] arr, long n) {
        Arrays.sort(arr);
        if (n % 2 == 0) {
            return arr[(int) (n / 2 - 1)];
        }
        return arr[(int) (n / 2)];
    }
}
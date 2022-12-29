package gfg.school;

/*
 *
 * problem : https://practice.geeksforgeeks.org/problems/at-least-two-greater-elements4625/1
 *
 * */

//{ Driver Code Starts
//Initial Template for Java

//Initial Template for Java

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Array_AtLeastTwoGreaterElements {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {

            long n = Integer.parseInt(br.readLine().trim());
            long[] a = new long[(int) (n)];

            String[] inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }

            Array_AtLeastTwoGreaterElementsSolution obj = new Array_AtLeastTwoGreaterElementsSolution();
            long[] answer = obj.findElements(a, n);
//            long sz = answer.length;

            StringBuilder output = new StringBuilder();
            for (long l : answer) {
                output.append(l).append(" ");
            }
            System.out.println(output);

        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Array_AtLeastTwoGreaterElementsSolution {
    public long[] findElements(long[] a, long n) {
        // Your code goes here
        Arrays.sort(a);
        long[] result = new long[(int) (n - 2)];
        System.arraycopy(a, 0, result, 0, result.length);
        return result;
    }
}


package gfg.school;

/*
*
* problem : https://practice.geeksforgeeks.org/problems/java-strings-set-15112/1
*
* */

//{ Driver Code Starts

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaString_Set1ConRevStr {
    public static void main(String[] args) throws IOException {
        BufferedReader read =
                new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S1 = read.readLine();
            String S2 = read.readLine();

            System.out.println(concatenateReverseString.concatenateReverse(S1, S2));
        }
    }
}

// } Driver Code Ends


// User function template for Java

class concatenateReverseString {
    static String concatenateReverse(String S1, String S2) {
        return new StringBuffer().append(S1).append(S2).reverse().toString();
    }
}
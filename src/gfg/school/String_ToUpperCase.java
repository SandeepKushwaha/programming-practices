package gfg.school;

/*
 *
 * problem : https://practice.geeksforgeeks.org/problems/lower-case-to-upper-case3410/1
 *
 * */

//{ Driver Code Starts
//Initial Template for Java

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class String_ToUpperCase {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine().trim());
        while (t-- > 0) {
            String str = read.readLine().trim();
            StringSolution ob = new StringSolution();
            System.out.println(ob.to_upper(str));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class StringSolution {
    String to_upper(String str) {
        // return str.toUpperCase();

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            int ch = str.charAt(i) - 97;
            char c = (char) (ch + 65);
            builder.append(c);
        }

        return builder.toString();
    }
}


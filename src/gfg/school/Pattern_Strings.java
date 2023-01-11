package gfg.school;

/*
 *
 * problem : https://practice.geeksforgeeks.org/problems/pattern-of-strings3829/1
 *
 * */

//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

public class Pattern_Strings {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();
            Pattern_StringsSolution ob = new Pattern_StringsSolution();
            ArrayList<String> result = ob.pattern(S);
            for (String value : result) {
                System.out.println(value);
            }
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Pattern_StringsSolution {
    ArrayList<String> pattern(String S) {
        ArrayList<String> results = new ArrayList<>();
        for (int i = 0; i < S.length(); i++) {
            results.add(S.substring(0, S.length() - i));
        }
        return results;
    }
}


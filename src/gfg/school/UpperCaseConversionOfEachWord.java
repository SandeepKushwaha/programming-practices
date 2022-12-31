package gfg.school;

/*
 *
 * problem : https://practice.geeksforgeeks.org/problems/upper-case-conversion5419/1
 *
 * */

//{ Driver Code Starts
//Initial Template for Java

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UpperCaseConversionOfEachWord {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String str = br.readLine();
            UpperCaseConversionOfEachWordSolution ob = new UpperCaseConversionOfEachWordSolution();
            System.out.println(ob.transform(str));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class UpperCaseConversionOfEachWordSolution {
    public String transform(String s) {
        // code here
        StringBuilder result = new StringBuilder();
        String[] words = s.split(" ");

        for (String word : words) {
            result.append(word.substring(0, 1).toUpperCase())
                    .append(word.substring(1))
                    .append(" ");
        }

        return result.toString();
    }
}

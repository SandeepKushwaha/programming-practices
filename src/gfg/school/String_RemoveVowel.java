package gfg.school;

/*
 *
 * problem : https://practice.geeksforgeeks.org/problems/remove-vowels-from-string1446/1
 *
 * */

//{ Driver Code Starts
//Initial Template for Java

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class String_RemoveVowel {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String s = read.readLine();

            RemoveVowelSolution ob = new RemoveVowelSolution();
            String result = ob.removeVowels(s);

            System.out.println(result);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class RemoveVowelSolution {
    String removeVowels(String S) {
        String result = "";

        if (S.length() > 0 && S.length() <= 100_000) {
            result = S.toLowerCase().replace("a", "");
            result = result.replace("e", "");
            result = result.replace("i", "");
            result = result.replace("o", "");
            result = result.replace("u", "");
        }

        return result;
    }
}

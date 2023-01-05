package gfg.school;

/*
 *
 * problem : https://practice.geeksforgeeks.org/problems/check-string1818/1
 *
 * */

//{ Driver Code Starts
//Initial Template for Java

import java.util.Scanner;

public class String_CheckCharsAllSame {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String s = sc.next();
            if (new StringAllCharSameSolution().check(s)) System.out.println("YES");
            else System.out.println("NO");
        }

    }
}
// Contributed By: Pranay Bansal

// } Driver Code Ends


//User function Template for Java

class StringAllCharSameSolution {
    Boolean check(String s) {
        // For checking all characters are same of not.
        if (s.length() > 0 && s.length() <= 100_000) {
            char[] chars = s.toCharArray();
            char first = chars[0];
            for (char ch: chars) {
                if (!(first == ch))
                    return Boolean.FALSE;
            }
        }

        return Boolean.TRUE;
    }
}
